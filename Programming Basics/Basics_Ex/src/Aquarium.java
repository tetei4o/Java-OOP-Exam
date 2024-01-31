import java.util.Scanner;

public class Aquarium {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lenght = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        double precent = Double.parseDouble(scan.nextLine());
        double liters = lenght*width*height*0.001*(1-(precent/100));
        System.out.printf("%.2f",liters);

    }
}
