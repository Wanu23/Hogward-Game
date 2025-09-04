package wizards;

import spells.SpellBehavior;

public abstract class Wizard {
    private final String name;
    private SpellBehavior spellBehavior;

    protected Wizard(String name, SpellBehavior defaultSpell) {
        this.name = name;
        this.spellBehavior = defaultSpell;
    }

    public String getName() {
        return name;
    }

    public void performSpell(Wizard target) {
        if (spellBehavior == null) {
            System.out.println(name + " no tiene ningún hechizo configurado en este momento.");
            return;
        }
        spellBehavior.cast(this, target);
    }

    public void setSpellBehavior(SpellBehavior spellBehavior) {
        this.spellBehavior = spellBehavior;
    }

    public abstract void display();
}
