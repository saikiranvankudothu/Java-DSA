import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrimeNumberCalculator extends JFrame {
    private JTextField fromTextField, toTextField;
    private JButton submitButton;
    private JTextArea resultTextArea;

    public PrimeNumberCalculator() {
        // Set up the frame
        setTitle("Prime Number Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        fromTextField = new JTextField(10);
        toTextField = new JTextField(10);
        submitButton = new JButton("Submit");
        resultTextArea = new JTextArea(10, 30);

        // Add components to the frame
        add(new JLabel("From: "));
        add(fromTextField);
        add(new JLabel("To: "));
        add(toTextField);
        add(submitButton);
        add(new JScrollPane(resultTextArea));

        // Attach action listener to the submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateAndDisplayPrimes();
            }
        });

        // Set layout
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        // Display the frame
        setVisible(true);
    }

    private void calculateAndDisplayPrimes() {
        // Get 'from' and 'to' values from text fields
        int from = Integer.parseInt(fromTextField.getText());
        int to = Integer.parseInt(toTextField.getText());

        // Validate input
        if (from < 2 || to < 2 || from > to) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid range.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Clear previous results
        resultTextArea.setText("");

        // Calculate and display prime numbers
        for (int i = from; i <= to; i++) {
            if (isPrime(i)) {
                resultTextArea.append(i + " is prime.\n");
            }
        }
    }

    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PrimeNumberCalculator();
            }
        });
    }
}
