package classwork.November1;

public class Overflow {

    static long add(long a, long b) {
        if (a+b >= Long.MAX_VALUE ) {
            throw new IllegalArgumentException("Wrong");
        }else {
            return a + b;
        }
    }

    public static void main(String[] args) {
        long a = 9223372036854775774L;
        long b = 34;
        long c = add(a, b);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
