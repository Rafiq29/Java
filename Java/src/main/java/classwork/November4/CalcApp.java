package classwork.November4;

public class CalcApp {
    public static void main(String[] args) {
        String origin = "()()()()()";
        calc(origin);
    }

    public static int calc(String nest) {
        int level = 0;
        int max_level = 0;
        for (int i = 0; i < nest.length(); i++) {
            char c = nest.charAt(i);
            switch (c) {
                case '(':
                    level++;
                    break;
                case ')':
                    level--;
                    break;
                default: throw new IllegalArgumentException("wrong char");
            }
            if (level<0) throw new IllegalArgumentException("smth went wrong");
            max_level = Math.max(max_level, level);
        }
        if(level>0) throw new IllegalArgumentException("smth went wrong");
        return max_level;
    }
}
