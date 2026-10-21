import java.util.Scanner;

/**
 * Exercise 1.2 - Celsius to Fahrenheit
 * Convert degrees Celsius to degrees Fahrenheit.
 * Formula: F = C * 9 / 5 + 32
 */
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the temperature in Celsius
        System.out.print("Enter the temperature in degrees Celsius: ");
        double celsius = scanner.nextDouble();

        // Convert Celsius to Fahrenheit using the formula F = C * 9/5 + 32
        double fahrenheit = celsius * 9.0 / 5.0 + 32;

        // Display the result
        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");

        // Close the scanner
        scanner.close();
    }
}
