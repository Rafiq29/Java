package homework_preparing.Step_Project.resources;

import java.util.Scanner;

public class ConsoleApp {
    public static void main(String[] args) {
        chooseCommands();
    }

    private static void chooseCommands() {
        showCommands(CommandParser.generate_command());
        int temp = new Scanner(System.in).nextInt();
        switch (temp) {
            case 0:
                throw new IllegalArgumentException("Not implemented yet");
            case 1:
                throw new IllegalArgumentException("Not implemented yet");
            case 2:
                throw new IllegalArgumentException("Not implemented yet");
            case 3:
                throw new IllegalArgumentException("Not implemented yet");
            case 4:
                System.exit(888);
            default:
                throw new IllegalArgumentException("Something went wrong");
        }
    }

    private static void showCommands(Items[] generate_command) {
        for (int i = 0; i < generate_command.length; i++) {
            System.out.println(i + " " + generate_command[i]);
        }
    }
}
