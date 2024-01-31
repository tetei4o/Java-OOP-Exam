package Lesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Gabi","Tedi","Ivo"));
        System.out.println(names.contains("Bogi"));
    }
}
