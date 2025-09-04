package spells;

import wizards.Wizard;

public class Expelliarmus implements SpellBehavior {
    @Override
    public void cast(Wizard caster, Wizard target) {
        String victim = (target != null ? target.getName() : "la víctima");
        System.out.println(caster.getName() + " grita Expelliarmus: " + victim + " suelta lo que sostiene.");
    }
}
