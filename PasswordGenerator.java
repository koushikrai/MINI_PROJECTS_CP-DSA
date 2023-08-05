import java.util.Random;

public classPasswordGenerator {

    private static final String LETTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()";

    public static String generatePassword(int length) {
        String password = "";
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            char character;
            int type = random.nextInt(3);

            if (type == 0) {
                character = LETTERS.charAt(random.nextInt(LETTERS.length()));
            } else if (type == 1) {
                character = NUMBERS.charAt(random.nextInt(NUMBERS.length()));
            } else {
                character = SPECIAL_CHARACTERS.charAt(random.nextInt(SPECIAL_CHARACTERS.length()));
            }

            password += character;
        }

        return password;
    }

    public static void main(String[] args) {
        String password = generatePassword(10);
        System.out.println("Your password is: " + password);
    }
}

