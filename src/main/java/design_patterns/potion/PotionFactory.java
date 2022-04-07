package design_patterns.potion;

import java.util.EnumMap;
import java.util.Map;

/**
 * PotionFactory is the Flyweight in this example. It minimizes memory use by sharing object
 * instances. It holds a map of potion instances and new potions are created only when none of the
 * type already exists.
 */
public class PotionFactory {

    private final Map<PotionType, Potion> potions;

    public PotionFactory() {
        potions = new EnumMap<PotionType, Potion>(PotionType.class);
    }

    public Potion createPotion(PotionType type) {
        var potion = potions.get(type);
        switch (type) {
            case HEALING:
                potion = new HealingPotion();
                potions.put(type, potion);
                break;
            case STRENGTH:
                potion = new StrengthPotion();
                potions.put(type, potion);
                break;
            default:
                break;
        }
        return potion;
    }
}