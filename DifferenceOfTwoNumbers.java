import java.util.Scanner;

/**
 * Exercise 1.1 - Difference of Two Numbers
 * A user enters two integers, the program calculates and displays their difference.
 */
public class DifferenceOfTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first integer
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        // Prompt the user to enter the second integer
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Calculate the difference
        int difference = num1 - num2;

        // Display the result
        System.out.println("The difference of " + num1 + " and " + num2 + " is: " + difference);

        // Close the scanner
        scanner.close();
    }
}
