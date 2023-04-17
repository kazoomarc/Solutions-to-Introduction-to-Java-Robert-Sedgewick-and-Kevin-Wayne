public class CompoundInterest {

    public static void main(String[] args) {

        // user input required
        int years = 4; // t
        double dollars = 4000; // P
        double rate = 0.2; // r

        double result = dollars * Math.pow(Math.E, (rate * years));
        System.out.println(result);

    }
}