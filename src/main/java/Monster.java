import java.util.HashMap;
import java.util.Objects;

public abstract class Monster {
    private final Integer hp = 0;
    private final Integer xp = 10;
    private final Integer maxHP = 0;
    private HashMap<String, Integer> items;

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {

    }

    public Integer getXp() {
        return xp;
    }

    public Integer getMaxHP() {
        return maxHP;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monster monster = (Monster) o;
        return Objects.equals(hp, monster.hp) && Objects.equals(xp, monster.xp) && Objects.equals(maxHP, monster.maxHP) && Objects.equals(items, monster.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hp, xp, maxHP, items);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " has: hp=" + hp + "/" + maxHP;
    }
}
