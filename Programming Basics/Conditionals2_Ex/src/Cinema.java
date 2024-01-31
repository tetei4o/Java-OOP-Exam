import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();
        int rows = Integer.parseInt(scan.nextLine());
        int columns = Integer.parseInt(scan.nextLine());
        double price = 0;
        switch (type.toLowerCase()) {
            case "premiere":
                price = rows * columns * 12;
                break;
            case "normal":
                price = rows * columns * 7.5;
                break;
            case "discount":
                price = rows * columns * 5;
                break;
        }
        System.out.printf("%.2f leva", price);
    }
}
