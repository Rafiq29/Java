package homework_preparing.hw4;

import java.util.ArrayList;

public class Pet{
    private final String species;
    private final String nickname;
    private final int age;
    private final ArrayList<Integer> trickLevel= new ArrayList<>();
    private final ArrayList<String> habits = new ArrayList<>();

    public Pet(String species, String nickname, int age, ArrayList<Integer> trickLevel, ArrayList<String> habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        //this.trickLevel=trickLevel;
      //  this.habits = habits;
    }
}
