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

    public boolean sælgBilleter(){
        if (getAntalLedigePladser() > 0){
            antalLedigePladser--;
            antalBilletterSolgt++;
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
