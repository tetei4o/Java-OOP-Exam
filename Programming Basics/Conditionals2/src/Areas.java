import java.util.Scanner;

public class Areas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shape = scan.nextLine();
        double a;
        double b;
        double result = 0;
        switch (shape) {
            case "square":
                a = Double.parseDouble(scan.nextLine());
                result = a * a;
                break;
            case "rectangle":
                a = Double.parseDouble(scan.nextLine());
                b = Double.parseDouble(scan.nextLine());
                result = a * b;
                break;
            case "circle":
                a = Double.parseDouble(scan.nextLine());
                result = (Math.PI) * a * a;
                break;
            case "triangle":
                a = Double.parseDouble(scan.nextLine());
                b = Double.parseDouble(scan.nextLine());
                result = a * b / 2;
                break;
            default:
                System.out.println("Unknown figure!");
        }
        System.out.printf("%.3f", result);

    }
}
