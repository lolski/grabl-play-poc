package service;

import akka.actor.typed.ActorRef;
import akka.actor.typed.ActorSystem;
import akka.actor.typed.Behavior;
import akka.actor.typed.javadsl.AbstractBehavior;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Adapter;
import akka.actor.typed.javadsl.AskPattern;
import akka.actor.typed.javadsl.Behaviors;
import akka.actor.typed.javadsl.Receive;
import akka.stream.ActorMaterializer;
import akka.stream.javadsl.Flow;
import play.libs.F;
import play.mvc.Result;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletionStage;

public class SessionRegistry {
    private ActorSystem<Object> rootExecutorRef = ActorSystem.create(Executor.create(), "session-registry");

    public CompletionStage<F.Either<Result, Flow<String, String, ?>>> newSession() {
        return AskPattern.ask(rootExecutorRef, replyTo -> new HashMap.SimpleImmutableEntry<>("AskPattern.ask", replyTo), Duration.ZERO, rootExecutorRef.scheduler());
    }

    public static class Executor extends AbstractBehavior<Object> {
        public static Behavior<Object> create() {
            return Behaviors.setup(Executor::new);
        }

        private Executor(ActorContext<Object> context) {
            super(context);
        }

        @Override
        public Receive<Object> createReceive() {
            return newReceiveBuilder()
                    .onMessage(Map.Entry.class, this::onMapEntry)
                    .build();
        }

        private Behavior<Object> onMapEntry(Map.Entry<String, ActorRef<Object>> m) {
            System.out.println("onMapEntry");
            F.Either<Result, Flow<String, String, ?>> x = F.Either.Right(Flow.fromFunction(f -> {
                System.out.println("Flow.fromFunction");
                return "onMapEntry";
            }));
            m.getValue().tell(x);
            return this;
        }
    }
}
