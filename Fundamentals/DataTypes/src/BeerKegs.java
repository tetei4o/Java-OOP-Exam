import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String model;
        double radius;
        int height;
        double volume;
        double highestVolume = Integer.MIN_VALUE;
        String modelWithHighestVol = "";
        for (int i = 0; i < n; i++) {
            model = scan.nextLine();
            radius = Double.parseDouble(scan.nextLine());
            height = Integer.parseInt(scan.nextLine());
            volume = Math.PI * Math.pow(radius, 2) * height;
            if (volume > highestVolume) {
                highestVolume = volume;
                modelWithHighestVol = model;
            }
        }
        System.out.println(modelWithHighestVol);
    }
}
