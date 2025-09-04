package spells;

import wizards.Wizard;

public class OculusReparo implements SpellBehavior {
    @Override
    public void cast(Wizard caster, Wizard target) {
        String who = (target != null ? target.getName() : caster.getName());
        System.out.println(caster.getName() + " lanza Oculus Reparo: los anteojos de " + who + " quedan como nuevos.");
    }
}

