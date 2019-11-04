package classwork.November4;

public class FactorialApp {
    public static void main(String[] args) {
        FactorialApp app = new FactorialApp();
        int f5 = app.fact(15);
        System.out.println(f5);
    }

    private int fact(int value) {
        if (value == 1) return 1;
        return value * fact(value - 1);
    }
}
