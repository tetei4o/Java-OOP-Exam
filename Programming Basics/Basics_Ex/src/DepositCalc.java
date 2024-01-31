import java.util.Scanner;

public class DepositCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double depSum = Double.parseDouble(scan.nextLine());
        int time = Integer.parseInt(scan.nextLine());
        double rate = Double.parseDouble(scan.nextLine());
        double finSum = depSum + time * ((depSum * rate / 100) / 12);
        System.out.println(finSum);
    }
}
