import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

class Account implements Serializable {
    String name;
    int account_number;
    String pin;
    double Amount;
    String address;
    int postalCode;
    int dateOfBirth;
    double contactNumber;
    String occupation;
    double governmentID;
    String email;
    Account() { // Default constructor with no parameters
        name = null;
        account_number = 0;
        pin = null;
        Amount = 0;
        address = null;
        postalCode = 0;
        dateOfBirth = 0;
        contactNumber = 0;
        occupation = null;
        governmentID = 0;
        email = null;
    }
    Account(String n, int acc, String pi, double amt, String addr, int postal, int dob,
            double contact, String occ, double govID, String mail) {
                // Parameterized constructor with multiple parameters
        name = n;
        account_number = acc;
        pin = pi;
        Amount = 1000 + amt;
        address = addr;
        postalCode = postal;
        dateOfBirth = dob;
        contactNumber = contact;
        occupation = occ;
        governmentID = govID;
        email = mail;
    }

    public void setName(String n) {
        name = n;
    }

    public void setAccountNumber(int n) {
        account_number = n;
    }

    public void setPIN(String p) {
        pin = p;
    }

    public void setAmount(double a) {
        Amount = a;
    }

    public String getName() {
        return name;
    }
    public double setContactNumber(){
        return contactNumber;
    }

    public int getAccountNumber() {
        return account_number;
    }

    public String getPIN() {
        return pin;
    }

    public double getAmount() {
        return Amount;
    }
    public double getContactNumber(){
        return contactNumber;
    }
}

class Bank {
    ArrayList<Account> AL = new ArrayList<>();
    private Frame inputFrame;
    private Frame transferFrame;

    private void addCloseButton(Frame frame) {
    Button closeButton = new Button("Close");
    frame.add(closeButton);

    closeButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
        }
    });
}


public void addNewRecord(Frame parentFrame) {
    try {
        TextField nameField = new TextField();
        TextField accountField = new TextField();
        JPasswordField pinField = new JPasswordField();
        TextField amountField = new TextField();
        TextField addressField = new TextField();
        TextField postalCodeField = new TextField();
        TextField dobField = new TextField();
        TextField contactNumberField = new TextField();
        TextField occupationField = new TextField();
        TextField governmentIDField = new TextField();
        TextField emailField = new TextField();

        Frame inputFrame = new Frame("Create New Account");
        inputFrame.setLayout(new GridLayout(0, 2));
        inputFrame.add(new Label("Name: "));
        inputFrame.add(nameField);
        inputFrame.add(new Label("PIN: "));
        inputFrame.add(pinField);
        inputFrame.add(new Label("Amount: "));
        inputFrame.add(amountField);
        inputFrame.add(new Label("Address: "));
        inputFrame.add(addressField);
        inputFrame.add(new Label("Postal Code: "));
        inputFrame.add(postalCodeField);
        inputFrame.add(new Label("Date of Birth: "));
        inputFrame.add(dobField);
        inputFrame.add(new Label("Contact Number: "));
        inputFrame.add(contactNumberField);
        inputFrame.add(new Label("Occupation: "));
        inputFrame.add(occupationField);
        inputFrame.add(new Label("Government ID: "));
        inputFrame.add(governmentIDField);
        inputFrame.add(new Label("Email: "));
        inputFrame.add(emailField);

        Button submitButton = new Button("Submit");
        inputFrame.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String n = nameField.getText().trim();
                    if (n.isEmpty()) {
                        showMessageDialog(inputFrame, "Name cannot be empty. Please enter a valid name.");
                        return;
                    }
                    int a = generateRandomAccountNumber();
                    String p = new String(pinField.getPassword());
                    // Validate and parse numeric fields
                    double am = parseDoubleField(amountField, "Amount");
                    int postal = parseIntField(postalCodeField, "Postal Code");
                    int dob = parseIntField(dobField, "Date of Birth");
                    double contact = parseDoubleField(contactNumberField, "Contact Number");
                    double govID = parseDoubleField(governmentIDField, "Government ID");
                    String addr = addressField.getText();
                    String occ = occupationField.getText();
                    String mail = emailField.getText();

                    Account ac = new Account(n, a, p, am, addr, postal, dob, contact, occ, govID, mail);
                    AL.add(ac);
                    inputFrame.dispose();
                    JOptionPane.showMessageDialog(parentFrame,
                            "Account created successfully!\nAccount Number: " + ac.getAccountNumber(),
                            "Success", JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException ex) {
                    // Already handled in the parse methods
                }
            }
        });

        // Use the addCloseButton method to add the close button
        addCloseButton(inputFrame);

        inputFrame.setSize(400, 200);
        inputFrame.setVisible(true);
    } catch (NumberFormatException ex) {
        showMessageDialog(inputFrame, "Invalid input. Please enter valid numbers.");
    }
}

// Helper method to parse and validate double fields
private double parseDoubleField(TextField textField, String fieldName) throws NumberFormatException {
    try {
        return Double.parseDouble(textField.getText());
    } catch (NumberFormatException ex) {
        showMessageDialog(inputFrame, "Invalid input for " + fieldName + ". Please enter a valid number.");
        throw ex;
    }
}

// Helper method to parse and validate integer fields
private int parseIntField(TextField textField, String fieldName) throws NumberFormatException {
    try {
        return Integer.parseInt(textField.getText());
    } catch (NumberFormatException ex) {
        showMessageDialog(inputFrame, "Invalid input for " + fieldName + ". Please enter a valid number.");
        throw ex;
    }
}

    private int generateRandomAccountNumber() {
        Random random = new Random();
        int generatedNumber;
        boolean isUnique;

        do {
            isUnique = true; // Assume the number is unique until proven otherwise
            generatedNumber = 10000000 + random.nextInt(90000000);

            // Check if the generated number already exists in the account list
            for (Account account : AL) {
                if (account.getAccountNumber() == generatedNumber) {
                    isUnique = false;
                    break; // Exit the loop if the number is not unique
                }
            }
        } while (!isUnique);

        return generatedNumber;
    }
    

public void transfer(Frame parentFrame) {
    try{
    Frame transferFrame = new Frame("Transfer Money");
    transferFrame.setLayout(new GridLayout(5, 2));

    TextField senderAccField = new TextField();
    JPasswordField senderPinField = new JPasswordField();
    TextField receiverAccField = new TextField();
    TextField amountField = new TextField();

    transferFrame.add(new Label("Sender's Account Number: "));
    transferFrame.add(senderAccField);
    transferFrame.add(new Label("Sender's PIN: "));
    transferFrame.add(senderPinField);
    transferFrame.add(new Label("Receiver's Account Number: "));
    transferFrame.add(receiverAccField);
    transferFrame.add(new Label("Amount to Transfer: "));
    transferFrame.add(amountField);

    Button transferButton = new Button("Transfer");
    transferFrame.add(transferButton);

    transferButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int s_acc = Integer.parseInt(senderAccField.getText());
            String s_pin = new String(senderPinField.getPassword());
            int sender_index = -1;
            for (int i = 0; i < AL.size(); i++) {
                if (AL.get(i).getAccountNumber() == s_acc && AL.get(i).getPIN().equals(s_pin))
                    sender_index = i;
            }

            if (sender_index == -1) {
                showMessageDialog(transferFrame, "Sender's Account not Found");
                return;
            }

            int r_acc = Integer.parseInt(receiverAccField.getText());

            int receiver_index = -1;
            for (int i = 0; i < AL.size(); i++) {
                if (AL.get(i).getAccountNumber() == r_acc)
                    receiver_index = i;
            }

            if (receiver_index == -1) {
                showMessageDialog(transferFrame, "Receiver's Account not Found");
                return;
            }

            double amount = Double.parseDouble(amountField.getText());
            if (AL.get(sender_index).getAmount() >= amount) {
                AL.get(receiver_index).setAmount(AL.get(receiver_index).getAmount() + amount);
                AL.get(sender_index).setAmount(AL.get(sender_index).getAmount() - amount);
                showMessageDialog(transferFrame, "Transfer successful");
            } else {
                showMessageDialog(transferFrame, "Sender does not have enough balance");
            }
        }
    });
    addCloseButton(transferFrame);
    transferFrame.setSize(400, 200);
    transferFrame.setVisible(true);
} catch (NumberFormatException ex) {
            showMessageDialog(transferFrame, "Invalid input. Please enter a valid number.");
        }
    }

public void withdraw(Frame parentFrame) {
    Frame withdrawFrame = new Frame("Withdraw Money");
    withdrawFrame.setLayout(new GridLayout(4, 2));

    TextField accField = new TextField();
    JPasswordField pinField = new JPasswordField();
    TextField amountField = new TextField();

    withdrawFrame.add(new Label("Account Number: "));
    withdrawFrame.add(accField);
    withdrawFrame.add(new Label("PIN: "));
    withdrawFrame.add(pinField);
    withdrawFrame.add(new Label("Amount to Withdraw: "));
    withdrawFrame.add(amountField);

    Button withdrawButton = new Button("Withdraw");
    withdrawFrame.add(withdrawButton);

    withdrawButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int p_acc = Integer.parseInt(accField.getText());
            String p_pin = new String(pinField.getPassword());


            int person_index = -1;
            for (int i = 0; i < AL.size(); i++) {
                if ((AL.get(i).getAccountNumber() == p_acc) && (AL.get(i).getPIN().equals(p_pin))) {
                    person_index = i;
                }
            }

            if (person_index == -1) {
                showMessageDialog(withdrawFrame, "Account not Found");
                return;
            }

            double amount = Double.parseDouble(amountField.getText());
            if (AL.get(person_index).getAmount() >= amount) {
                AL.get(person_index).setAmount(AL.get(person_index).getAmount() - amount);
                showMessageDialog(withdrawFrame, "Withdrawal successful");
            } else {
                showMessageDialog(withdrawFrame, "Insufficient balance");
            }
        }
    });

    addCloseButton(withdrawFrame);
    withdrawFrame.setSize(400, 200);
    withdrawFrame.setVisible(true);
}

public void depositMoney(Frame parentFrame) {
    Frame depositFrame = new Frame("Deposit Money");
    depositFrame.setLayout(new GridLayout(4, 2));

    TextField accField = new TextField();
    JPasswordField pinField = new JPasswordField();
    TextField amountField = new TextField();

    depositFrame.add(new Label("Account Number: "));
    depositFrame.add(accField);
    depositFrame.add(new Label("PIN: "));
    depositFrame.add(pinField);
    depositFrame.add(new Label("Amount to Deposit: "));
    depositFrame.add(amountField);

    Button depositButton = new Button("Deposit");
    depositFrame.add(depositButton);

    depositButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int p_acc = Integer.parseInt(accField.getText());
            String p_pin = new String(pinField.getPassword());

            int person_index = -1;
            for (int i = 0; i < AL.size(); i++) {
                if ((AL.get(i).getAccountNumber() == p_acc) && (AL.get(i).getPIN().equals(p_pin))) {
                    person_index = i;
                }
            }

            if (person_index == -1) {
                showMessageDialog(depositFrame, "Account not Found");
                return;
            }

            double amount = Double.parseDouble(amountField.getText());
            AL.get(person_index).setAmount(AL.get(person_index).getAmount() + amount);
            showMessageDialog(depositFrame, "Deposit successful. New balance: " + AL.get(person_index).getAmount());
        }
    });

    addCloseButton(depositFrame);
    depositFrame.setSize(400, 200);
    depositFrame.setVisible(true);
}



public void closeAccount(Frame parentFrame) {
    Frame closeFrame = new Frame("Close Bank Account");
    closeFrame.setLayout(new GridLayout(4, 2));

    TextField accField = new TextField();
    JPasswordField pinField = new JPasswordField();
    TextField nameField = new TextField();

    closeFrame.add(new Label("Account Number: "));
    closeFrame.add(accField);
    closeFrame.add(new Label("PIN: "));
    closeFrame.add(pinField);
    closeFrame.add(new Label("Name: "));
    closeFrame.add(nameField);

    Button closeButton = new Button("Close Account");
    closeFrame.add(closeButton);

    closeButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int acc = Integer.parseInt(accField.getText());
            String pin = new String(pinField.getPassword());
            String name = nameField.getText();

            int accountIndex = -1;
            for (int i = 0; i < AL.size(); i++) {
                Account account = AL.get(i);
                if (account.getAccountNumber() == acc && account.getPIN().equals(pin) && account.getName().equals(name)) {
                    accountIndex = i;
                    break;
                }
            }

            if (accountIndex != -1) {
                AL.remove(accountIndex);
                showMessageDialog(closeFrame, "Account closed successfully");
            } else {
                showMessageDialog(closeFrame, "Account not found or details are incorrect");
            }
        }
    });
    

    addCloseButton(closeFrame);
    closeFrame.setSize(400, 200);
    closeFrame.setVisible(true);
}
    private void showMessageDialog(Frame parentFrame, String message) {
        Dialog dialog = new Dialog(parentFrame, "Message", true);
        dialog.setLayout(new FlowLayout());
        dialog.add(new Label(message));
        Button closeButton = new Button("OK");
        dialog.add(closeButton);

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
            }
        });

        dialog.setSize(250, 100);
        dialog.setVisible(true);
    }

public void forgotPin(Frame parentFrame) {
    Frame forgotPinFrame = new Frame("Forgot PIN");
    forgotPinFrame.setLayout(new GridLayout(0, 2));

    TextField nameField = new TextField();
    TextField accountField = new TextField();
    TextField contactNumberField = new TextField();

    forgotPinFrame.add(new Label("Name: "));
    forgotPinFrame.add(nameField);
    forgotPinFrame.add(new Label("Account Number: "));
    forgotPinFrame.add(accountField);
    forgotPinFrame.add(new Label("Contact Number: "));
    forgotPinFrame.add(contactNumberField);

    Button retrievePinButton = new Button("Retrieve PIN");
    forgotPinFrame.add(retrievePinButton);

    retrievePinButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = nameField.getText();
            int accountNumber;
            double contactNumber;

            try {
                accountNumber = Integer.parseInt(accountField.getText().trim());
                contactNumber = Double.parseDouble(contactNumberField.getText().trim());
            } catch (NumberFormatException ex) {
                showMessageDialog(forgotPinFrame, "Invalid input for account number or contact number.");
                return;
            }

            // Search for the account based on the provided details
            for (Account account : AL) {
                if (account.getName().equals(name)
                        && account.getAccountNumber() == accountNumber
                        && Double.compare(account.getContactNumber(), contactNumber) == 0) {
                    showMessageDialog(forgotPinFrame, "Your PIN is: " + account.getPIN());
                    return;
                }
            }

            showMessageDialog(forgotPinFrame, "Account details not found. Please check your information.");
        }
    });

    // Use the addCloseButton method to add the close button
    addCloseButton(forgotPinFrame);

    forgotPinFrame.setSize(400, 200);
    forgotPinFrame.setVisible(true);
}
 
public void print(Frame parentFrame) {
    Frame printFrame = new Frame("Print All Accounts");
    printFrame.setLayout(new BorderLayout());

    TextArea textArea = new TextArea();

    for (int i = 0; i < AL.size(); i++) {
        textArea.append("\nName: " + AL.get(i).getName() +
                "\nAccount Number: " + AL.get(i).getAccountNumber() +
                "\nBalance: " + AL.get(i).getAmount() + "\n");
    }

    printFrame.add(textArea, BorderLayout.CENTER);

    // Close button to dispose the printFrame
    Button closeButton = new Button("Close");
    printFrame.add(closeButton, BorderLayout.SOUTH);

    closeButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            printFrame.dispose();
        }
    });

    printFrame.setSize(400, 200);
    printFrame.setVisible(true);
}

    public void load() {
        try {
            FileInputStream fis = new FileInputStream("BankRecord.txt");
            ObjectInputStream in = new ObjectInputStream(fis);
            while (true) {
                try {
                    Account temp = (Account) in.readObject();
                    if (temp == null)
                        break;
                    AL.add(temp);
                } catch (EOFException eofException) {
                    break;  // Break the loop when the end of the file is reached
                }
            }
            fis.close();
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("\nError: BankRecord.txt not found. Creating a new file.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("\nError loading data from file. Please check the file format.");
        }
    }

    public void save() {
        try {
            FileOutputStream fos = new FileOutputStream("BankRecord.txt");
            ObjectOutputStream out = new ObjectOutputStream(fos);
            for (int i = 0; i < AL.size(); i++)
                out.writeObject(AL.get(i));
            fos.close();
        } catch (IOException e) {
            System.out.println("\nError saving data to file. Please check the file path and try again.");
        }
    }
}

class BankManagementSystem{
    public static void main(String args[]) {
        Bank obj = new Bank();
        obj.load();
        try {
            Frame mainFrame = new Frame("Bank Application");
            mainFrame.setLayout(new FlowLayout());
            Button createAccountButton = new Button("Create New Account");
            mainFrame.add(createAccountButton);


            createAccountButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    obj.addNewRecord(mainFrame);
                }
            });

            Button transferButton = new Button("Transfer Money");
            mainFrame.add(transferButton);

            transferButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    obj.transfer(mainFrame);
                }
            });

            Button withdrawButton = new Button("Withdraw Money");
            mainFrame.add(withdrawButton);

            withdrawButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    obj.withdraw(mainFrame);
                }
            });

            Button DepositButton = new Button("Deposit Money");
            mainFrame.add(DepositButton);

            DepositButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    obj.depositMoney(mainFrame);
                }
            });

            Button printButton = new Button("Print All Accounts");
            mainFrame.add(printButton);

            printButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    obj.print(mainFrame);
                }
            });
            
            Button closeAccountButton = new Button("Close Bank Account");
        mainFrame.add(closeAccountButton);

        closeAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                obj.closeAccount(mainFrame);
            }
        });
            // Inside the BankManagementSystem class
            Button forgotPinButton = new Button("Forgot PIN");
            mainFrame.add(forgotPinButton);

            forgotPinButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                obj.forgotPin(mainFrame);
    }
});


            Button exitButton = new Button("Exit");
            mainFrame.add(exitButton);

            exitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    obj.save();
                    System.out.println("\nData saved to File \"BankRecord.txt\"");
                    System.exit(1);
                }
            });

            mainFrame.setSize(400, 200);
            mainFrame.setVisible(true);
        } catch (Exception e) {
            System.out.println("\nWe triggered an Error");
        } finally {
            obj.save();
        }
    }
}