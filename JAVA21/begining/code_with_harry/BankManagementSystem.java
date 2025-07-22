import java.util.Scanner;

public class BankManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Bank Management System");

        // Sign Up
        System.out.println("Sign Up");
        Customer customer = signUp(scanner);

        // Display account details
        System.out.println("\nAccount Details:");
        System.out.println(customer);

        // Deposit
        System.out.println("\nDeposit Money:");
        customer.deposit(1000);
        System.out.println("Balance: $" + customer.getBalance());
    }

    static Customer signUp(Scanner scanner) {
        // Personal Details
        System.out.println("\nPage 1: Personal Details");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Father Name: ");
        String fatherName = scanner.nextLine();
        System.out.print("Date of Birth: ");
        String dob = scanner.nextLine();
        System.out.print("Gender: ");
        String gender = scanner.nextLine();
        System.out.print("Email Address: ");
        String email = scanner.nextLine();
        System.out.print("Martial Status: ");
        String martialStatus = scanner.nextLine();
        System.out.print("Address City: ");
        String addressCity = scanner.nextLine();
        System.out.print("Pincode: ");
        String pincode = scanner.nextLine();
        System.out.print("State: ");
        String state = scanner.nextLine();

        // Additional Details
        System.out.println("\nPage 2: Additional Details");
        System.out.print("Religion Category: ");
        String religion = scanner.nextLine();
        System.out.print("Income: ");
        double income = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline
        System.out.print("Educational Qualification: ");
        String education = scanner.nextLine();
        System.out.print("Occupation: ");
        String occupation = scanner.nextLine();
        System.out.print("Pan Number: ");
        String panNumber = scanner.nextLine();
        System.out.print("Aadhar Number: ");
        String aadharNumber = scanner.nextLine();
        System.out.print("Senior Citizen (yes/no): ");
        boolean seniorCitizen = scanner.nextLine().equalsIgnoreCase("yes");

        // Account Details
        System.out.println("\nPage 3: Account Details");
        System.out.print("Account Type (current/savings): ");
        String accountType = scanner.nextLine();
        String cardNumber = generateCardNumber();
        System.out.print("Create PIN: ");
        int pin = scanner.nextInt();
        System.out.print("Confirm PIN: ");
        int confirmPin = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        System.out.print("Services Required (ATM, Internet Banking, Mobile Banking, Cheque Book): ");
        String services = scanner.nextLine();
        System.out.print("Accept All Conditions (yes/no): ");
        boolean acceptConditions = scanner.nextLine().equalsIgnoreCase("yes");

        if (pin != confirmPin) {
            System.out.println("PINs do not match. Exiting sign-up.");
            System.exit(0);
        }

        // Create customer object
        Customer customer = new Customer(name, fatherName, dob, gender, email, martialStatus,
                addressCity, pincode, state, religion, income, education, occupation, panNumber,
                aadharNumber, seniorCitizen, accountType, cardNumber, pin, services, acceptConditions);

        return customer;
    }

    static String generateCardNumber() {
        // Simulate card number generation
        return "1234-5678-9012-3456";
    }
}

class Customer {
    private String name;
    private String fatherName;
    private String dob;
    private String gender;
    private String email;
    private String martialStatus;
    private String addressCity;
    private String pincode;
    private String state;
    private String religion;
    private double income;
    private String education;
    private String occupation;
    private String panNumber;
    private String aadharNumber;
    private boolean seniorCitizen;
    private String accountType;
    private String cardNumber;
    private int pin;
    private double balance;
    private String services;
    private boolean acceptConditions;

    public Customer(String name, String fatherName, String dob, String gender, String email,
                    String martialStatus, String addressCity, String pincode, String state,
                    String religion, double income, String education, String occupation,
                    String panNumber, String aadharNumber, boolean seniorCitizen,
                    String accountType, String cardNumber, int pin, String services,
                    boolean acceptConditions) {
        this.name = name;
        this.fatherName = fatherName;
        this.dob = dob;
        this.gender = gender;
        this.email = email;
        this.martialStatus = martialStatus;
        this.addressCity = addressCity;
        this.pincode = pincode;
        this.state = state;
        this.religion = religion;
        this.income = income;
        this.education = education;
        this.occupation = occupation;
        this.panNumber = panNumber;
        this.aadharNumber = aadharNumber;
        this.seniorCitizen = seniorCitizen;
        this.accountType = accountType;
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.services = services;
        this.acceptConditions = acceptConditions;
        this.balance = 0; // Initial balance
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\nFather Name: " + fatherName +
                "\nDate of Birth: " + dob +
                "\nGender: " + gender +
                "\nEmail: " + email +
                "\nMartial Status: " + martialStatus +
                "\nAddress: " + addressCity + ", " + pincode + ", " + state +
                "\nReligion: " + religion +
                "\nIncome: $" + income +
                "\nEducation: " + education +
                "\nOccupation: " + occupation +
                "\nPAN Number: " + panNumber +
                "\nAadhar Number: " + aadharNumber +
                "\nSenior Citizen: " + (seniorCitizen ? "Yes" : "No") +
                "\nAccount Type: " + accountType +
                "\nCard Number: " + cardNumber +
                "\nServices: " + services +
                "\nAccept Conditions: " + (acceptConditions ? "Yes" : "No") +
                "\nBalance: $" + balance;
    }
}