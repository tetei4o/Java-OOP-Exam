import java.util.Scanner;

public class Spaceship {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double width = Double.parseDouble(scan.nextLine());
        double length = Double.parseDouble(scan.nextLine());
        double height = Double.parseDouble(scan.nextLine());
        double astroHeight = Double.parseDouble(scan.nextLine());
        double volumeShip = width * height * length;
        double volumeRoom = (astroHeight + 0.4) * 2 * 2;
        double available = Math.floor(volumeShip / volumeRoom);
        if (available >= 3 && available <= 10) {
            System.out.printf("The spacecraft holds %d astronauts.", (int) available);
        } else if (available < 3) {
            System.out.println("The spacecraft is too small.");
        } else if (available > 10) {
            System.out.println("The spacecraft is too big.");
        }
    }
}
