import java.util.Scanner;

public class InchesToCm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double inches = Double.parseDouble(scan.nextLine());
        double cm = inches * 2.54;
        System.out.println(cm);
    }
}
