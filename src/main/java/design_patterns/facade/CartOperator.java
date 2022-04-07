package design_patterns.facade;

public class CartOperator extends MineWorker{
    @Override
    public void work() {
        System.out.printf("%s moves gold chunks out of the mine.\n", name());
    }

    @Override
    public String name() {
        return "cart operator";
    }
}
