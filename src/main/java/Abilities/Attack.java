package Abilities;

import Monsters.Monster;

/**
 * Represents an attack ability that can be used by a monster.
 * An attack ability allows a monster to attack another monster.
 */

public interface Attack extends Ability {

    /**
     * Performs an attack on the specified target monster.
     *
     * @param monster the target monster to attack
     * @return the amount of damage dealt to the target monster
     */
    public abstract Integer attack(Monster monster);
}
