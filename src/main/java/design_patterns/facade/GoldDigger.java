package design_patterns.facade;

public class GoldDigger extends MineWorker{
    @Override
    public void work() {
        System.out.printf("%s digs for gold.\n", name());
    }

    @Override
    public String name() {
        return "gold digger";
    }
}
