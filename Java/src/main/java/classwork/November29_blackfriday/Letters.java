package classwork.November29_blackfriday;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Letters {
    public static void main(String[] args) {
        ArrayList<String> ch_arr = new ArrayList<>();
        ch_arr.add("A");
        ch_arr.add("B");
        ch_arr.add("D");
        ch_arr.add("C");
        ch_arr.add("E");
        ch_arr.add("F");
        ch_arr.add("G");
        ch_arr.add("V");
        System.out.println(poss(ch_arr));
    }

    private static List<String> poss(ArrayList<String> characters) {
        return characters.stream().flatMap(ch1 ->
                characters.stream().filter(ch2 -> !ch1.equals(ch2)).map(ch2 ->
                        ch1+ch2)).collect(Collectors.toList());
    }
}
