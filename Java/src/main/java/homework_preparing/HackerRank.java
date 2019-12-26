package homework_preparing;

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map <String,Integer> pbook = new HashMap<>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            pbook.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if (pbook.containsKey(s)) {
                System.out.println(s+"="+pbook.get(s));
            }
            else System.out.println("Not found");
        }
        in.close();
    }
}


