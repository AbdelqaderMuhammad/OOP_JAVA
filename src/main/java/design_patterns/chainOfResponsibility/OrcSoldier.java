package design_patterns.chainOfResponsibility;

public class OrcSoldier extends RequestHandler{
    public OrcSoldier(RequestHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.COLLECT_TAX) {
            printHandling(request);
            request.makeHandled();
        } else {
            super.handleRequest(request);
        }
    }

    @Override
    public String toString() {
        return "Orc solider";
    }

}
