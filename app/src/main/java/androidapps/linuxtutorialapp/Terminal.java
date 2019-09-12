package androidapps.linuxtutorialapp;

import android.widget.EditText;
import android.widget.TextView;

// a class for emulating the terminal
public class Terminal {

    private String content;
    private String username;

    private EditText input;

    private TextView display;

    public Terminal(String username, TextView display, EditText input) {
        content = "";
        this.username = username;
        this.display = display;
        this.input = input;
    }

    // call this method upon pressing enter/submit
    /* Note to Ace: used a parameter for the String rather than an instance variable so I could
    prevent bugs/errors from editing the String and updating the terminal when it's not necessary */
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
        // change header as necessary
        String header = username + "$ ";
        content += header + text;
    }

    private void addTerminalResponse(String text) {
        // might require another class?
    }
}
