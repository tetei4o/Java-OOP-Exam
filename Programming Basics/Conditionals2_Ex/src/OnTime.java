import java.util.Scanner;

public class OnTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int exHr = Integer.parseInt(scanner.nextLine());
        int exMin = Integer.parseInt(scanner.nextLine());
        int studHr = Integer.parseInt(scanner.nextLine());
        int studMin = Integer.parseInt(scanner.nextLine());
        int totalTimeEx = exHr * 60 + exMin;
        int totalTimeStud = studHr * 60 + studMin;
        int diff = totalTimeEx - totalTimeStud;
        int hr = diff / 60;
        int min = diff % 60;
        if (totalTimeEx >= totalTimeStud && totalTimeStud >= totalTimeEx - 30) { //On time
            System.out.println("On time");
            if (diff < 60) {
                System.out.printf("%d minutes before the start", diff);
            }
        } else if (totalTimeStud < totalTimeEx - 30) { //Early
            System.out.println("Early");
            if (diff <= 59) {
                System.out.printf("%d minutes before the start", diff);
            } else if (diff > 59 && min < 10) {
                System.out.printf("%d:0%d hours before the start", hr, min);
            } else if (diff >= 60 && min >= 10) {
                System.out.printf("%d:%d hours before the start", hr, min);
            }
        } else if (totalTimeStud > totalTimeEx) { //Late
            System.out.println("Late");
            if (diff * -1 < 60) {
                System.out.printf("%d minutes after the start", diff * -1);
            } else if (diff * -1 >= 60 && min * -1 < 10) {
                System.out.printf("%d:0%d hours after the start", hr * -1, min * -1);
            } else if (diff * -1 >= 60 && min * -1 >= 10) {
                System.out.printf("%d:%d hours after the start", hr * -1, min * -1);
            }
        }
    }
}
