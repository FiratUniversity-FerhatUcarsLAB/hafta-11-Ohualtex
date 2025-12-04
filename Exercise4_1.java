public class Exercise4_1 {

    public static void printAmerican(String day, int date, String month, int year) {
        // American format: Day, Month Date, Year
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    public static void printEuropean(String day, int date, String month, int year) {
        // European format: Day Date Month Year
        System.out.println(day + " " + date + " " + month + " " + year);
    }

    public static void main(String[] args) {
        String day = "Monday";
        int date = 22;
        String month = "July";
        int year = 2019;

        System.out.println("American format:");
        printAmerican(day, date, month, year);

        System.out.println("European format:");
        printEuropean(day, date, month, year);
    }
}
