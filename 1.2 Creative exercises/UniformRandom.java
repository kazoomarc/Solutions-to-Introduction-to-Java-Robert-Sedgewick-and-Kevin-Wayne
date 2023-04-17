public class UniformRandom {
    public static void main(String[] args) {
        double rand1 = Math.random();
        double rand2 = Math.random();
        double rand3 = Math.random();
        double rand4 = Math.random();
        double rand5 = Math.random();

        // calculating minimum
        double min0 = Math.min(rand1, rand2);
        double min1 = Math.min(rand3, rand4);
        double min3 = Math.min(min0, min1);
        double min = Math.min(min3, rand5);

        // calculating maximum
        double max0 = Math.max(rand1, rand2);
        double max1 = Math.max(rand3, rand4);
        double max3 = Math.max(max0, max1);
        double max = Math.max(max3, rand5);

        // printing results
        System.out.printf("Numbers are %f %f %f %f %f\n", rand1, rand2, rand3, rand4, rand5);
        System.out.printf("Min number = %f ; Max number = %f\n", min, max);

    }

}