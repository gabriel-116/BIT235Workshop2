/**
 * Exercise 1.6 - Fuel Consumption
 * A motor car uses 8 liters of fuel per 100 km on a normal road,
 * and 15% more fuel on rough roads.
 *
 * Calculate the distance the car can travel on a full tank of 40 liters
 * on both normal and rough roads.
 */
public class FuelConsumption {
    public static void main(String[] args) {
        // Given values
        double normalFuelPer100km = 8.0;    // liters per 100 km on normal road
        double extraPercentOnRough = 0.15;   // 15% more fuel on rough road
        double tankCapacity = 40.0;         // liters

        // Fuel consumption on rough road
        double roughFuelPer100km = normalFuelPer100km * (1 + extraPercentOnRough);

        // Distance = (tank capacity / fuel per 100 km) * 100
        double distanceOnNormal = (tankCapacity / normalFuelPer100km) * 100;
        double distanceOnRough = (tankCapacity / roughFuelPer100km) * 100;

        // Display the results
        System.out.println("Fuel Consumption Calculator");
        System.out.println("----------------------------");
        System.out.println("Tank capacity: " + tankCapacity + " liters");
        System.out.printf("On a normal road  : %.2f km%n", distanceOnNormal);
        System.out.printf("On a rough road   : %.2f km%n", distanceOnRough);
    }
}
