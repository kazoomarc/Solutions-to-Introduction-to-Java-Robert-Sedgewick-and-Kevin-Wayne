public class ThreeSort {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        int min = Math.min(Math.min(a, b), c);
        int max = Math.max(Math.max(a, b), c);
        int mid = a + b + c - min - max;

        System.out.printf("%d %d %d", min, mid, max);

    }
}