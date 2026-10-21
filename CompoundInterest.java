/**
 * Exercise 1.4 - Compound Interest
 * Formula: A = P * (1 + r)^n
 *   P = 5000.00 (principal investment)
 *   r = 0.04    (4% interest rate per year)
 *   n = 10      (number of years)
 * Use Math.pow to compute the power.
 */
public class CompoundInterest {
    public static void main(String[] args) {
        // Given values
        double P = 5000.00;   // Principal amount in dollars
        double r = 0.04;      // Interest rate per year (4% = 0.04)
        int n = 10;           // Number of years

        // Apply the compound interest formula: A = P * (1 + r)^n
        double A = P * Math.pow(1 + r, n);

        // Calculate the interest earned (optional but useful)
        double interest = A - P;

        // Display the results
        System.out.println("Compound Interest Calculator");
        System.out.println("-----------------------------");
        System.out.println("Principal (P)     : $" + P);
        System.out.println("Interest Rate (r) : " + (r * 100) + "% per year");
        System.out.println("Time Period (n)   : " + n + " years");
        System.out.println("-----------------------------");
        System.out.printf("Amount (A)         : $%.2f%n", A);
        System.out.printf("Interest Earned     : $%.2f%n", interest);
    }
}
