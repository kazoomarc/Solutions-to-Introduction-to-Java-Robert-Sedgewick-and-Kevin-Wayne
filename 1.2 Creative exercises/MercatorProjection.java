public class MercatorProjection {
    public static void main(String[] args) {
        // make it to receive inputs

        double latitude; // phi
        double longitude; // lambda-not
        double lambda; // longitude
        double x = lambda - longitude;
        double y = 0.5 * ((1 + Math.log(Math.sin(latitude)) / 1 - Math.sin(latitude)));

    }
}