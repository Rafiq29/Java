package homework_preparing.Step_Project.resources;

public class Core {
    private Console console;
    private FlightController fc;
    private BookController bc;
    public Core(Console c) {
        this.console = c;
       // this.fc = new FlightController(c);
       // this.bc = new BookController(c);
    }
   void run()
    {
        boolean exit = false;
        while (!exit) {
          // console.println(menu);
            String s = console.readln();
            switch (s) {
                case "0":
                    throw new IllegalArgumentException("Not implemented yet");
                case "1":
                    throw new IllegalArgumentException("Not implemented yet");
                case "2":
                    throw new IllegalArgumentException("Not implemented yet");
                case "3":
                    throw new IllegalArgumentException("Not implemented yet");
                case "4":
                    exit=true; break;
                default:
                    throw new IllegalArgumentException("Something went wrong");
            }
        }

//        private static void showCommands (Items[]generate_command){
//        for (int i = 0; i < generate_command.length; i++) {
//            System.out.println(i + " " + generate_command[i]);
        }

}
