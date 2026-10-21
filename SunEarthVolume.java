/**
 * Exercise 1.5 - Sun and Earth Volume
 * The diameter of the Sun is approximately 865,000 miles.
 * The diameter of the Earth is approximately 7,600 miles.
 *
 * Volume of a sphere: V = (4/3) * pi * r^3
 *   where r = diameter / 2 and pi = 3.14
 *
 * Displays:
 *   a) Volume of the Earth in cubic miles
 *   b) Volume of the Sun in cubic miles
 *   c) Ratio of the Sun's volume to the Earth's volume
 */
public class SunEarthVolume {
    public static void main(String[] args) {
        final double PI = 3.14;

        // Diameters in miles
        double sunDiameter = 865000.0;
        double earthDiameter = 7600.0;

        // Radius = diameter / 2
        double sunRadius = sunDiameter / 2;
        double earthRadius = earthDiameter / 2;

        // Volume of a sphere: V = (4/3) * pi * r^3
        double sunVolume = (4.0 / 3.0) * PI * Math.pow(sunRadius, 3);
        double earthVolume = (4.0 / 3.0) * PI * Math.pow(earthRadius, 3);

        // Ratio of Sun's volume to Earth's volume
        double ratio = sunVolume / earthVolume;

        // Display the results
        System.out.println("Sun and Earth Volume Calculator");
        System.out.println("--------------------------------");
        System.out.printf("a) Volume of the Earth : %.2f cubic miles%n", earthVolume);
        System.out.printf("b) Volume of the Sun   : %.2f cubic miles%n", sunVolume);
        System.out.printf("c) Ratio (Sun / Earth) : %.2f%n", ratio);
    }
}
