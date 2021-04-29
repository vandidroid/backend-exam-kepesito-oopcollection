package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {
    private int hitPoints;
    private int damage;
    private boolean hasArmor;

    public MilitaryUnit(int hitPoints, int damage, boolean hasArmor) {
        this.hitPoints = hitPoints;
        this.damage = damage;
        this.hasArmor = hasArmor;
    }

    public int doDamage() {
        return damage;
    }

    public int sufferDamage(int damage) {
        if (hasArmor) {
            damage = damage / 2;
        };

        hitPoints -= damage;

        return hitPoints;
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
