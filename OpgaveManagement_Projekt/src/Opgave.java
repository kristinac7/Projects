import java.time.LocalDate;
import java.util.Date;

public class Opgave {

    private String beskrivelse;
    private LocalDate deadline;
    private boolean færdig;

    public Opgave(String beskrivelse, LocalDate deadline) {
        this.beskrivelse = beskrivelse;
        this.deadline = deadline;
        this.færdig = false;
    }

    @Override
    public String toString() {
        return "Opgave: " + beskrivelse +
                ", deadline: " + deadline +
                ", færdig: " + færdig;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public boolean isFærdig() {
        return færdig;
    }

    public void setFærdig(boolean færdig) {
        this.færdig = true;
    }
}
