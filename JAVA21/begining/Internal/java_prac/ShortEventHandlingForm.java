import java.awt.*;
import java.awt.event.*;

public class ShortEventHandlingForm {
    public static void main(String[] args) {
        Frame frame = new Frame("Short Event Handling Form");
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        TextField username = new TextField(15);
        TextField password = new TextField(15);
        password.setEchoChar('*');

        CheckboxGroup genderGroup = new CheckboxGroup();
        Checkbox maleCheckbox = new Checkbox("Male", genderGroup, false);
        Checkbox femaleCheckbox = new Checkbox("Female", genderGroup, false);

        Choice qualificationDropdown = new Choice();
        qualificationDropdown.add("High School", "Bachelor's Degree", "Master's Degree");

        Checkbox javaCheckbox = new Checkbox("Java");
        Checkbox pythonCheckbox = new Checkbox("Python");

        Button submitButton = new Button("Submit");
        Button resetButton = new Button("Reset");

        submitButton.addActionListener(e -> printFormData(username, password, maleCheckbox, qualificationDropdown, javaCheckbox, pythonCheckbox));
        resetButton.addActionListener(e -> resetForm(username, password, genderGroup, qualificationDropdown, javaCheckbox, pythonCheckbox));

        frame.add(new Label("Username:"), username, new Label("Password:"), password,
                new Label("Gender:"), maleCheckbox, femaleCheckbox,
                new Label("Qualification:"), qualificationDropdown,
                new Label("Programming Language:"), javaCheckbox, pythonCheckbox,
                submitButton, resetButton);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }

    private static void printFormData(TextField username, TextField password, Checkbox maleCheckbox,
                                      Choice qualificationDropdown, Checkbox javaCheckbox, Checkbox pythonCheckbox) {
        System.out.println("Username: " + username.getText());
        System.out.println("Password: " + password.getText());
        System.out.println("Gender: " + (maleCheckbox.getState() ? "Male" : "Female"));
        System.out.println("Qualification: " + qualificationDropdown.getSelectedItem());
        System.out.println("Languages: " + (javaCheckbox.getState() ? "Java " : "") + (pythonCheckbox.getState() ? "Python" : ""));
    }

    private static void resetForm(TextField username, TextField password, CheckboxGroup genderGroup,
                                  Choice qualificationDropdown, Checkbox javaCheckbox, Checkbox pythonCheckbox) {
        username.setText("");
        password.setText("");
        genderGroup.setSelectedCheckbox(null);
        qualificationDropdown.select(0);
        javaCheckbox.setState(false);
        pythonCheckbox.setState(false);
    }
}
