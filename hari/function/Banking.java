package function;
import java.util.Scanner;
import banking.database.MySQLConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Banking {
   // public static int balance = 1000; // Initial balance
   // public static String name = "hari"; //Account holder name
   // public static String accountNumber = "1234567890";
    private String currentAccountNumber;
    private String currentAccountName;
    private double currentBalance;
    public Banking(String accountNumber) {
        this.currentAccountNumber = accountNumber;}
     private void loadAccountDetails() {
        String sql = "SELECT account_holder_name, balance FROM accounts WHERE account_number = ?";
        try (Connection conn = MySQLConnector.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, currentAccountNumber);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                currentAccountName = rs.getString("account_holder_name");
                currentBalance = rs.getDouble("balance");
                System.out.println("Account loaded successfully for " + currentAccountName);
            } else {
                System.out.println("Account not found for account number: " + currentAccountNumber);
                // Handle case where account doesn't exist, e.g., create a new one or exit
                System.out.println("Please ensure the account number is correct or create a new account.");
                // For simplicity in this example, we'll exit if not found
                System.exit(1); // Exit application if account not found
            }
        } catch (SQLException e) {
            System.err.println("Error loading account details: " + e.getMessage());
            e.printStackTrace();
            System.exit(1); // Exit if database error
        }
    }

    // Method to update balance in the database
    private void updateBalanceInDatabase() {
        String sql = "UPDATE accounts SET balance = ? WHERE account_number = ?";
        try (Connection conn = MySQLConnector.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setDouble(1, currentBalance);
            pstmt.setString(2, currentAccountNumber);
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Balance updated in database successfully.");
            } else {
                System.out.println("Failed to update balance in database.");
            }
        } catch (SQLException e) {
            System.err.println("Error updating balance in database: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter your account number to login: ");
        String enteredAccountNumber = sc.nextLine();
        
        Banking bankingApp = new Banking(enteredAccountNumber);
        int choice;
        do {
            System.out.println("\n--- Banking System ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. View Profile");
            System.out.println("4. Balance Enquiry");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter amount to deposit:");
                    double depAmount = sc.nextDouble();
                    bankingApp.deposit(depAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw:");
                    double withAmount = sc.nextDouble(); 
                    bankingApp.withdraw(withAmount);
                    break;

                case 3:
                    bankingApp.viewProfile();
                    break;
                case 4:
                    bankingApp.balanceEnquiry();
                    break;
                case 5:
                    Exit();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);

        sc.close();
    }
       public double deposit(double amount) {
    if (amount > 0) {
        currentBalance += amount;
        updateBalanceInDatabase();
        return currentBalance;
    } else {
        System.out.println("Invalid amount");
        return currentBalance;
    }
}
    public  void withdraw(double amount) {
    if (amount > 0 && amount <= currentBalance) {
        currentBalance -= amount;
        updateBalanceInDatabase();
        System.out.println("Withdrawal successful.Remaining balance: "  +currentBalance);
    } else {
        System.out.println("Insufficient balance");
    }
}

    public  void viewProfile() {
        System.out.println("\n Profile Details");
        System.out.println("Name:" +currentAccountName);
        System.out.println("Account Number:" + currentAccountNumber);
    }

    public  void balanceEnquiry() {
        System.out.println("Current balance: " +currentBalance);
    }
    public static void Exit(){
        System.out.println("Thank you for banking with us. Exiting... ");
    }
}
    
 