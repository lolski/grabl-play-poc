package server;

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
        public Component(ApplicationLoader.Context context) {
            super(context);
        }

        @Override
        public Router router() {
            event.github.Router eventGithub = new event.github.Router();
            return new Routes(scalaHttpErrorHandler(), eventGithub).asJava();
        }
    }
}
