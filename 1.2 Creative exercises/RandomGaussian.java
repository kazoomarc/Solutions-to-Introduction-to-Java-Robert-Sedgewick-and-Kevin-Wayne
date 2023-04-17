/**
 * RandomGaussian that prints a random number r drawn from the Gaussian
 * distribution. One way to
 * do so is to use the Box–Muller formula
 */

public class RandomGaussian {
    public static void main(String[] args) {
        double u = Math.random();
        double v = Math.random();

        double r = Math.sin(2 * Math.PI * v) * Math.sqrt(-2 * Math.log(u));
        System.out.println(r);

    }
}