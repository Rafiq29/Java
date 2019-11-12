package homework_preparing.Step_Project.resources;


public class MenuItem {
    private final String all_flights = "All flights";
    private final String booking = "Booking";
    private final String my_booking = "My booking";
    private final String help = "Help";
    private final String search = "Search";
    private final String exit = "Exit";

    class Item {
        int value;
        Item move;

        public Item(int value) {
            this.value = value;
        }
    }

    public void choose(int value) {
        Item current;
        switch (value) {
            case 1:
                throw new IllegalArgumentException("Not implemented yet");
            case 2:
                throw new IllegalArgumentException("Not implemented yet");
            case 3:
                throw new IllegalArgumentException("Not implemented yet");
            case 4:
                throw new IllegalArgumentException("Not implemented yet");
            case 5:
                throw new IllegalArgumentException("Not implemented yet");
            case 6:
                System.exit(888);
        }
    }

    public String mainmenu() {
        return String.format("Main Menu \n 1.%s \n 2.%s \n 3.%s \n 4.%s \n 5.%s \n 6.%s"
                , all_flights, booking, my_booking, help, search, exit);
    }
}
