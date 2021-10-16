package dependency_Injection;

public class Client_A implements Client{

    Server server;

    // constructor injection
    public Client_A(Server server) {
        this.server = server;
    }

    public Client_A() {

    }

    // OR

    // setter injection
    public void setServer(Server server) {
        this.server = server;
    }

    @Override
    public void do_something_by() {
        System.out.println(server.get_info());
        System.out.println();
    }
}
