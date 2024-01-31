import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int allowedFails = Integer.parseInt(scan.nextLine());
        int fails = 0;
        int solvedProblems = 0;
        double gradesSum = 0;
        String lastProblem = "";
        boolean isFailed = true;
        String problemName;
        while (fails < allowedFails) {
            problemName = scan.nextLine();
            if (problemName.equals("Enough")) {
                isFailed = false;
                break;
            }
            int grade = Integer.parseInt(scan.nextLine());
            if (grade <= 4) {
                fails++;
            }
            solvedProblems++;
            lastProblem = problemName;
            gradesSum += grade;
        }
        if (isFailed) {
            System.out.printf("You need a break, %d poor grades.", fails);
        } else {
            System.out.printf("Average score: %.2f\n", gradesSum / solvedProblems);
            System.out.printf("Number of problems: %d\n", solvedProblems);
            System.out.printf("Last problem: %s", lastProblem);
        }
    }
}