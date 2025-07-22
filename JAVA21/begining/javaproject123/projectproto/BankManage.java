import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

class Account implements Serializable {
    String name;
    int account_number;
    String pin;
    double Amount;

    Account() {
        name = null;
        account_number = 0;
        pin = null;
        Amount = 0;
    }

    Account(String n, int acc, String pi, double amount) {
        name = n;
        account_number = acc;
        pin = pi;
        Amount = 1000 + amount;
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

    public int getAccountNumber() {
        return account_number;
    }

    public String getPIN() {
        return pin;
    }

    public double getAmount() {
        return Amount;
    }
}

class Bank {
    ArrayList<Account> AL = new ArrayList<>();

    public void addNewRecord(Frame frame) {
        TextField nameField = new TextField();
        TextField accountField = new TextField();
        TextField pinField = new TextField();
        TextField amountField = new TextField();

        Frame inputFrame = new Frame("Create New Account");
        inputFrame.setLayout(new GridLayout(5, 2));
        inputFrame.add(new Label("Name: "));
        inputFrame.add(nameField);
        inputFrame.add(new Label("Account Number: "));
        inputFrame.add(accountField);
        inputFrame.add(new Label("PIN: "));
        inputFrame.add(pinField);
        inputFrame.add(new Label("Amount: "));
        inputFrame.add(amountField);

        Button submitButton = new Button("Submit");
        inputFrame.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = nameField.getText();
                int a = Integer.parseInt(accountField.getText());
                String p = pinField.getText();
                double am = Double.parseDouble(amountField.getText());

                Account ac = new Account(n, a, p, am);
                AL.add(ac);

                inputFrame.dispose();
            }
        });

        inputFrame.setSize(400, 200);
        inputFrame.setVisible(true);
    }

    public void transfer(Frame parentFrame) {
        Frame transferFrame = new Frame("Transfer Money");
        transferFrame.setLayout(new GridLayout(4, 2));

        TextField senderAccField = new TextField();
        TextField senderPinField = new TextField();
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
                String s_pin = senderPinField.getText();

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

        transferFrame.setSize(400, 200);
        transferFrame.setVisible(true);
    }

    public void withdraw(Frame parentFrame) {
        Frame withdrawFrame = new Frame("Withdraw Money");
        withdrawFrame.setLayout(new GridLayout(3, 2));

        TextField accField = new TextField();
        TextField pinField = new TextField();
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
                String p_pin = pinField.getText();

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

        withdrawFrame.setSize(400, 200);
        withdrawFrame.setVisible(true);
    }
    
    public void closeAccount(Frame parentFrame) {
    Frame closeFrame = new Frame("Close Bank Account");
    closeFrame.setLayout(new GridLayout(3, 2));

    TextField accField = new TextField();
    TextField pinField = new TextField();
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
            String pin = pinField.getText();
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

        dialog.setSize(200, 100);
        dialog.setVisible(true);
    }


    public void print(Frame parentFrame) {
    Frame printFrame = new Frame("Print All Accounts");
    printFrame.setLayout(new GridLayout(1, 1));
    TextArea textArea = new TextArea();

    for (int i = 0; i < AL.size(); i++) {
        textArea.append("\nName: " + AL.get(i).getName() +
                "\nAccount Number: " + AL.get(i).getAccountNumber() +
                "\nBalance: " + AL.get(i).getAmount() + "\n");
    }

    printFrame.add(textArea);

    printFrame.setSize(400, 200);
    printFrame.setVisible(true);
}


    public void load() {
        // ... (unchanged)
        try{
            FileInputStream fis = new FileInputStream("BankRecord.txt");
            ObjectInputStream in = new ObjectInputStream(fis);
            while(true)
            {
                Account temp = (Account) in.readObject(); 
                if(temp == null)
                    break;
                AL.add(temp);
            }
            fis.close();
             }
         catch(Exception e)
         {
         }
    }

    public void save() {
        // ... (unchanged)
        try{
            FileOutputStream fos = new FileOutputStream("BankRecord.txt");
            ObjectOutputStream out = new ObjectOutputStream(fos);
            for(int i = 0; i<AL.size(); i++)
                out.writeObject(AL.get(i));
            fos.close();
            }
         catch(Exception e)
         {
            System.out.println("\nError Saving Data to File");
         }	
    }
}

class BankManage1 {
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