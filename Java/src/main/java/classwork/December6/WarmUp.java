package classwork.December6;

import java.util.*;
import java.util.stream.Collectors;

public class WarmUp {
    public static void main(String[] args) {
        ArrayList<Integer> int_arr = new ArrayList<Integer>();
        System.out.println(generate(int_arr));
        System.out.println(repetition(generate(int_arr)));
    }

    private static Map<Integer, Long> repetition(ArrayList<Integer> int_arr) {
       return int_arr.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
    }

    private static ArrayList<Integer> generate(ArrayList<Integer> origin) {
        Random rnd = new Random();
        for (int i = 0; i < 50; i++) {
            int i1 = rnd.nextInt((25-10+1)+10);
            origin.add(i1);
        }
        return origin;
    }
}
