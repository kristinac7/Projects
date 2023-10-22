import java.util.Random;

public class Password_Generator {

    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*_=+-/.?<>)";
    private static final String ALL = LOWERCASE + UPPERCASE + NUMBERS + SYMBOLS;
    private static final int LENGTH = 12;

    public String generatePassword(){
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < LENGTH; i++) { // for loop to generate a random password
            password.append(ALL.charAt(random.nextInt(ALL.length()))); // random.nextInt(ALL.length()) returns a random number between 0 and ALL.length()
        }
        return password.toString();

    }

    public static void main(String[] args) {
        Password_Generator password_generator = new Password_Generator();
        System.out.println(password_generator.generatePassword());
    }
}