import java.util.Scanner;

/**
 * Exercise 1.8 - Compare Strings
 * A user enters two strings. The program:
 *   1) compares the two strings using equals() and prints whether they are equal;
 *   2) compares the first character of each string using charAt(0).
 */
public class CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the two strings from the user
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // 1) Compare the two strings using equals()
        boolean isEqual = str1.equals(str2);
        System.out.println("The two given strings are equal: " + isEqual);

        // 2) Compare the first character of each string using charAt(0)
        if (str1.length() > 0 && str2.length() > 0) {
            char firstChar1 = str1.charAt(0);
            char firstChar2 = str2.charAt(0);

            System.out.println("First character of string 1: '" + firstChar1 + "'");
            System.out.println("First character of string 2: '" + firstChar2 + "'");

            if (firstChar1 == firstChar2) {
                System.out.println("The first characters are equal.");
            } else {
                System.out.println("The first characters are NOT equal.");
            }
        } else {
            System.out.println("One of the strings is empty, cannot compare first characters.");
        }

        scanner.close();
    }
}
