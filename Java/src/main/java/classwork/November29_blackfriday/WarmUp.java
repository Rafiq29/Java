package classwork.November29_blackfriday;

import java.util.Arrays;
import java.util.Scanner;

public class WarmUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Arrays.toString(gen(n)));
    }
//TODO: find the problem and fix it (not working with even ones)
    private static int[] gen(int len) {
        int[] gen = new int[len];
        int right = 0;
        int left = len - 1;
        for (int i = len / 2; i >= 0; i--) {
            gen[left] = i;
            gen[right] = i;
            left = left - 1;
            right = right + 1;
        }
        return gen;
    }
}
