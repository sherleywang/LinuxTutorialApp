package androidapps.linuxtutorialapp;

import java.util.TreeMap;

public class Commands {

    private TreeMap<String, Boolean> typeDict;

    public Commands() {
        typeDict = createDict();
    }

    public TreeMap<String, Boolean> createDict() {
        TreeMap<String, Boolean> result = new TreeMap<>();
        String[] commandArray = new String[] {"ls", "cd", "mkdir"};
        boolean[] type = new boolean[] {true, true, true};
        int index = 0;
        for (String s : commandArray) {
            result.put(s, type[index]);
            index++;
        }
        return result;
    }

    public boolean getType(String userInput) {
        int index = 0;
        char current;
        String userCommand = "";
        while (index < userInput.length()) {
            current = userInput.charAt(index);
            if (current == ' ')
                break;
            else
                userCommand += current;
        }
        if (typeDict.containsKey(userCommand)) {
            return typeDict.get(userCommand);
        } else {
            // error handling, if user types in an invalid command
            return false;
        }
    }

}
