package classwork.November15;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

public class WarmUp {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] int_arr = new int[30];

//        int_arr= Stream.generate(()-> (int)(Math.random()*((10 + 10) + 1)) -10)
//                .limit(30)
//                .filter()
        for (int i = 0; i < 30; i++) {
            int i1 = rnd.nextInt(((10 + 10) + 1) - 10);
            int_arr[i] = i1;
        }
//        for (int i = 0; i < int_arr.length; i++) {
//            swap(int_arr, int_arr[i], int_arr[i + 1]);
//        }
    }

    private static void swap(int[] exp, int index1, int index2) {
        int t = exp[index1];
        exp[index1] = exp[index2];
        exp[index2] = t;
    }

}
