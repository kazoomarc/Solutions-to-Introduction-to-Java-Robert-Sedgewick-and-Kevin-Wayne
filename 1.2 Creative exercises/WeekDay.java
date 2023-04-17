public class WeekDay {
    public static void main(String[] args) {
        int day = 14;
        int month = 2;
        int year = 2000;

        int ynot = year - (14 - month) / 12;
        int x = ynot + (ynot / 4) - (ynot / 100) + (ynot / 400);
        int mnot = month + 12 * ((14 - month) / 12) - 2;
        int dnot = (day + x + (31 * mnot) / 12) % 7;
        System.out.println(dnot);

    }
}