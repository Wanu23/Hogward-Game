import wizards.*;
import spells.*;

public class Demo {
    public static void main(String[] args) {
        Wizard harry = new HarryPotter();
        Wizard ron = new RonWeasley();
        Wizard hermione = new HermioneGranger();

        harry.display();
        ron.display();
        hermione.display();

        System.out.println("--- Juego inicia ---");
        harry.performSpell(null);        // Expecto Patronum
        ron.performSpell(harry);         // Expelliarmus contra Harry
        hermione.performSpell(null);     // Wingardium Leviosa

        System.out.println("--- Cambio de comportamiento en tiempo de ejecución ---");
        hermione.setSpellBehavior(new OculusReparo());
        hermione.performSpell(harry);

        ron.setSpellBehavior(new WingardiumLeviosa());
        ron.performSpell(null);

        harry.setSpellBehavior(new Expelliarmus());
        harry.performSpell(ron);
    }
}
