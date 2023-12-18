import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Forestilling forestilling1 = new Forestilling(1, 20);
        Forestilling forestilling2 = new Forestilling(2, 20);

        List<Forestilling> forestillinger = new ArrayList<>();
        forestillinger.add(forestilling1);
        forestillinger.add(forestilling2);

        BilletKø billetKø = new BilletKø(10);

        Biograf biograf = new Biograf(forestillinger, billetKø);

        Kunde kunde1 = new Kunde(1);
        Kunde kunde2 = new Kunde(2);
        Kunde kunde3 = new Kunde(3);

        biograf.betjenKunde(kunde1);
        biograf.betjenKunde(kunde2);
        biograf.betjenKunde(kunde3);

        biograf.billetSalg();
        biograf.billetSalg();
        biograf.billetSalg();
        biograf.billetSalg();

        System.out.println("Antal billetter solgt: " + forestilling1.getAntalBilletterSolgt());




    }


}
