package lesson17.task8;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        // Write function(request, String) using functional interface
        // Returned String: {Received request: Message - [text], sender - [id]}
        // Write method(request, this function) and output result in console

        Function<Request, String> function = x -> String.format("Received request: Message - %s, sender - %d",
                x.getMessage(), x.getSenderId());

        print(new Request("App is not work", 123057), function);
        print(new Request("OMG", 999157), function);
    }

    public static void print(Request request, Function<Request, String> function) {
        System.out.println(function.apply(request));
    }
}
