package classwork.December9;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WarmUp {
    public static void main(String[] args) {
        Stream.generate(() -> (int) (Math.random() * (25 + 25 + 1) - 25))
                .limit(50)
                .collect(Collectors.groupingBy(x -> {
                    if (x < -10) return -1;
                    if (x > 10) return 1;
                    else return 0;
                        }
                )).forEach((k, v) -> System.out.printf("%s: %s\n", k == 1 ? "gt" : k == -1 ? "lt" : "rt", v));
    }
}