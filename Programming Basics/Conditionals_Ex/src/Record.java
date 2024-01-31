import java.util.Scanner;

public class Record {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double record = Double.parseDouble(scan.nextLine());
        double distance = Double.parseDouble(scan.nextLine());
        double timeForMeter = Double.parseDouble(scan.nextLine());
        double swimTime = distance * timeForMeter;
        double currentSlow = distance / 15;
        double bonusTime = Math.floor(currentSlow) * 12.5;
        double totalTimeNeeded = swimTime + bonusTime;
        double difference;
        if (totalTimeNeeded >= record) {
            difference = totalTimeNeeded - record;
            System.out.printf("No, he failed! He was %.2f seconds slower.", difference);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTimeNeeded);
        }
    }
}
