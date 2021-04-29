package hu.nive.ujratervezes.oopcollection.army;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Army {
    private List<MilitaryUnit> militaryUnits = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit) {
        militaryUnits.add(militaryUnit);
    }

    public void damageAll(int damage) {
        for (MilitaryUnit militaryUnit: militaryUnits) {
            militaryUnit.sufferDamage(damage);
        }

        militaryUnits = militaryUnits.stream().filter(militaryUnit -> militaryUnit.getHitPoints()>25).collect(Collectors.toList());
    }

    public int getArmyDamage() {
        int result = 0;

        for (MilitaryUnit militaryUnit: militaryUnits) {
            result += militaryUnit.doDamage();
        }

        return result;
    }

    public int getArmySize() {
        return militaryUnits.size();
    }
}