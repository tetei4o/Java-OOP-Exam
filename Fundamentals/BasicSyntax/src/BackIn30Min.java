import java.util.Scanner;

public class BackIn30Min {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hours = Integer.parseInt(scan.nextLine());
        int mins = Integer.parseInt(scan.nextLine());
        int totalTime = hours * 60 + mins + 30;
        int finalHR = totalTime / 60;
        int finalMin = totalTime % 60;
        if (finalHR >= 24) {
            finalHR -= 24;
        }
        if (finalMin < 10) {
            System.out.printf("%d:0%d", finalHR, finalMin);
        } else {
            System.out.printf("%d:%d", finalHR, finalMin);
        }
    }
}
