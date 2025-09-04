package wizards;

import spells.WingardiumLeviosa;

public class HermioneGranger extends Wizard {
    public HermioneGranger() {
        super("Hermione Granger", new WingardiumLeviosa());
    }

    @Override
    public void display() {
        System.out.println("Soy Hermione, experta en Wingardium Leviosa, pero puedo cambiar de hechizo.");
    }
}
