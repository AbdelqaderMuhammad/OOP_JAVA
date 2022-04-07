package design_patterns.strategy;


/**
 * <p>The Strategy pattern (also known as the policy pattern) is a software design pattern that
 * enables an algorithm's behavior to be selected at runtime.</p>
 *
 * <p>Before Java 8 the Strategies needed to be separate classes forcing the developer
 * to write lots of boilerplate code. With modern Java, it is easy to pass behavior
 * with method references and lambdas making the code shorter and more readable.</p>
 *
 * <p>In this example ({@link DragonSlayingStrategy}) encapsulates an algorithm. The containing
 * object ({@link DragonSlayer}) can alter its behavior by changing its strategy.</p>
 */


public class App {

    private static final String RED_DRAGON_EMERGES = "Red dragon emerges.";
    private static final String GREEN_DRAGON_SPOTTED = "Green dragon spotted ahead!";
    private static final String BLACK_DRAGON_LANDS = "Black dragon lands before you.";


    public static void main(String[] args) {

        System.out.println("GREEN_DRAGON_SPOTTED");
        var dragonSlayer = new DragonSlayer(new MeleeStrategy());
        dragonSlayer.goToBattle();
        System.out.println("RED_DRAGON_EMERGES");
        dragonSlayer.changeStrategy(new ProjectileStrategy());
        dragonSlayer.goToBattle();
        System.out.println("BLACK_DRAGON_LANDS");
        dragonSlayer.changeStrategy(new SpellStrategy());
        dragonSlayer.goToBattle();


        // Java 8 functional implementation Strategy pattern
        System.out.println("GREEN_DRAGON_SPOTTED");
        dragonSlayer = new DragonSlayer(() -> System.out.println("With your Excalibur you severe the dragon's head!"));
        dragonSlayer.goToBattle();
        System.out.println("RED_DRAGON_EMERGES");
        dragonSlayer.changeStrategy(() -> {
            System.out.println("You shoot the dragon with the magical crossbow and it falls dead on the ground!");
        });
        System.out.println("BLACK_DRAGON_LANDS");
        dragonSlayer.changeStrategy(() -> {
            System.out.println("You cast the spell of disintegration and the dragon vaporizes in a pile of dust!");
        });


        // Java 8 lambda implementation with enum Strategy pattern
        System.out.println("GREEN_DRAGON_SPOTTED");
        dragonSlayer.changeStrategy(LambdaStrategy.Strategy.MeleeStrategy);
        dragonSlayer.goToBattle();
        System.out.println("RED_DRAGON_EMERGES");
        dragonSlayer.changeStrategy(LambdaStrategy.Strategy.ProjectileStrategy);
        dragonSlayer.goToBattle();
        System.out.println("BLACK_DRAGON_LANDS");
        dragonSlayer.changeStrategy(LambdaStrategy.Strategy.SpellStrategy);
        dragonSlayer.goToBattle();

    }

}
