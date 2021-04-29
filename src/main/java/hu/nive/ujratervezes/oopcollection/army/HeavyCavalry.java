package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit {
    private boolean firstAttack = true;

    public HeavyCavalry() {
        super(150,  20, true);
    }

    @Override
    public int doDamage() {


        if (firstAttack) {
            firstAttack = false;

            return 3 * super.doDamage();
        }

        return super.doDamage();
    }
}