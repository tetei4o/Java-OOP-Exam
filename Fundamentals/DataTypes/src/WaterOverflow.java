import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int filledLiters = 0;
        for (int i = 0; i < n; i++) {
            int litersToFill = Integer.parseInt(scan.nextLine());
            if (filledLiters + litersToFill <= 255) {
                filledLiters += litersToFill;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(filledLiters);
    }
}
