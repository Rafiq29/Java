package classwork.November1;

import java.util.Arrays;

public abstract class Bitwise {
    public static void main(String[] args) {
        int a=73;
        int[] bit =new int[8];
        int remainder;

        for (int i = 7; i>0; i--) {
            int temp=a;
            a=a<<1;
            remainder=temp-(a>>1);
            bit[i]=remainder;
        }
        System.out.println(Arrays.toString(bit));
    }
}
