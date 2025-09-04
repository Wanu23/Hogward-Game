package spells;

import wizards.Wizard;

public class WingardiumLeviosa implements SpellBehavior {
    @Override
    public void cast(Wizard caster, Wizard target) {
        System.out.println(caster.getName() + " usa Wingardium Leviosa: hace levitar un objeto.");
    }
}
