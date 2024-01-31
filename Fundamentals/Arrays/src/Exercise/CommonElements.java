package Exercise;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arrayOne = scan.nextLine().split(" ");
        String[] arrayTwo = scan.nextLine().split(" ");
        for (String i : arrayTwo) {
            for (String j : arrayOne) {
                if (i.equals(j)) {
                    System.out.print(i + " ");

                }
            }
        }
    }
}
