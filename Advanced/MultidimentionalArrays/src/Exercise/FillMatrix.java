package Exercise;

import java.util.Scanner;

public class FillMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(",\\s+");
        int n = Integer.parseInt(input[0]);
        String method = input[1];
        int[][] matrix = new int[n][n];
        if (method.equals("A")) {
            fillWithMethodA(matrix, n);
            printMatrix(matrix);
        } else if (method.equals("B")) {
            fillWithMethodB(matrix, n);
            printMatrix(matrix);
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int num : ints) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    private static void fillWithMethodB(int[][] matrix, int n) {
        int start = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    matrix[j][i] = start++;
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    matrix[j][i] = start++;
                }
            }
        }
    }

    private static void fillWithMethodA(int[][] matrix, int n) {
        int start = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[j][i] = start;
                start++;
            }
        }
    }
}
