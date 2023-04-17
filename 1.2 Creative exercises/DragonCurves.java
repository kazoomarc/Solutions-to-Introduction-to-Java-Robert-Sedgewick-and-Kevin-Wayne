public class DragonCurves {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Dragon curve of order " + i + ": " + dragonCurve(i));
        }
    }

    public static String dragonCurve(int order) {
        if (order == 0) {
            return "F";
        } else {
            String previousCurve = dragonCurve(order - 1);
            StringBuilder curve = new StringBuilder(previousCurve);
            curve.append("L");
            for (int i = previousCurve.length() - 1; i >= 0; i--) {
                char c = previousCurve.charAt(i);
                if (c == 'L') {
                    curve.append("R");
                } else if (c == 'R') {
                    curve.append("L");
                } else {
                    curve.append("F");
                }
            }
            return curve.toString();
        }
    }
}
