import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double income = Double.parseDouble(scan.nextLine());
        double grade = Double.parseDouble(scan.nextLine());
        double lowestSal = Double.parseDouble(scan.nextLine());
        double socSchol = 0;
        double gradeSchol = 0;
        if (income < lowestSal) {
            if (grade > 4.5) {
                socSchol = lowestSal * 35 / 100;
            }
        }
        if (grade >= 5.50) {
            gradeSchol = grade * 25;
        }
        boolean canTake = socSchol + gradeSchol != 0;
        if (canTake) {
            if (socSchol > gradeSchol) {
                System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(socSchol));
            } else {
                System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(gradeSchol));
            }
        } else {
            System.out.println("You cannot get a scholarship!");
        }
    }
}

