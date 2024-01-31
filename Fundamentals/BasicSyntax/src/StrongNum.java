import java.util.Scanner;

public class StrongNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int startNum = num;
        //сума от факториели
        //1. всяка една цифра
        //2. факториел
        //3. сума
        //4. проверка
        int factorial = 1;
        int sum = 0;
        while (num != 0) {
            //получаваме последната цифра с процентно делене на 10
            int digit = num % 10;
            //намиране на факториел
            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }
            sum += factorial;
            factorial = 1;
            num /= 10;
        }
        if (sum == startNum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
