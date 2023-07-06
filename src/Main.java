import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Message: ");
        String message = scan.nextLine();



        System.out.print("Type e to encrypt and d to decrypt: ");
        char pick = scan.next().charAt(0);



        System.out.println("Enter number of shifts: ");
        int shift = scan.nextInt();



        String encryptedMessage = "";

        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);

            int code = (int) c;

            if (pick == 'e') {
                code += shift;
                if (code > 'z') {
                    code -= 26;
                }
            } else if (pick == 'd') {
                code -= shift;
                if (code < 'a') {
                    code += 26;
                }
            } else {
                System.out.println("Invalid!!!!!" +" "+
                        "Sahi se likhna broo ");
                return;
            }

            encryptedMessage += (char) code;
        }

        System.out.println("Encrypted message: " + encryptedMessage);
    }
}










