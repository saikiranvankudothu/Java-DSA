import java.awt.*;

public class AwtApp extends Frame {
    AwtApp(){
        Label firstName = new Label("First Name");
        firstName.setBounds(20,50,80,20);

        Label lastName = new Label("last Name");
        firstName.setBounds(20,50,80,20);

        Label dob = new Label("Date of Birth");
        dob.setBounds(20,110,80,20);

        TextField firstNameTF = new TextField();
        firstNameTF.setBounds(120,50,100,20);

        TextField lastNameTF = new TextField();
        lastNameTF.setBounds(120,80,100,20);

        TextField dobTF = new TextField();
        dobTF.setBounds(120,110,100,20);

        Button sbmt = new Button("Submit");
        sbmt.setBounds(20,160,100,30);

        Button reset = new Button("Reset");
        reset.setBounds(120,160,100,30);

        add(firstName);
        add(lastName);
        add(dob);
        add(firstNameTF);
        add(lastNameTF);
        add(dobTF);
        add(sbmt);
        add(reset);

        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        AwtApp awt  = new AwtApp();
    }
}

