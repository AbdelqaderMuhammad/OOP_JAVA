package design_patterns.chainOfResponsibility;

public class OrcKing {

    private RequestHandler chain;

    public OrcKing() {
        buildChain();
    }

    public void buildChain() {
        chain = new OrcCommander(new OrcOfficer(new OrcSoldier(null)));
    }

    public void makeRequest(Request req) {
        chain.handleRequest(req);
    }


}
