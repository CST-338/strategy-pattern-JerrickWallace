package Abilities;

import Monsters.Monster;

/**
 * Represents a melee attack ability that can be used by a monster.
 * A melee attack calculates damage based on the attacker's strength
 * and the target's defense.
 */

public class MeleeAttack implements Attack {

    /**
     * The monster performing the melee attack.
     */

    Monster attacker;

    /**
     * Constructs a MeleeAttack with the specified attacker.
     *
     * @param attacker the monster performing the melee attack
     */

    public MeleeAttack (Monster attacker) {
        this.attacker = attacker;
    }

    /**
     * Performs a melee attack on the specified target monster.
     * The damage dealt is calculated as the attacker's strength minus the target's defense.
     *
     * @param target the target monster to attack
     * @return the amount of damage dealt to the target monster
     */

    @Override
    public Integer attack(Monster target) {
        String message = attacker + " uses a melee attack on " + target;
        System.out.println(message);
        return attacker.getStrength() - target.getDefense();
    }
}

