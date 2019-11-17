package homework_preparing.Step_Project.resources;


public class Application {
    public static void main(String[] args) {
        Console c = new SystemConsole();
        Core app = new Core(c);
        app.run();
    }
}
