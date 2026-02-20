import java.util.Scanner;

public class Main {

    // method that reverses a string
    public static String reverseString(String text) {

        StringBuilder reversed = new StringBuilder();

        // go from last character to first
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed.append(text.charAt(i));
        }

        return reversed.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = reverseString(input);

        System.out.println("Reversed string: " + result);

        sc.close();
    }
}
