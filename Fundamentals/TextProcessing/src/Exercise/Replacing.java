package Exercise;

import java.util.Scanner;

public class Replacing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder text = new StringBuilder(scan.nextLine());
        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) == text.charAt(i + 1)) {
                text.deleteCharAt(i + 1);
                i = -1;
            }
        }
        System.out.println(text);
    }
}
