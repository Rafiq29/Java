package homework_preparing.Step_Project.resources;

public class Core {
    private Console console;
    private FlightController fc;
    private BookController bc;
    private SystemConsole show;

    public Core(Console c) {
        this.console = c;
       // this.fc = new FlightController(c);
       // this.bc = new BookController(c);
    }
   void run()
    {
        boolean exit = false;
        while (!exit) {
          console.println(show.menu());
            String s = console.readln();
            switch (s) {
                case "0":
                    fc.show();
                    break;
//                    throw new IllegalArgumentException("Not implemented yet");
                case "1":
                    fc.showOne();
                    break;
//                    throw new IllegalArgumentException("Not implemented yet");
                case "2":
                    bc.showMy();
                    break;
//                    throw new IllegalArgumentException("Not implemented yet");
                case "3":
                    bc.remove();
                    break;
//                    throw new IllegalArgumentException("Not implemented yet");
                case "4":
                    exit=true; break;
                default:
                    console.println("Wrong input");
                    break;
//                    throw new IllegalArgumentException("Something went wrong");
            }
        }

//        private static void showCommands (Items[]generate_command){
//        for (int i = 0; i < generate_command.length; i++) {
//            System.out.println(i + " " + generate_command[i]);
        }

}
