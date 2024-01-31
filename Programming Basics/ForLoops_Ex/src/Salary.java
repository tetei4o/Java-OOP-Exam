import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double salary = Double.parseDouble(scan.nextLine());
        boolean doContinue = true;
        for (int i = 0; i < n; i++) {
            String tab = scan.nextLine();
            switch (tab) {
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;
                default:
                    salary += 0;
            }
            if (salary <= 0) {
                i = n - 1;
                doContinue = false;
                System.out.println("You have lost your salary.");
            }
        }
        if (doContinue) {
            System.out.println((int) salary);
        }
    }
}
