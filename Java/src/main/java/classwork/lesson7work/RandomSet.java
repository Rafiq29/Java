package classwork.lesson7work;

import java.util.*;


public class RandomSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        while (set.size() < 20) {
            set.add((int) (Math.random() * 21) - 10);
        }
        System.out.println(set);
    }
}
