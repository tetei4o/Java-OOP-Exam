package Lesson;

import java.util.Arrays;
import java.util.Scanner;


public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int rows = Integer.parseInt(input.split(",\\s+")[0]);
        int cols = Integer.parseInt(input.split(",\\s+")[1]);
        int[][] matrix = createMatrix(rows, cols, scan);
        System.out.println(rows);
        System.out.println(cols);
        int sum = 0;
        for (int[] ints : matrix) {
            for (int currentNum : ints) {
                sum += currentNum;
            }
        }
        System.out.println(sum);
    }

    private static int[][] createMatrix(int rows, int cols, Scanner scan) {
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays
                    .stream(scan.nextLine().split(",\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        return matrix;
    }
}
