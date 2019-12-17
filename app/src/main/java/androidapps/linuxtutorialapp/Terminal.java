package androidapps.linuxtutorialapp;

import android.widget.EditText;
import android.widget.TextView;

// a class for emulating the terminal
public class Terminal {

    private String content;
    private EditText input;
    private TextView display;

    public Terminal(TextView display, EditText input) {
        content = "";
        this.display = display;
        this.input = input;
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
        return "";
    }

    private void addTerminalResponse(String userInput) {

    }
}
