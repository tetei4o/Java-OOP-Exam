import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int w = Integer.parseInt(scan.nextLine());
        int l = Integer.parseInt(scan.nextLine());
        int h = Integer.parseInt(scan.nextLine());
        int volume = w * l * h;

        String input = scan.nextLine();
        int boxes = 0;
        boolean isAnyVolumeLeft = true;

        while (!input.equals("Done")) {
            int numberOfBoxes = Integer.parseInt(input);
            boxes += numberOfBoxes;
            if (boxes > volume) {
                isAnyVolumeLeft = false;
                break;
            }


            input = scan.nextLine();
        }

        int result = Math.abs(volume - boxes);
        if (isAnyVolumeLeft) {
            System.out.printf("%d Cubic meters left.", result);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", result);
        }

    }
}
