package service;

import akka.stream.javadsl.Flow;
import play.libs.F;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.WebSocket;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class Router extends Controller {
    private SessionRegistry sessionRegistry = new SessionRegistry();

    public WebSocket index() {
        CompletionStage<F.Either<Result, Flow<String, String, ?>>> flow =
            CompletableFuture.supplyAsync(() -> F.Either.Right(Flow.fromFunction(msg -> {
                System.out.println("index::out -> ... '" + msg + "'");
                return msg;
            })));
        return WebSocket.Text.acceptOrResult(request -> sessionRegistry.newSession());
    }
}
