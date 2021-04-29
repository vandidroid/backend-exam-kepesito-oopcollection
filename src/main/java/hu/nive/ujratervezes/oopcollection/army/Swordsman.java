package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit {
    private boolean hasShield = true;

    public Swordsman(boolean hasArmor) {
        super(100, 10, hasArmor);
    }

    @Override
    public int sufferDamage(int damage) {
        if (hasShield) {
            damage = 0;

            hasShield = false;
        }

        return super.sufferDamage(damage);
    }
}