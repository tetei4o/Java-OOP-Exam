import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        double total = 0;
        int n = 1;
        int fails = 0;
        while (n <= 12) {
            double grade = Double.parseDouble(scan.nextLine());
            if (grade >= 4) {
                total += grade;
                n++;
            } else {
                fails++;
            }
            if (fails > 1) {
                System.out.printf("%s has been excluded at %d grade", name, n);
                return;
            }
        }
        double average = total / 12;
        System.out.printf("%s graduated. Average grade: %.2f", name, average);
    }
}
