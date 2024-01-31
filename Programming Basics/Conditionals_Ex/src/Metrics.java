import java.util.Scanner;

public class Metrics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num = Double.parseDouble(scan.nextLine());
        String in = scan.nextLine();
        String out = scan.nextLine();
        if (in.equalsIgnoreCase("mm")) {
            num = num / 1000;
        } else if (in.equalsIgnoreCase("cm")) {
            num = num / 100;
        }
        if (out.equalsIgnoreCase("mm")) {
            num = num * 1000;
        } else if (out.equalsIgnoreCase("cm")) {
            num = num * 100;
        }
        System.out.printf("%.3f", num);
    }
}
