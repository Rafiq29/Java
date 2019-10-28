package classwork.October28;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Rnd {
    public static void main(String[] args) {
        String collected = Stream.generate(() -> (int) (Math.random() * (20 + 20) - 20))
                .limit(10)
                .map(integer -> integer.toString())
                .collect(Collectors.joining(", "));

        System.out.println(collected);
    }
}
