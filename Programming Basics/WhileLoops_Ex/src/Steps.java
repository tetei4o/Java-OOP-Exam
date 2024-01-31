import java.util.Scanner;

public class Steps {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int steps = 0;
        int stepsNeeded = 10000;
        while (steps < stepsNeeded) {
            String input = scan.nextLine();
            if (!input.equals("Going home")) {
                int walkedSteps = Integer.parseInt(input);
                steps += walkedSteps;
            } else {
                input = scan.nextLine();
                int walkedSteps = Integer.parseInt(input);
                steps += walkedSteps;
                if (steps < stepsNeeded) {
                    System.out.printf("%d more steps to reach goal.", stepsNeeded - steps);
                    return;
                } else {
                    break;
                }
            }
        }
        System.out.printf("Goal reached! Good job!\n%d steps over the goal!", steps - stepsNeeded);
    }
}
