package Lesson;

import java.util.Scanner;

public class Intersection {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = Integer.parseInt(scan.nextLine());
        int cols = Integer.parseInt(scan.nextLine());
        char[][] matrix1 = createMatrix(rows, cols, scan);
        char[][] matrix2 = createMatrix(rows, cols, scan);
        char[][] matrix3 = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix1[i][j] == matrix2[i][j]) {
                    matrix3[i][j] = matrix1[i][j];
                } else {
                    matrix3[i][j] = '*';
                }
            }
        }
        for (char[] chars : matrix3) {
            for (char character : chars) {
                System.out.print(character + " ");
            }
            System.out.println();
        }
    }

    private static char[][] createMatrix(int rows, int cols, Scanner scan) {
        char[][] matrix = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            char[] tokens = scan.nextLine().replaceAll("\\s+", "").toCharArray();
            if (cols >= 0) System.arraycopy(tokens, 0, matrix[i], 0, cols);
        }
        return matrix;
    }
}
