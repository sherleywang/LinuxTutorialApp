package androidapps.linuxtutorialapp.Levels;

import java.util.ArrayList;

public class LevelOne {

    public static void main(String args[]) {
        ArrayList<String> validCommands = new ArrayList<>();
        addCommands(validCommands);
    }

    private static void addCommands(ArrayList<String> validCommands) {
        validCommands.add("ls al");
    }

}
