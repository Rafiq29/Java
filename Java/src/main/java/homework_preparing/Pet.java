package homework_preparing;

import java.util.ArrayList;

public class Pet{
    private final String species;
    private final String nickname;
    private final int age;
    private final int[] trickLevel;
    //private final ArrayList<String> habits;

    public Pet(String species, String nickname, int age, int []trickLevel) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel=trickLevel;
    }
}
