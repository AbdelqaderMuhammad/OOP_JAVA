package design_patterns.bridge;

public interface Weapon {

    Enchantment getEnchantment();
    void swing();
    void wield();
    void unwield();

}
