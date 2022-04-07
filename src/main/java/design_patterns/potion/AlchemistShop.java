package design_patterns.potion;

import java.util.List;


/**
 * AlchemistShop holds potions on its shelves. It uses PotionFactory to provide the potions.
 */
public class AlchemistShop {

    private final List<Potion> topShelf;
    private final List<Potion> bottomShelf;

    public AlchemistShop() {
        var factory = new PotionFactory();
        topShelf = List.of(
                factory.createPotion(PotionType.HEALING),
                factory.createPotion(PotionType.STRENGTH),
                factory.createPotion(PotionType.HEALING));
        bottomShelf = List.of(
                factory.createPotion(PotionType.STRENGTH));
    }

    /**
     * Get a read-only list of all the items on the top shelf.
     *
     * @return The top shelf potions
     */
    public final List<Potion> getTopShelf(){
        return List.copyOf(this.topShelf);
    }

    /**
     * Get a read-only list of all the items on the bottom shelf.
     *
     * @return The bottom shelf potions
     */
    public final List<Potion> getBottomShelf() {
        return List.copyOf(this.bottomShelf);
    }

    /**
     * Drink all the potions.
     */
    public void drinkPotions(){
        System.out.println("Drinking top shelf potions");
        topShelf.forEach(Potion::drink);
        System.out.println("Drinking bottom shelf potions");
        bottomShelf.forEach(Potion::drink);
    }
}
