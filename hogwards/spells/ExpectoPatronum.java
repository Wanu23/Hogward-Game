package spells;

import wizards.Wizard;

public class ExpectoPatronum implements SpellBehavior {
    @Override
    public void cast(Wizard caster, Wizard target) {
        System.out.println(caster.getName() + " invoca Expecto Patronum: un guardián de luz repele la magia oscura.");
    }
}
