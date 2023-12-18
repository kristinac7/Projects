import java.util.ArrayList;
import java.util.List;

public class Forestilling {

    private int forestillingsId;
    private int antalLedigePladser;
    private int antalBilletterSolgt;

    public Forestilling(int forestillingsId, int antalLedigePladser) {
        this.forestillingsId = forestillingsId;
        this.antalLedigePladser = antalLedigePladser;
    }

    public boolean sælgBilleter(Forestilling forestilling){
        if (forestilling.getAntalLedigePladser() > 0){
            forestilling.antalLedigePladser--;
            forestilling.antalBilletterSolgt++;
        } else {
            System.out.println("Der er ikke flere ledige pladser");
            return false;
        }
        return true;
    }

    public int getAntalBilletterSolgt(){
        return antalBilletterSolgt;
    }

    public int getForestillingsId() {
        return forestillingsId;
    }

    public int getAntalLedigePladser() {
        return antalLedigePladser;
    }
}
