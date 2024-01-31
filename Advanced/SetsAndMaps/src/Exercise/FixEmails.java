package Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, String> emailsData = new LinkedHashMap<>();
        String name = scan.nextLine();
        while (!name.equals("stop")) {
            String email = scan.nextLine();
            if (!email.endsWith("us") && !email.endsWith("uk") && !email.endsWith("com")) {
                emailsData.put(name, email);
            }
            name = scan.nextLine();
        }
        for (Map.Entry<String, String> emails : emailsData.entrySet()) {
            System.out.println(emails.getKey() + " -> " + emails.getValue());

        }
    }
}