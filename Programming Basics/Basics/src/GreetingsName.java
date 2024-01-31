import java.util.Scanner;

public class GreetingsName {
    public static void main(String[] args) {
        Scanner skener = new Scanner(System.in);
        String name = skener.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
