package homework_preparing;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Solution {

    public static boolean getXO (String str) {
//     str  = str.toLowerCase();
        int counter = 0;
        // Good Luck!!
        for(int i = 0; i < str.length(); i++){
            if (str.toLowerCase().charAt(i) == 'x') counter++;
            if (str.toLowerCase().charAt(i) == 'o') counter--;
        }
        return counter == 0;
    }

    public static void main(String[] args) {
        String s1 = "xxXooo";
        String s21 = "Xxxxertr34";
        System.out.println(getXO(s1));
        System.out.println(getXO(s21));
    }
}
