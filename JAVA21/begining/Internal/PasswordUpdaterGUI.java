import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PasswordUpdaterGUI extends JFrame {

    private JTextField oldPasswordTextField;
    private JTextField newPasswordTextField;
    private JTextField usernameTextField;

    private static final String JDBC_URL = "jdbc:mysql://127.0.0.1:3306/saikiran";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "RootPassword";

    public PasswordUpdaterGUI() {
        super("Password Updater");

        // Create components
        oldPasswordTextField = new JTextField(20);
        newPasswordTextField = new JTextField(20);
        usernameTextField = new JTextField(20);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updatePassword();
            }
        });

        // Create layout
        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
        panel.add(new JLabel("Old Password:"));
        panel.add(oldPasswordTextField);
        panel.add(new JLabel("New Password:"));
        panel.add(newPasswordTextField);
        panel.add(new JLabel("Username:"));
        panel.add(usernameTextField);
        panel.add(new JLabel()); // Empty label for spacing
        panel.add(submitButton);

        // Set frame layout and size
        setLayout(new BorderLayout());
        add(panel, BorderLayout.CENTER);
        pack();

        // Set frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void updatePassword() {
        String oldPassword = oldPasswordTextField.getText();
        String newPassword = newPasswordTextField.getText();
        String username = usernameTextField.getText();

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection
            try (Connection connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD)) {

                // Update the password in the database
                updatePassword(connection, oldPassword, newPassword, username);

                JOptionPane.showMessageDialog(this, "Password updated successfully!");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error updating password: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updatePassword(Connection connection, String oldPassword, String newPassword, String username) throws SQLException {
        String updateQuery = "UPDATE users SET password = ? WHERE username = ? AND password = ?";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
            preparedStatement.setString(1, newPassword);
            preparedStatement.setString(2, username);
            preparedStatement.setString(3, oldPassword);

            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated == 0) {
                JOptionPane.showMessageDialog(this, "Invalid old password or username", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PasswordUpdaterGUI());
    }
}
