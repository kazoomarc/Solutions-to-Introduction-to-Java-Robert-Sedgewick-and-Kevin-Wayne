
/**
 * converts Cartesian to Polar coordinates
 */

public class PolarCoordinates {
    public static void main(String[] args) {
        double x = 4.0;
        double y = 3.0;

        double r = Math.sqrt((x * x) + (y * y));
        double theta = Math.atan2(y, x);

        System.out.printf("r = %.3f Theta = %.3f", r, theta);

    }
}