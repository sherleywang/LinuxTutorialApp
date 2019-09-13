package androidapps.linuxtutorialapp;

import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

// a class for emulating the terminal
public class Terminal {

    private String content;
    private String directory;

    private EditText input;

    private TextView display;

    public Terminal(String directory, TextView display, EditText input) {
        content = "";
        this.directory = directory;
        this.display = display;
        this.input = input;
    }

    // call this method upon pressing enter/submit
    public void submit() {
        String text = input.getText().toString();
        updateTerminal(text);
    }

    // update the display of the terminal
    private void updateTerminal(String text) {
        content += "\n";
        addUserResponse(text);
        content += "\n";
        addTerminalResponse(text);
    }

    private void addUserResponse(String text) {
        String header = "root:" + directory + "$ ";
        content += header + text;
    }

    private void addTerminalResponse(String text) {
        // might require another class?
        HashMap<String, ArrayList<String>> dictionary = new HashMap<>();
    }
}
