package design_patterns.chainOfResponsibility;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RequestHandler {

    private final RequestHandler next;

    public void handleRequest(Request request) {
        if (request != null) {
            next.handleRequest(request);
        }
    }

    protected void printHandling(Request request) {
        System.out.printf("%s handling request %s%n", this, request);
    }

    @Override
    public String toString() {
        return null;
    }
}
