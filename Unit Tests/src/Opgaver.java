import java.util.List;

public class Opgaver {

    /*Opgave 1: Grundlæggende test
    Skriv en JUnit-test for en simpel metode, f.eks. en metode, der tilføjer to tal.
    Sørg for at teste både positive og negative tal og sikre, at metoden returnerer de korrekte resultater.*/
    public int addTwoNumbers(int a, int b) {
        return a + b;
    }

    /*Opgave 2: Test af en liste
    Lav en JUnit-test for en metode, der søger efter et element i en liste.
    Test, om metoden returnerer den korrekte position for et eksisterende element og håndterer tilfælde, hvor elementet ikke findes i listen.*/
    public int elementInList(List<Integer> list, int target) {
        int index = -1;    // Lineær søgning
        int i = 0;
        while (index == -1 && i < list.size()) {
            int j = list.get(i);
            if (j == target) {
                index = i;
            } else {
                i++;
            }
        }
        return index;
    }

    /*Opgave 3: Binær søgning
    Implementer en metode til binær søgning i en sorteret liste af heltal.
    Metoden skal returnere indekset for målnummeret, hvis det findes, eller -1, hvis det ikke findes.
    Brug rekursiv eller iterativ tilgang.*/

    public int binarySearchList(List<Integer> list, int target) {
        int index = -1;
        int left = 0;
        int right = list.size() - 1;
        while (index == -1 && left <= right) {
            int middle = (left + right) / 2;
            int j = list.get(middle);
            if (j == target) {
                index = middle;
            } else {
                if (j < target) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            }
        }
        return index;
    }
}
