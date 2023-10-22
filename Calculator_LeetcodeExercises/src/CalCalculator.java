import java.util.Scanner;

public class CalCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Indtast antal kcal per 100g: ");
        int kcalPer100g = scanner.nextInt();

        System.out.print("Indtast antal gram indtaget: ");
        double gramIndtaget = scanner.nextDouble();

        System.out.print("Kalorier indtaget er: " + gramIndtaget/100.0 * kcalPer100g);
    }
}