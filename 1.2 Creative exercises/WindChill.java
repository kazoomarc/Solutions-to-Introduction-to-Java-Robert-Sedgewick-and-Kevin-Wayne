public class WindChill {
    public static void main(String[] args) {

        // get input from the user
        double v = 100;
        double T = 40.898;

        // check required range
        // abs(T) !> 50
        // v > 120 or < 3

        if (isValidInput(v, T)) {
            double result = 35.74 + (0.6215 * T) + (((0.4275 * T) - 35.75) * Math.pow(v, 0.16));
            System.out.printf("%.4f", result);
        } else {
            System.out.println("Not valid input");
        }

    }

    public static boolean isValidInput(double v, double T) {
        if (Math.abs(T) > 50 || v > 120 || v < 3)
            return false;
        return true;
    }
}