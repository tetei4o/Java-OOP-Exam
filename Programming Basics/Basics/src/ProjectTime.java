import java.util.Scanner;

public class ProjectTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int projectNum = Integer.parseInt(scan.nextLine());
        int timeNeeded = projectNum * 3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, timeNeeded, projectNum);
    }
}
