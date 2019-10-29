package homework_preparing;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class Stringwork {
    static String str(String s, char c) {
        return new StringBuilder(s).append(c).append(c).toString();
    }

    static String[] splitByRegExPipe(final String text) {
        return text.split("\\s+");
    }

    static String[] splitByPatternPipe(final String text) {
        return text.split(Pattern.quote("|"));
    }

    static IntStream getStream(String text) {
        return text.chars();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st1 = sc.nextLine();
        char ch = sc.next().charAt(0);
        String str_Sample = "RockStar";
        System.out.println("Compare To 'ROCKSTAR': " + str_Sample.compareTo("rockstar"));
        //Compare to - Ignore case
        System.out.println("Compare To 'ROCKSTAR' - Case Ignored: " + str_Sample.compareToIgnoreCase("ROCKSTAR"));
        System.out.println(str(st1, ch));
        System.out.println(Arrays.toString(splitByRegExPipe(st1)));
        System.out.println(Arrays.toString(splitByPatternPipe(st1)));
        System.out.println(getStream(st1));
    }

    //  static int str1(char c){
    //      return (int)c;
    //  }
    //  char ASCIIval(int value){
    //      Assert.isTrue(value >= 0 && value < 65536, "value is not a valid character");
    //      return (char) value;
    //  }

}
