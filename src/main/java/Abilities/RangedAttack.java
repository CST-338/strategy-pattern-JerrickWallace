package Abilities;

import Monsters.Monster;

/**
 * Represents a ranged attack ability that can be used by a monster.
 * A ranged attack calculates damage based on the attacker's agility
 * and the target's agility.
 */

public class RangedAttack implements Attack {

    /**
     * The monster performing the ranged attack.
     */

    Monster attacker;

    /**
     * Constructs a RangedAttack with the specified attacker.
     *
     * @param attacker the monster performing the ranged attack
     */

    public RangedAttack (Monster attacker) {
        this.attacker = attacker;
    }

    /**
     * Performs a ranged attack on the specified target monster.
     * The damage dealt is calculated as the attacker's agility minus the target's agility.
     *
     * @param target the target monster to attack
     * @return the amount of damage dealt to the target monster
     */

    @Override
    public Integer attack(Monster target) {
        String message = attacker + " uses a ranged attack on " + target;
        System.out.println(message);
        return attacker.getAgility() - target.getAgility();
    }
}
