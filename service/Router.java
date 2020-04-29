package service;

import akka.actor.ActorRef;
import akka.actor.typed.ActorSystem;
import akka.actor.typed.Behavior;
import akka.actor.typed.javadsl.AbstractBehavior;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Adapter;
import akka.actor.typed.javadsl.Behaviors;
import akka.actor.typed.javadsl.Receive;
import akka.stream.Materializer;
import play.libs.streams.ActorFlow;
import play.mvc.Controller;
import play.mvc.WebSocket;

public class Router extends Controller {
    private ActorSystem<Object> actorSystem;
    private Materializer materializer;

    public Router(ActorSystem<Object> actorSystem, Materializer materializer) {
        this.actorSystem = actorSystem;
        this.materializer = materializer;
    }

    public WebSocket index() {
        return WebSocket.Text.accept(request ->
                ActorFlow.actorRef(out ->
                        Adapter.props(() -> Session.create(out)),
                        Adapter.toClassic(this.actorSystem),
                        materializer
                )
        );
    }

    public static class Session extends AbstractBehavior<Object> {
        private final ActorRef out;

        public static Behavior<Object> create(ActorRef out) {
            return Behaviors.setup(ctx -> new Session(out, ctx));
        }

        private Session(ActorRef out, ActorContext<Object> context) {
            super(context);
            this.out = out;
        }

        @Override
        public Receive<Object> createReceive() {
            return newReceiveBuilder()
                    .onMessage(String.class, msg -> {
                        System.out.printf("henlo");
                        out.tell("henlo", Adapter.toClassic(this.getContext().getSelf()));
                        return this;
                    }).build();
        }
    }
}
