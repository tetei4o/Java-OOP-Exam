package Lesson;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int rows = Integer.parseInt(input.split("\\s+")[0]);
        int cols = Integer.parseInt(input.split("\\s+")[1]);
        int[][] matrix = createMatrix(rows, cols, scan);
        int num = Integer.parseInt(scan.nextLine());
        boolean isFound = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int currentNum = matrix[i][j];
                if (currentNum == num) {
                    System.out.println(i + " " + j);
                    isFound = true;
                }
            }
        }
        if (!isFound) {
            System.out.println("not found");
        }
    }

    private static int[][] createMatrix(int rows, int cols, Scanner scan) {
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays
                    .stream(scan.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        return matrix;
    }
}
