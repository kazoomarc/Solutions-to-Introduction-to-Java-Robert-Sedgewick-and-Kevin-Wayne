public class Greatcircle {
    public static void main(String[] args) {

        double x1 = 48.87;
        double y1 = -2.33;
        double x2 = 37.8;
        double y2 = 122.4;

        // args from command line
        /**
         * x1 = Double.parseDouble(args[0])
         * y1 = Double.parseDouble(args[0])
         * x2 = Double.parseDouble(args[0])
         * y2 = Double.parseDouble(args[0])
         * 
         */

        // convert latitudes to radians
        double x1rad = Math.toRadians(x1);
        double x2rad = Math.toRadians(x2);
        double y1rad = Math.toRadians(y1);
        double y2rad = Math.toRadians(y2);

        //
        double temp1 = Math.sin(x1rad) * Math.sin(x2rad);
        double temp2 = Math.cos(x1rad) * Math.cos(x2rad) * Math.cos(y1rad - y2rad);
        double d = 60 * Math.cosh(temp1 + temp2);
        System.out.printf("Great circle = %f\n", d);

    }
}