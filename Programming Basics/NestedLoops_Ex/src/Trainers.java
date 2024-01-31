import java.util.Scanner;

public class Trainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        String name;
        double grade;
        double totalOnePresentation = 0;
        double totalGrade = 0;
        int gradesCount = 0;
        while (!input.equals("Finish")) {
            name = input;
            for (int i = 1; i <= n; i++) {
                input = scan.nextLine();
                grade = Double.parseDouble(input);
                gradesCount++;
                totalOnePresentation += grade;
                totalGrade += grade;
            }
            totalOnePresentation /= n;
            System.out.printf("%s - %.2f.\n", name, totalOnePresentation);
            totalOnePresentation = 0;
            input = scan.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", totalGrade/gradesCount);

    }
}
