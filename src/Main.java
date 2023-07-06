import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Message: ");
        String message = scan.nextLine();

        System.out.println();

        System.out.print("Type e to encrypt and d to decrypt: ");
        char pick = scan.next().charAt(0);

        System.out.println();

        System.out.println("Enter number of shifts: ");
        int shift = scan.nextInt();

        System.out.println();

        String encryptedMessage = "";

        for (int i = 0; i < message.length(); i++) {

            char c = message.charAt(i);

            if (pick == 'e') {
                c+=shift;
                if(c>'z') c-=26;
                encryptedMessage +=c;
            } else if (pick == 'd') {
                c-=shift;
                if(c<'a') c+=26;
                encryptedMessage += c;
            } else {
                System.out.println("Invalid input. Please enter 'e' or 'd'.");
                return;
            }

        }

        System.out.println("Encrypted message: " + encryptedMessage);
    }

}










