import java.util.Scanner;

public class Passengers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberAirways = Integer.parseInt(scan.nextLine());
        int seatsTaken = 0;
        String name = "";
        int flights = 0;
        int average;
        int mostSeats = Integer.MIN_VALUE;
        String airwayMostSeats = "";
        for (int i = 0; i < numberAirways; i++) {
            String input = scan.nextLine();
            String input2 = scan.nextLine();
            while (!input2.equals("Finish")) {
                name = input;
                int passengers = Integer.parseInt(input2);
                seatsTaken += passengers;
                flights++;
                input2 = scan.nextLine();
            }
            average = (int) Math.floor((double) seatsTaken / (double) flights);
            System.out.printf("%s: %d passengers.\n", name, average);
            if (average > mostSeats) {
                mostSeats = average;
                airwayMostSeats = name;
            }
            seatsTaken = 0;
            flights = 0;
        }
        System.out.printf("%s has most passengers per flight: %d", airwayMostSeats, mostSeats);
    }
}