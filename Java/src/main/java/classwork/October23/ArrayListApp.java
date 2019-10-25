package classwork.October23;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListApp {
    public static void main(String[] args) {
        ArrayList<Integer> randArr = new ArrayList<Integer>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int rnd1 = random.nextInt(100);
            randArr.add(rnd1);
        }
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();

        for (int i = 0; i < randArr.size(); i++) {
            if (randArr.get(i) % 2 == 0) {
                even.add(randArr.get(i));
            } else {
                odd.add(randArr.get(i));
            }
        }
        System.out.println(randArr);
        System.out.println(even);
        System.out.println(odd);
    }
}
