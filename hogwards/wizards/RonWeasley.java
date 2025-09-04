package wizards;

import spells.Expelliarmus;

public class RonWeasley extends Wizard {
    public RonWeasley() {
        super("Ron Weasley", new Expelliarmus());
    }

    @Override
    public void display() {
        System.out.println("Soy Ron, mi punto fuerte inicial es Expelliarmus.");
    }
}
