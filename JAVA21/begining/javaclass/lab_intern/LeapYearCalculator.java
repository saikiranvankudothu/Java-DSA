import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearCalculator extends JFrame {

    private JTextField fromYearTextField, toYearTextField;
    private JButton submitButton;

    public LeapYearCalculator() {
        // Set up the frame
        setTitle("Leap Year Calculator");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        JLabel fromLabel = new JLabel("From Year:");
        JLabel toLabel = new JLabel("To Year:");
        fromYearTextField = new JTextField(10);
        toYearTextField = new JTextField(10);
        submitButton = new JButton("Submit");

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateLeapYears();
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(fromLabel)
                        .addComponent(toLabel))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(fromYearTextField)
                        .addComponent(toYearTextField)
                        .addComponent(submitButton))
        );

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(fromLabel)
                        .addComponent(fromYearTextField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(toLabel)
                        .addComponent(toYearTextField))
                .addComponent(submitButton)
        );

        // Set default close operation and make the frame visible
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    private void calculateLeapYears() {
        try {
            int fromYear = Integer.parseInt(fromYearTextField.getText());
            int toYear = Integer.parseInt(toYearTextField.getText());

            int leapYearCount = 0;
            for (int year = fromYear; year <= toYear; year++) {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    leapYearCount++;
                }
            }

            JOptionPane.showMessageDialog(this, "Number of leap years between "
                    + fromYear + " and " + toYear + ": " + leapYearCount);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid integer values for the years.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LeapYearCalculator();
            }
        });
    }
}
