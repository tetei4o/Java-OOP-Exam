package Exercise;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] path = scan.nextLine().split("\\\\");
        String file = path[path.length - 1];
        int point = file.indexOf(".");
        System.out.printf("File name: %s\n", file.substring(0, point));
        System.out.printf("File extension: %s", file.substring(point + 1));
    }
}
