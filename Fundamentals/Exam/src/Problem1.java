import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String input = scan.nextLine();
        while (!input.equals("Done")) {
            String[] parts = input.split(" ");
            String command = parts[0];
            switch (command) {
                case "Change":
                    text = text.replace(parts[1], parts[2]);
                    System.out.println(text);
                    break;
                case "Includes":
                    if (text.contains(parts[1])) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "End":
                    if (text.endsWith(parts[1])) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Uppercase":
                    text = text.toUpperCase();
                    System.out.println(text);
                    break;
                case "FindIndex":
                    System.out.println(text.indexOf((parts[1])));
                    break;
                case "Cut":
                    text = text.substring(Integer.parseInt(parts[1]), Integer.parseInt(parts[1]) + Integer.parseInt(parts[2]));
                    System.out.println(text);
                    break;
            }
            input = scan.nextLine();
        }
    }
}
