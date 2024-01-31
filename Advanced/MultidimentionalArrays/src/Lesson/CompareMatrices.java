package Lesson;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int rows1 = Integer.parseInt(input.split("\\s+")[0]);
        int cols1 = Integer.parseInt(input.split("\\s+")[1]);
        int[][] matrix1 = new int[rows1][cols1];
        for (int row = 0; row < rows1; row++) {
            matrix1[row] = Arrays
                    .stream(scan.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        input = scan.nextLine();
        int rows2 = Integer.parseInt(input.split("\\s+")[0]);
        int cols2 = Integer.parseInt(input.split("\\s+")[1]);
        int[][] matrix2 = new int[rows2][cols2];
        for (int row = 0; row < rows2; row++) {
            matrix2[row] = Arrays
                    .stream(scan.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        if (rows1 != rows2 && cols1 != cols2) {
            System.out.println("not equal");
            return;
        }
        System.out.println(areEqual(matrix1, matrix2));
    }

    private static String areEqual(int[][] matrix1, int[][] matrix2) {
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    return "not equal";
                }
            }
        }
        return "equal";
    }
}
