//RGB to CMYK convertor

public class ColorConversion {
    public static void main(String[] args) {
        int r = 20;
        int g = 8;
        int b = 5;

        double c, m, y, k;

        // if all values are 0 of rgb then (CMY are also zero but k =1)
        if (r == 0 && g == 0 && b == 0) {
            c = 0;
            m = 0;
            y = 0;
            k = 1;
        } else {
            double w = max(((double) r / 255), ((double) g / 255), ((double) b / 255));
            c = (w - ((double) r / 255)) / w;
            m = (w - ((double) g / 255)) / w;
            y = (w - ((double) b / 255)) / w;
            k = 1 - w;
        }

        System.out.printf("%f %f %f %f", c, m, y, k);

    }

    public static double max(double r, double g, double b) {
        double temp1 = Math.max(r, g);
        double temp2 = Math.max(temp1, b);
        return temp2;
    }
}