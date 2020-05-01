package service;

import akka.stream.javadsl.Flow;
import play.libs.F;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.WebSocket;

import java.util.concurrent.CompletionStage;

public class Router extends Controller {
    private SessionRegistry sessionRegistry = new SessionRegistry();

    public WebSocket index() {
        CompletionStage<F.Either<Result, Flow<String, String, ?>>> actor = sessionRegistry.newSession();
        return WebSocket.Text.acceptOrResult(request -> actor);
    }
}
