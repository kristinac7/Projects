import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Biograf {

    List<Forestilling> forestillinger = new ArrayList<>();
    private BilletKø billetKø;

    public Biograf(List<Forestilling> forestillinger, BilletKø billetKø) {
        this.forestillinger = forestillinger;
        this.billetKø = billetKø;
    }

    public void betjenKunde(Kunde kunde){
        billetKø.enqueue(kunde);
    }

    public void billetSalg(Forestilling forestilling
    ){
        if (billetKø.size() > 0){
            Kunde kunde = (Kunde) billetKø.dequeue();
            forestilling.sælgBilleter();
            System.out.println("Billet solgt til kunde: " + kunde.getKundeId());
        } else {
            System.out.println("Der er ingen kunder i køen");
        }
    }

    public List<Forestilling> getForestillinger() {
        return new ArrayList<>();
    }
}
