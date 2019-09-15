package androidapps.linuxtutorialapp;

import android.widget.EditText;
import android.widget.TextView;

// a class for emulating the terminal
public class Terminal {

    private String content;
    private String directory;
    private EditText input;
    private TextView display;
    private Commands command;

    public Terminal(String directory, TextView display, EditText input) {
        content = "";
        this.directory = directory;
        this.display = display;
        this.input = input;
        command = new Commands();
    }

    // call this method upon pressing enter/submit
    public void submit() {
        String userInput = input.getText().toString();
        updateTerminal(userInput);
    }

    // update the display of the terminal
    private void updateTerminal(String userInput) {
        content += "\n";
        addUserResponse(userInput);
        content += "\n";
        addTerminalResponse(userInput);
    }

    private void addUserResponse(String userInput) {
        String header = "root:" + directory + "$ ";
        content += header + userInput;
    }

    private void addTerminalResponse(String userInput) {
        if (userInput.length() != 0) {
            boolean dirCommand = command.getType(userInput);
            if (dirCommand)
                return;
            else
                return;
        }
    }
}
