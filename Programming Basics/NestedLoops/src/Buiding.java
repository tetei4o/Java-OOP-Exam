import java.util.Scanner;

public class Buiding {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int floors = Integer.parseInt(scan.nextLine());
        int rooms = Integer.parseInt(scan.nextLine());
        char typeOfRoom;
        for (int i = floors; i >= 1; i--) {
            if (i == floors) {
                typeOfRoom = 'L';
            } else if (i % 2 == 0) {
                typeOfRoom = 'O';
            } else {
                typeOfRoom = 'A';
            }
            for (int j = 0; j < rooms; j++) {
                System.out.printf("%c%d%d ", typeOfRoom, i, j);

            }
            System.out.println();

        }
    }
}
