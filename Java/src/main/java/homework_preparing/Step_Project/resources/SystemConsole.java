package homework_preparing.Step_Project.resources;

import java.util.Scanner;
import java.util.StringJoiner;

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

    public String menu() {
      // Items items = new Items();
      // StringJoiner sj = new StringJoiner("\n");
      // for (int counter = 0; counter < items.getArr().length; counter++)
      // return sj.add(String.valueOf(counter)).add(String.valueOf(items.getArr())).toString();
        return "d";
    }
}
