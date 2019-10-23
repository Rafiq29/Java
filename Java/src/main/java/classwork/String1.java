package classwork;

import java.util.Random;
import java.util.stream.IntStream;

public class String1 {
    public static void main(String[] args) {

        Random random= new Random();
        for (int i = 0; i <5 ; i++) {
            char number= (char)(random.nextInt('Z'-'A'+1)+'A');
            String generate= " ";
            generate+=number;
            System.out.print(generate);
        }
    }
}
