package design_patterns.potion;

public class StrengthPotion implements Potion{
    @Override
    public void drink() {
        System.out.printf("You feel strong. (Potion= %s)\n", System.identityHashCode(this));
    }
}
