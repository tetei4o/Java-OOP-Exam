import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());
        int totalTime = hours * 60 + minutes + 15;
        int hours2 = totalTime / 60;
        int minutes2 = totalTime % 60;
        if (hours2 >= 24) {
            hours2 = hours2 - 24;
        }
        if (minutes2 < 10) {
            System.out.printf("%d:0%d", hours2, minutes2);
        } else {
            System.out.printf("%d:%d", hours2, minutes2);
        }
    }
}
