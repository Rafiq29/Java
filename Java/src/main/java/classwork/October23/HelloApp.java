package classwork.October23;

import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Queue;

public class HelloApp {
    public static void main(String[] args) {
        final String origin = "'Hello, world!";
        String lowered = origin.toLowerCase();
        String [] split= origin.split("");
        HashSet<Character> letters= new HashSet<>();
        for (int i = 0; i<lowered.length();i++) {
            char realchar=lowered.charAt(i);
            if(Character.isLetter(realchar)){
                letters.add(realchar);
            }
        }
        HashMap<Character,Integer> map= new HashMap<>();
        letters.forEach(letter -> map.put(letter,0));
        System.out.println(map);
    }
}
