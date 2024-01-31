import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, List<String>> nameLiked = new TreeMap<>();
        int unlikedCount = 0;
        String input = scan.nextLine();
        while (!input.equals("Stop")) {
            String[] parts = input.split("-");
            String command = parts[0];
            String guest = parts[1];
            String meal = parts[2];
            if (command.equals("Like")) {
                if (!nameLiked.containsKey(guest)) {
                    nameLiked.put(guest, new ArrayList<>());
                }
                if (!nameLiked.get(guest).contains(meal)) {
                    nameLiked.get(guest).add(meal);
                }
            } else if (command.equals("Unlike")) {
                if (nameLiked.containsKey(guest) && nameLiked.get(guest).contains(meal)) {
                    unlikedCount++;
                    nameLiked.get(guest).remove(meal);
                    System.out.println(guest + " doesn't like the " + meal + ".");
                } else if (!nameLiked.containsKey(guest)) {
                    System.out.println(guest + " is not at the party.");
                } else if (!nameLiked.get(guest).contains(meal)) {
                    System.out.println(guest + " doesn't have the " + meal + " in his/her collection.");
                }
            }
            input = scan.nextLine();
        }
        nameLiked.entrySet().stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .forEach(e -> System.out.printf("%s: %s\n", e.getKey(), String.join(", ", e.getValue())));
        System.out.println("Unliked meals: " + unlikedCount);
    }
}
