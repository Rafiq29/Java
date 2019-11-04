package classwork.November4;

public class FibonacciApp {
    public static void main(String[] args) {
        FibonacciApp app = new FibonacciApp();
        int fib = app.fibo(46);  //will get the value "55" when you get the first salary
        System.out.println(fib);
    }

    private int fibo(int value) {
        if(value==1 ||value==2) return 1;
        int fib= fibo(value-1)+fibo(value-2);
        return fib;
    }


}
