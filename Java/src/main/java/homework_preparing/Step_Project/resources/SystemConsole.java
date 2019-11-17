package homework_preparing.Step_Project.resources;

import java.util.Scanner;

public class SystemConsole implements Console {
    Scanner sc = new Scanner(System.in);
    @Override
    public void println(String s) {
        System.out.println(s);
    }

    @Override
    public String readln() {
        return sc.nextLine();
    }
}
