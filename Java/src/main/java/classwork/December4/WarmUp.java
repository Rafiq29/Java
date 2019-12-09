package classwork.December4;

import java.util.stream.Collectors;


public class WarmUp {
    public static void main(String[] args) {
        String s1 = "abcdea";
        System.out.println(filter(s1));
    }

    private static String filter(String origin) {
        return origin.chars().distinct()
                .mapToObj(v -> String.valueOf((char) v))
                .collect(Collectors.joining());
    }
}
