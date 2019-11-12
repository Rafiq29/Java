package homework_preparing.Step_Project.Console;

import homework_preparing.Step_Project.resources.MenuItem;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuItem mn = new MenuItem();
        int choose = sc.nextInt();
        System.out.println(mn.mainmenu());
        System.out.println("Enter option: "+choose);
      //  System.out.println(mn.choose(choose));
    }
}
