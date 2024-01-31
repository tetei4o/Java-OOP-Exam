import java.util.Scanner;

public class Seconds {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int timeFirst = Integer.parseInt(scan.nextLine());
        int timeSecond = Integer.parseInt(scan.nextLine());
        int timeThird = Integer.parseInt(scan.nextLine());
        int timeFinal = timeFirst + timeSecond + timeThird;
        int minutes = timeFinal / 60;
        int seconds = timeFinal % 60;
        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }
    }
}
