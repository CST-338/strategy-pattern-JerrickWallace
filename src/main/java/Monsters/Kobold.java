package Monsters;

import Abilities.MeleeAttack;
import Abilities.RangedAttack;

import java.util.HashMap;

/**
 * Represents a Kobold, a type of Monster with specific attributes and a ranged attack.
 */

public class Kobold extends Monster {

    /**
     * Constructs a Kobold with the specified maximum HP, experience points, and items.
     *
     * @param maxHP the maximum HP of the Kobold
     * @param xp the experience points of the Kobold
     * @param items the items carried by the Kobold
     */
    public Kobold(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        super(maxHP, xp, items);

        Integer maxStr = 15;
        Integer maxDef = 6;
        Integer maxAgi = 3;

        attack = new RangedAttack(this);

        str = super.getAttribute(str, maxStr);
        def = super.getAttribute(def, maxDef);
        agi = super.getAttribute(agi, maxAgi);
    }

    /**
     * Returns a string representation of the Kobold, including its type and HP status.
     *
     * @return a string representation of the Kobold
     */

    @Override
    public String toString() {
        return "Monsters.Kobold has : " + super.toString();
    }
}
