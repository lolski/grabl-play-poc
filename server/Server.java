package server;

import play.Application;
import play.ApplicationLoader;

public class Server implements ApplicationLoader {
    @Override
    public Application load(Context context) {
        return new Component(context).application();
    }
}
