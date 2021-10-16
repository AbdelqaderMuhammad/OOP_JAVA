package dependency_Injection;

public class main {

    public static void main(String[] args) {
        Server server = new Server_B();
        Client client = new Client_A(server);
        client.do_something_by();

        //////////////////////////////////////////

        Server S = new Server_C();
        Client A = new Client_A();
        ((Client_A) A).setServer(S);
        A.do_something_by();

    }
}
