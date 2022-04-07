package design_patterns.factory;

public class App {

    public static void main(String[] args) {
        var coin1 = CoinFactory.getCoin(CoinType.COPPER);
        var coin2 = CoinFactory.getCoin(CoinType.GOLD);

        System.out.println("coin1 = " + coin1.getDescription() + ", its class is " + coin1.getClass());
        System.out.println("coin2 = " + coin2.getDescription() + ", its class is " + coin2.getClass());
    }
}
