package Exercise.OpinionPoll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] data = scan.nextLine().split(" ");
            Person person = new Person(data[0], Integer.parseInt(data[1]));
            if (person.getAge() > 30) {
                people.add(person);
            }
        }
        people.stream()
                .sorted(Comparator.comparing(Person::getName))
                .forEach(e -> System.out.println(e.getName() + " - " + e.getAge()));
    }
}
