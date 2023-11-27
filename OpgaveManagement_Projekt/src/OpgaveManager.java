import java.util.ArrayList;
import java.util.List;

public class OpgaveManager {

    private List<Opgave> opgaver = new ArrayList<>();

    public OpgaveManager(List<Opgave> opgaver) {
        this.opgaver = opgaver;
    }

    public Opgave addOpgave(Opgave opgave) {
        opgaver.add(opgave);
        return opgave;
    }

    public Opgave removeOpgave(Opgave opgave) {
        opgaver.remove(opgave);
        return opgave;
    }

    public boolean markerFærdigOpgave(Opgave opgave) {
        opgave.setFærdig(true);
        return true;
    }
}
