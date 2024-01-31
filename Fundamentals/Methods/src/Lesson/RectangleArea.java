package Lesson;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double width = Double.parseDouble(scan.nextLine());
        double height = Double.parseDouble(scan.nextLine());
        double area = getArea(width, height);
        System.out.println((int) area);
    }

    public static double getArea(double width, double height) {
        return width * height;
    }
}
