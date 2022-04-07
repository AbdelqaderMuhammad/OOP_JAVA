package design_patterns.potion;

public class HealingPotion implements Potion{
    @Override
    public void drink() {
        System.out.printf("You feel healed. (Potion= %s )\n", System.identityHashCode(this));
    }
}
