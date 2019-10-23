package classwork.lesson4;

import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        Random random= new Random();
        int randomArray []= new int[20];

        for (int i = 0; i <randomArray.length ; i++) {
            int ram= random.nextInt(10);
            randomArray[i]=ram;
          System.out.print("Random numbers is: "+randomArray[i]);

            if (randomArray[i]%2==0){
                System.out.println(" fizz ");
            }if (randomArray[i]%3==0){
                System.out.println(" buzz ");
            }else {
                System.out.println(" ");
            }
        }
    }
}
