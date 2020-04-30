package service;

import akka.actor.typed.Behavior;
import akka.actor.typed.javadsl.AbstractBehavior;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Behaviors;
import akka.actor.typed.javadsl.Receive;

public class Session extends AbstractBehavior<Object> {
    public Behavior<Object> create() {
        return Behaviors.setup(Session::new);
    }

    private Session(ActorContext<Object> context) {
        super(context);
    }

    @Override
    public Receive<Object> createReceive() {
        return null;
    }
}
