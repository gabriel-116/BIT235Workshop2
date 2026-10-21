import java.util.Scanner;

/**
 * Exercise 1.3 - Area of a Circle
 * Formula: Area = pi * r^2, using pi = 3.14
 * Use Math.pow(r, 2) to compute the square of the radius.
 */
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14;

        // Prompt the user to enter the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate the area: pi * r^2
        double area = PI * Math.pow(radius, 2);

        // Display the result
        System.out.println("The area of the circle with radius " + radius + " is: " + area);

        scanner.close();
    }
}
