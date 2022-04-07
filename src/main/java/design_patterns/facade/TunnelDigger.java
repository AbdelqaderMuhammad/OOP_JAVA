package design_patterns.facade;

public class TunnelDigger extends MineWorker{
    @Override
    public void work() {
        System.out.printf("%s creates another promising tunnel.\n", name());
    }

    @Override
    public String name() {
        return "tunnel digger";
    }
}
