package Exercise;

import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        String[][] matrix = new String[rows][cols];
        fillMatrix(matrix, scan, rows, cols);
        String input = scan.nextLine();
        input = scan.nextLine();
        while (!input.equals("END")) {
            String[] commands = input.split(" ");
            if (commands[0].equals("swap") && commands.length == 5) {
                int rowSwap1 = Integer.parseInt(commands[1]);
                int colSwap1 = Integer.parseInt(commands[2]);
                int rowSwap2 = Integer.parseInt(commands[3]);
                int colSwap2 = Integer.parseInt(commands[4]);
                if (rowSwap1 >= 0 && rowSwap1 < rows && rowSwap2 >= 0 && rowSwap2 < rows && colSwap1 >= 0 && colSwap1 < cols && colSwap2 >= 0 && colSwap2 < cols) {
                    String temp = matrix[rowSwap1][colSwap1];
                    matrix[rowSwap1][colSwap1] = matrix[rowSwap2][colSwap2];
                    matrix[rowSwap2][colSwap2] = temp;
                    printMatrix(matrix, rows, cols);
                } else {
                    System.out.println("Invalid input!");
                }
            } else {
                System.out.println("Invalid input!");
            }
            input = scan.nextLine();
        }
    }

    private static void printMatrix(String[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrix(String[][] matrix, Scanner scan, int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = scan.next();
            }
        }
    }
}
