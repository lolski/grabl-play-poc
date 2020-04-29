package server;

import play.ApplicationLoader;
import play.BuiltInComponentsFromContext;
import play.routing.Router;
import play.filters.components.HttpFiltersComponents;

public class Component extends BuiltInComponentsFromContext implements HttpFiltersComponents {

    public Component(ApplicationLoader.Context context) {
        super(context);
    }

    @Override
    public Router router() {
        return Router.empty();
    }
}