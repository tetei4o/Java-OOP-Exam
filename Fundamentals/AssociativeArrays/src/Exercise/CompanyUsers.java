package Exercise;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, List<String>> company = new TreeMap<>();
        String input = scan.nextLine();
        while (!input.equals("End")) {
            String name = input.split(" -> ")[0];
            String employee = input.split(" -> ")[1];
            if (!company.containsKey(name)) {
                company.put(name, new ArrayList<>());
            }
            if (!company.get(name).contains(employee)) {
                company.get(name).add(employee);
            }
            input = scan.nextLine();
        }
        company.entrySet()
                .forEach(entry -> {
                    System.out.println(entry.getKey());
                    entry.getValue()
                            .forEach(employee -> System.out.printf("-- %s\n", employee));
                });
    }
}
