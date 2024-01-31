import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int studentCount = Integer.parseInt(scan.nextLine());
        int lecturesCount = Integer.parseInt(scan.nextLine());
        int initialBonus = Integer.parseInt(scan.nextLine());
        int maxBonus = 0;
        int maxAttended = 0;
        for (int i = 0; i < studentCount; i++) {
            int bonusTemp;
            int lecturesTaken = Integer.parseInt(scan.nextLine());
            if (lecturesTaken != 0) {
                bonusTemp = (int) Math.ceil((double) lecturesTaken / lecturesCount * (5 + initialBonus));
            } else {
                continue;
            }
            if (bonusTemp > maxBonus) {
                maxBonus = bonusTemp;
            }
            if (lecturesTaken > maxAttended) {
                maxAttended = lecturesTaken;
            }
        }
        System.out.printf("Max Bonus: %d.", maxBonus);
        System.out.println();
        System.out.printf("The student has attended %d lectures.", maxAttended);
    }
}