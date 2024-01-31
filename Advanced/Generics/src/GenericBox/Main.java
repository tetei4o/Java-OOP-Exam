package GenericBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Box<String> box = new Box<>();
        for (int i = 0; i < n; i++) {
            box.setElement(scan.nextLine());
        }
        System.out.println(box.count(scan.nextLine()));
    }
}
