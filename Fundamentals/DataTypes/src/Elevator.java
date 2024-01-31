import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOfPersons = Integer.parseInt(scan.nextLine());
        int capacity = Integer.parseInt(scan.nextLine());
        int courses = 0;
        while (numOfPersons > 0) {
            courses++;
            numOfPersons -= capacity;
        }
        System.out.println(courses);
    }
}
