package design_patterns.chainOfResponsibility;

public class OrcOfficer extends RequestHandler{
    public OrcOfficer(RequestHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.TORTURE_PRISONER) {
            printHandling(request);
            request.makeHandled();
        } else {
            super.handleRequest(request);
        }
    }

    @Override
    public String toString() {
        return "Orc officer";
    }


}
