package wizards;

import spells.ExpectoPatronum;

public class HarryPotter extends Wizard {
    public HarryPotter() {
        super("Harry Potter", new ExpectoPatronum());
    }

    @Override
    public void display() {
        System.out.println("Soy Harry, especializado inicialmente en Expecto Patronum.");
    }
}
