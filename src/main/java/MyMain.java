import java.util.ArrayList;
import java.util.Scanner;

public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) { return ((ch >= 65 && ch <= 90) ? (char) (ch + 32) : ch); }

    // Returns a copy of a String, where all letters 
    // are now lowercase
    public static String myToLowerCase(String str) {
        ArrayList<String> output = new ArrayList<>();
        str.chars().forEach(s -> output.add("" + toLower((char) s)));
        return output.toString().substring(1).replace("]", "").replace(", ", "");
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not an lowercase letter, 
    // it is returned unchanged. 
    public static char toUpper(char ch) {
        return (((int) ch >= 97 && (int) ch <= 122) ? (char) (ch - 32) : ch);
    }

    // Returns a copy of a String, where all letters 
    // are now uppercase
    public static String myToUpperCase(String str) {
        ArrayList<String> output = new ArrayList<>();
        str.chars().forEach(s -> output.add("" + toUpper((char) s)));
        return output.toString().substring(1).replace("]", "").replace(", ", "");
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Select a program (toLower, myToLowerCase, toUpper, myToUpperCase):");
        String menu = scan.nextLine();
        System.out.println("Enter the String/Char you wish to use:");
        switch (menu) {
            case "toLower":
                System.out.println("Result: " + toLower(scan.nextLine().charAt(0)));
                return;
            case "toUpper":
                System.out.println("Result: " + toUpper(scan.next().charAt(0)));
                return;
            case "myToLowerCase":
                System.out.println("Result: " + myToLowerCase(scan.nextLine()));
                return;
            case "myToUpperCase":
                System.out.println("Result: " + myToUpperCase(scan.nextLine()));
                return;
            default:
                System.out.println("Invalid arguments.");
        }
    }
}
