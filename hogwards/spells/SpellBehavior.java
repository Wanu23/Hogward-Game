package spells;

import wizards.Wizard;

public interface SpellBehavior {
    void cast(Wizard caster, Wizard target);
}
