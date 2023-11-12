import java.sql.SQLOutput;
import java.util.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

public class MorseCode {

                                                                            // function for English to Morse code conversion
    public static void ENGtoMORSE(int choice) {
        Scanner sc = new Scanner(System.in);

        //hashmap
        HashMap<Character, String> em = new HashMap<>() {{
            put('A', ".-");
            put('B', "-...");
            put('C', "-.-.");
            put('D', "-..");
            put('E', ".");
            put('F', "..-.");
            put('G', "--.");
            put('H', "....");
            put('I', "..");
            put('J', ".---");
            put('K', "-.-");
            put('L', ".-..");
            put('M', "--");
            put('N', "-.");
            put('O', "---");
            put('P', ".--.");
            put('Q', "--.-");
            put('R', ".-.");
            put('S', "...");
            put('T', "-");
            put('U', "..-");
            put('V', "...-");
            put('W', ".--");
            put('X', "-..-");
            put('Y', "-.--");
            put('Z', "--..");
            put('0', "-----");
            put('1', ".----");
            put('2', "..---");
            put('3', "...--");
            put('4', "....-");
            put('5', ".....");
            put('6', "-....");
            put('7', "--...");
            put('8', "---..");
            put('9', "----.");
            put(' ', " ");
        }};

        String word = sc.nextLine();
        char[] arr = word.toUpperCase().toCharArray();
        String Morse = "";
        for (char ch : arr) {
            Morse += em.get(ch) + " ";
        }
        System.out.println("Morse code for " + word + "will be :" + Morse);  // English to Morse code
    }

                                                                            // function for  Morse code to English  conversion
    public static void MORSEtoENG(int choice) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Character> me = new HashMap<>() {{
            put(".-", 'A');
            put("-...", 'B');
            put("-.-.", 'C');
            put("-..", 'D');
            put(".", 'E');
            put("..-.", 'F');
            put("--.", 'G');
            put("....", 'H');
            put("..", 'I');
            put(".---", 'J');
            put("-.-", 'K');
            put(".-..", 'L');
            put("--", 'M');
            put("-.", 'N');
            put("---", 'O');
            put(".--.", 'P');
            put("--.-", 'Q');
            put(".-.", 'R');
            put("...", 'S');
            put("-", 'T');
            put("..-", 'U');
            put("...-", 'V');
            put(".--", 'W');
            put("-..-", 'X');
            put("-.--", 'Y');
            put("--..", 'Z');
            put("-----", '0');
            put(".----", '1');
            put("..---", '2');
            put("...--", '3');
            put("....-", '4');
            put(".....", '5');
            put("-....", '6');
            put("--...", '7');
            put("---..", '8');
            put("----.", '9');
            put(" ", ' ');
        }};
        String code = sc.nextLine();
        String F_result = "";
        String[] ass = code.split(" ");


        for(String eng: ass){
            F_result += (me.getOrDefault(eng,' '));
        }

        System.out.print("Morse code " + code + " to English is "+ F_result); // Morse code to English
        System.out.println();
    }


public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

                                                                         // menu with choices
        System.out.println(" MENU ");
        System.out.println(" Type 1 to convert text to morse Code ");
        System.out.println(" Type 2 to convert morse Code to text ");
        System.out.println(" Type 3 to exit ");
        System.out.println();

                                                                        // Requesting to pick desired choice
        while (true) {
            System.out.println("Enter your choices: ");
            System.out.println("Choice '1': convert text to Morse code");
            System.out.println("Choice '2': convert Morse code to text");

            String code = "";

                                                                        // your choices go here
            int choice = sc.nextInt();
            if (choice == 1) {
                ENGtoMORSE(choice);
            } else if (choice == 2) {
                MORSEtoENG(choice);
            } else {
                System.out.println("Your Exiting....! ");
            }
        }

    }
}

