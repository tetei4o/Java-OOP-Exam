import java.util.Scanner;

public class WorkingDays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = Integer.parseInt(scan.nextLine());
        String day = scan.nextLine();
        if (hour >= 10 && hour <= 18 && (day.equalsIgnoreCase("monday")
                || day.equalsIgnoreCase("tuesday") || day.equalsIgnoreCase("wednesday") || day.equalsIgnoreCase("thursday")
                || day.equalsIgnoreCase("friday") || day.equalsIgnoreCase("saturday"))) {
            System.out.println("open");
        } else if (hour < 10 || hour > 18 || day.equalsIgnoreCase("sunday")) {
            System.out.println("closed");
        }
    }
}
