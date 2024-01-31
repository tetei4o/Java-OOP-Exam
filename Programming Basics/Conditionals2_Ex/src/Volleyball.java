import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String year = scan.nextLine();
        int p = Integer.parseInt(scan.nextLine());
        int h = Integer.parseInt(scan.nextLine());
        double games = ((48 - h) * 3.0 / 4) + h + ((double) p * 2.0 / 3);
        if (year.equals("leap")) {
            games += games * 15 / 100;
            System.out.println((int) Math.floor(games));
        } else if (year.equals("normal")) {
            System.out.println((int) Math.floor(games));
        }
    }
}
