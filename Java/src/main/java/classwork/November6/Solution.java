package classwork.November6;

public class Solution {
    public static void main(String[] args) {
        String S = "RLRLLLLLRRRR";
        System.out.println(solution(S));
    }

    public static int solution(String s) {
        int counter = 0;
        int max_counter=0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'R':
                    counter++;
                    break;
                case 'L':
                    counter--;
                    break;
                default:
                   throw new IllegalArgumentException("Wrong character");
            }
            if (counter==0) max_counter++;
        }
        if (counter != 0) throw new  IllegalArgumentException("Doesn't match");
        return max_counter;
    }
}
