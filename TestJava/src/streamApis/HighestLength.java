package streamApis;

import java.util.Arrays;
import java.util.Comparator;

public class HighestLength {
    public static void main(String[] args) {
        String str = "I am learning java complex programs";
        String[] words = str.split(" ");
        String s = Arrays.stream(words).max(Comparator.comparing(String::length)).get();
        System.out.println(s);
    }

}
