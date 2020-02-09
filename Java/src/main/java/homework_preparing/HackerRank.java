package homework_preparing;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0 , k-1);
        String largest = "";
        char smallest_ch = 'z';
        char largest_ch = 'A';
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i + k) != 0) {
//                if (s.substring(i, i + k-1)) {
//                    largest_ch = s.charAt(i);
//                }
//                if (s.charAt(i) > smallest_ch) {
//                    smallest_ch = s.charAt(i);
//                }
            }
//        }

            smallest = s.substring(s.indexOf(smallest_ch), s.indexOf(smallest_ch + k));
            largest = s.substring(s.indexOf(largest_ch), s.indexOf(largest_ch + k));

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
