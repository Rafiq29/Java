package classwork.lesson7work;

import java.util.Scanner;

public class ExceptionApp {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter: ");
        String st1= sc.nextLine();
        Transform transform1 = new Transform();
        transform1.transform12(st1);
    }
}