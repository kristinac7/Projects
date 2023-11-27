import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indtast beskrivelse af opgave: ");
        String beskrivelse = scanner.nextLine();

        System.out.println("Indtast deadline for opgave: ");
        LocalDate deadline = LocalDate.parse(scanner.nextLine());

        List<Opgave> opgaver = new ArrayList<>();

        Opgave opgave = new Opgave(beskrivelse, deadline);
        opgaver.add(opgave);
        OpgaveManager opgaveManager = new OpgaveManager(opgaver);
        System.out.println(opgave.getBeskrivelse() + opgave.getDeadline());

        System.out.println("Er opgaven færdig? (ja/nej)");
        String færdig = scanner.nextLine();
        if (færdig.equals("ja")) {
            opgaveManager.markerFærdigOpgave(opgave);
        }
        System.out.println(opgave.toString());

    }
}
