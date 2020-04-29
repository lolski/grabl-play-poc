package server;

import play.ApplicationLoader;
import play.BuiltInComponentsFromContext;
import play.routing.Router;
import play.filters.components.HttpFiltersComponents;
import router.Routes;

public class Component extends BuiltInComponentsFromContext implements HttpFiltersComponents {

    public Component(ApplicationLoader.Context context) {
        super(context);
    }

    @Override
    public Router router() {
        event.github.Routes eventGithub = new event.github.Routes();
        return new Routes(scalaHttpErrorHandler(), eventGithub).asJava();
    }
}