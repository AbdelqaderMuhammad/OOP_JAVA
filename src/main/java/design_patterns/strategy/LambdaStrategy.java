package design_patterns.strategy;

public class LambdaStrategy {

    public enum Strategy implements DragonSlayingStrategy {

        MeleeStrategy(() -> System.out.println("With your Excalibur you severe the dragon's head!")),
        ProjectileStrategy(() -> System.out.println("You shoot the dragon with the magical crossbow and it falls dead on the ground!")),
        SpellStrategy(() -> System.out.println("You cast the spell of disintegration and the dragon vaporizes in a pile of dust!"));

        private final DragonSlayingStrategy strategy ;

        Strategy(DragonSlayingStrategy strategy) {
            this.strategy = strategy;
        }

        @Override
        public void execute() {
            strategy.execute();
        }
    }

}
