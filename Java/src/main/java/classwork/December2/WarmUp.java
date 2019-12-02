package classwork.December2;

import java.util.*;

public class WarmUp {
    public static void main(String[] args) {
        Random rnd = new Random();
        int num2 = rnd.nextInt(5);
        int num3 = rnd.nextInt(5);
        int[][] int_arr = new int[num2][num3];
        System.out.println(Arrays.deepToString(generate(int_arr)));
        System.out.println(min_element(int_arr));
        System.out.println(sorted(int_arr));
    }

    private static int min_element(int[][] int_arr) {
        return 0;
    }

    private static List sorted(int[][] arr) {
        List<Integer>integerList = new ArrayList<>();
//        return Arrays.stream(arr).sorted().map();
        return integerList;
    }

    private static int[][] generate(int[][] arr) {
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int num = rnd.nextInt(75);
                arr[i][j] = num;
            }
        }
        return arr;
    }
}
