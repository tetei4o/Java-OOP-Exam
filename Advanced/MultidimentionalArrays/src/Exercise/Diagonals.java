package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Diagonals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[][] matrix = new int[n][];
        fillMatrix(matrix, n, scan);
        int diagonalSum1 = getDiagonalSum1(matrix);
        int diagonalSum2 = getDiagonalSum2(matrix);
        System.out.println(Math.abs(diagonalSum1 - diagonalSum2));
    }

    private static int getDiagonalSum2(int[][] matrix) {
        int sum = 0;
        for (int i = matrix.length - 1; i >= 0; i--) {
            int currentNum = matrix[i][matrix.length - i - 1];
            sum += currentNum;
        }
        return sum;
    }

    private static int getDiagonalSum1(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            int currentNum = matrix[i][i];
            sum += currentNum;
        }
        return sum;
    }

    private static void fillMatrix(int[][] matrix, int n, Scanner scan) {
        for (int i = 0; i < n; i++) {
            matrix[i] = Arrays
                    .stream(scan.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
    }
}

