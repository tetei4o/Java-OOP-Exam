import java.util.Scanner;

public class ReVolt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = Integer.parseInt(scan.nextLine());
        int numOfCommands = Integer.parseInt(scan.nextLine());
        char[][] matrix = new char[size][size];
        for (int row = 0; row < size; row++) {
            char[] input = scan.nextLine().toCharArray();
            for (int col = 0; col < size; col++) {
                matrix[row][col] = input[col];
            }
        }
    }
}
