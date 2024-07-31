package Monsters;

import Abilities.MeleeAttack;

import java.util.HashMap;

/**
 * Represents an Imp, a type of Monster with specific attributes and a melee attack.
 */

public class Imp extends Monster {

    /**
     * Constructs an Imp with the specified maximum HP, experience points, and items.
     *
     * @param maxHP the maximum HP of the Imp
     * @param xp the experience points of the Imp
     * @param items the items carried by the Imp
     */
    public Imp(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        super(maxHP, xp, items);

        Integer maxStr = 15;
        Integer maxDef = 6;
        Integer maxAgi = 3;

        attack = new MeleeAttack(this);

        str = super.getAttribute(str, maxStr);
        def = super.getAttribute(def, maxDef);
        agi = super.getAttribute(agi, maxAgi);
    }

    /**
     * Returns a string representation of the Imp, including its type and HP status.
     *
     * @return a string representation of the Imp
     */

    @Override
    public String toString() {
        return "Monsters.Imp has : " + super.toString();
    }
}
