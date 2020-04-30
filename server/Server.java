package server;

import akka.actor.typed.ActorSystem;
import akka.actor.typed.javadsl.Adapter;
import akka.actor.typed.javadsl.Behaviors;
import akka.stream.ActorMaterializer;
import play.Application;
import play.ApplicationLoader;
import play.BuiltInComponentsFromContext;
import play.filters.components.HttpFiltersComponents;
import play.routing.Router;
import router.Routes;

public class Server implements ApplicationLoader {
    @Override
    public Application load(Context context) {
        return new Component(context).application();
    }

    static class Component extends BuiltInComponentsFromContext implements HttpFiltersComponents {
        private ActorSystem<Object> actorSystem = ActorSystem.create(Behaviors.empty(), "server");
        private ActorMaterializer actorMaterializer = ActorMaterializer.create(Adapter.toClassic(actorSystem));
        private event.github.Router eventGithub = new event.github.Router();
        private service.Router service = new service.Router(actorSystem, actorMaterializer);

        public Component(ApplicationLoader.Context context) {
            super(context);
        }

        @Override
        public Router router() {
            return new Routes(scalaHttpErrorHandler(), eventGithub, service).asJava();
        }
    }
}
