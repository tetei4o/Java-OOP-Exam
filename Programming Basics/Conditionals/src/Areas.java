import java.util.Scanner;

public class Areas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();
        double a;
        double b;
        double result;
        if (type.equalsIgnoreCase("square")) {
            a = Double.parseDouble(scan.nextLine());
            result = a * a;
            System.out.printf("%.3f", result);
        } else if (type.equalsIgnoreCase("rectangle")) {
            a = Double.parseDouble(scan.nextLine());
            b = Double.parseDouble(scan.nextLine());
            result = a * b;
            System.out.printf("%.3f", result);
        } else if (type.equalsIgnoreCase("circle")) {
            a = Double.parseDouble(scan.nextLine());
            result = (Math.PI) * a * a;
            System.out.printf("%.3f", result);
        } else if (type.equalsIgnoreCase("triangle")) {
            a = Double.parseDouble(scan.nextLine());
            b = Double.parseDouble(scan.nextLine());
            result = a * b / 2;
            System.out.printf("%.3f", result);
        }
    }
}



