package Course;

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] days = {
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };
        int n = Integer.parseInt(scan.nextLine());
        if (n >= 1 && n <= 7) {
            System.out.println(days[n - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
