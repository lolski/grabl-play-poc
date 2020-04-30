package service;

import akka.actor.typed.ActorRef;
import akka.actor.typed.Behavior;
import akka.actor.typed.javadsl.AbstractBehavior;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Behaviors;
import akka.actor.typed.javadsl.Receive;
import akka.stream.javadsl.Flow;
import play.libs.F;
import play.mvc.Result;

import java.util.Map;

public class Session extends AbstractBehavior<Object> {
    public static Behavior<Object> create() {
        return Behaviors.setup(Session::new);
    }

    private Session(ActorContext<Object> context) {
        super(context);
    }

    @Override
    public Receive<Object> createReceive() {
        return newReceiveBuilder()
                .onMessage(Map.Entry.class, this::onMapEntry)
                .build();
    }

    private Behavior<Object> onMapEntry(Map.Entry<String, ActorRef<Object>> msg) {
        F.Either<Result, Flow<String, String, ?>> x = F.Either.Right(Flow.fromFunction(f -> {
            System.out.println("Flow.fromFunction");
            return "onMapEntry";
        }));
        msg.getValue().tell(x);
        return this;
    }
}
