import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.random;

public class Main {

    private static final String SPCHARS = "!@#$%^&*()_+{}[]|:;<>,.?/";
    private static final String Letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String Numbers = "0123456789";

    public static void main(String[] args) {


        Random random = new Random();

        //Taking i/p
        Scanner scan = new Scanner(System.in);

        System.out.print("Number of letter to be included :");
        int NoOFletters = scan.nextInt();

        System.out.println();

        System.out.print("Number of numbers to be included :");
        int NoOFnums = scan.nextInt();

        System.out.println();

        System.out.print("Number of Sp.Characters to be included :");
        int NoOFspecialChar = scan.nextInt();

        char [] password = new char[NoOFspecialChar + NoOFnums + NoOFletters];
        int LENGTH = NoOFspecialChar + NoOFnums + NoOFletters;

        for (int i = 0; i < NoOFspecialChar; i++) {
            password[i] = SPCHARS.charAt(random.nextInt(SPCHARS.length()));
        }
        for (int i = 0; i < NoOFletters; i++) {
            password[i+NoOFspecialChar] = Letters.charAt(random.nextInt(Letters.length()));
        }
        for (int i = 0; i < NoOFnums; i++) {
            password[i+NoOFletters+NoOFspecialChar] = Numbers.charAt(random.nextInt(Numbers.length()));
        }
        for (int i = LENGTH - 1; i >= 0; i--) {

            int j = random.nextInt(i + 1);

            // Swaping password[i]
            char temp = password[i];
            password[i] = password[j];
            password[j] = temp;
        }
        System.out.print("Your password is:");

        System.out.println(password);
    }
}
