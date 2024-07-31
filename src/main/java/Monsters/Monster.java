package Monsters;

import Abilities.Attack;

import java.util.HashMap;
import java.util.Objects;
import java.util.Random;

/**
 * Represents an abstract Monster with various attributes and abilities.
 * This class serves as a base class for specific monsters.
 * @author Jerrick Wallace
 */

public abstract class Monster {
    private Integer hp = 0;
    private Integer xp = 10;
    private Integer maxHP = 0;
    private HashMap<String, Integer> items;
     Integer agi = 10;
     Integer def = 10;
     Integer str = 10;
     Attack attack;

    /**
     * Constructs a Monster with specified maximum HP, XP, and items.
     *
     * @param maxHP the maximum health points of the monster
     * @param xp the experience points of the monster
     * @param items a HashMap of items with their corresponding quantities
     */

    public Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        this.maxHP = maxHP;
        hp = this.maxHP;
        this.xp = xp;
        this.items = items;
    }

    /**
     * Attacks a target monster.
     *
     * @param target the target monster to attack
     * @return true if the target monster is still alive after the attack, false otherwise
     */

    public boolean attackTarget(Monster target) {
        if (attack != null) {
            int damage = attack.attack(target);
            return target.takeDamage(damage);
        }

        return false;
    }

    /**
     * Takes damage and updates the monster's HP.
     *
     * @param damage the amount of damage taken
     * @return true if the monster is still alive, false otherwise
     */

    boolean takeDamage(Integer damage) {
        if (damage > 0) {
            hp -= damage;
            System.out.println("The creature was hit for " + damage + " damage");

            if (hp <= 0) {
                System.out.println("Oh no! the creature has perished");
            }
        }

        System.out.println(this.toString());

        return hp > 0;

    }

    /**
     * Gets the current HP of the monster.
     *
     * @return the current HP of the monster
     */



    public Integer getHp() {
        return hp;
    }

    /**
     * Sets the HP of the monster.
     *
     * @param hp the HP to set
     */

    public void setHp(Integer hp) {
        this.hp = hp;

    }

    /**
     * Gets the XP of the monster.
     *
     * @return the XP of the monster
     */

    public Integer getXp() {
        return xp;
    }

    /**
     * Gets the maximum HP of the monster.
     *
     * @return the maximum HP of the monster
     */

    public Integer getMaxHP() {
        return maxHP;
    }

    /**
     * Gets the items of the monster.
     *
     * @return a HashMap of items with their corresponding quantities
     */

    public HashMap<String, Integer> getItems() {
        return items;
    }

    /**
     * Sets the items of the monster.
     *
     * @param items a HashMap of items with their corresponding quantities
     */

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    /**
     * Gets the agility of the monster.
     *
     * @return the agility of the monster
     */

    public Integer getAgility() {
        return agi;
    }

    /**
     * Gets the defense of the monster.
     *
     * @return the defense of the monster
     */

    public Integer getDefense() {
        return def;
    }

    /**
     * Gets the strength of the monster.
     *
     * @return the strength of the monster
     */

    public Integer getStrength() {
        return str;
    }

    /**
     * Gets a random attribute value between the specified minimum and maximum.
     *
     * @param min the minimum value
     * @param max the maximum value
     * @return a random attribute value between min and max
     */

    Integer getAttribute(Integer min, Integer max) {
        Random rand = new Random();
        if(min > max) {
            Integer temp = min;
            min = max;
            max = temp;
        }

        return rand.nextInt(max - min) + min;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monster monster = (Monster) o;
        return Objects.equals(hp, monster.hp) && Objects.equals(xp, monster.xp) && Objects.equals(maxHP, monster.maxHP) && Objects.equals(items, monster.items) && Objects.equals(agi,monster.agi) && Objects.equals(def,monster.def) && Objects.equals(str,monster.str) && Objects.equals(attack, monster.attack);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(hp);
        result = 31 * result + Objects.hash(xp);
        result = 31 * result + Objects.hash(maxHP);
        result = 31 * result + Objects.hash(items);
        result = 31 * result + Objects.hash(agi);
        result = 31 * result + Objects.hash(def);
        result = 31 * result + Objects.hash(str);
        result = 31 * result + Objects.hash(attack);
        return result;
    }

    @Override
    public String toString() {
        return hp + "/" + maxHP;
    }
}
