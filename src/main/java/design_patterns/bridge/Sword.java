package design_patterns.bridge;

public class Sword implements Weapon{

    private final Enchantment enchantment;

    public Sword(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void wield() {
        System.out.println("The sword is wielded.");
        enchantment.onActivate();
    }

    @Override
    public Enchantment getEnchantment() {
        return enchantment;
    }

    @Override
    public void swing() {
        System.out.println("The sword is swung.");
        enchantment.apply();
    }

    @Override
    public void unwield() {
        System.out.println("The sword is unwielded.");
        enchantment.onDeactivate();
    }
    
}
