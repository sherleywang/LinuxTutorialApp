package androidapps.linuxtutorialapp;

import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

// a class for emulating the terminal
public class Terminal {

    private String content;
    private Commands commands;
    private FolderTree directory;
    private EditText input;
    private TextView display;

    public Terminal(FolderTree directory, TextView display, EditText input, ArrayList<String> commands) {
        content = "";
        this.directory = directory;
        this.display = display;
        this.input = input;
        this.commands = new Commands(commands);
    }

    public String getContent() {
        return content;
    }

    // call this method upon pressing enter/submit
    public void submit() {
        String userInput = input.getText().toString();
        updateTerminal(userInput);
    }

    // update the display of the terminal
    private void updateTerminal(String userInput) {
        addUserInput(userInput);
        content += "\n";
        addTerminalResponse(userInput);
        content += "\n";
    }

    private void addUserInput(String userInput) {
        String header = "root:" + getDirectory() + "$ ";
        content += header + userInput;
    }

    private String getDirectory() {
        return directory.getDirectory();
    }

    private void addTerminalResponse(String userInput) {
        String result = commands.parseCommands(directory, userInput);
        content += result;
    }
}
