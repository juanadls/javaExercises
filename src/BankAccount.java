public class BankAccount {

    //Attributes:
    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void depositFunds(double depositAmount) {
        this.balance += depositAmount;

    }

    public void withdrawFunds(double withdrawalAmount) {
        if (balance - withdrawalAmount < 0) {
            System.out.println("Insufficient Funds! You only have" + balance);
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal of $" + withdrawalAmount + " processed, Remaining balance = " + balance);

        }

    }

    //Getters
    public String getAccountNumber() {
        return number;
    }

    public double getAccountBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

//Setters:

    public String setAccountNumber(String accountNumber) {
        return this.number = accountNumber;
    }

    public double setAccountBalance(double accountBalance) {
        return this.balance = accountBalance;
    }

    public String setCustomerName(String customerName) {
        return this.customerName = customerName;
    }

    public String setEmail(String email) {
        return this.email = email;
    }

    public String setPhoneNumber(String phoneNumber) {
        return this.phoneNumber = phoneNumber;
    }


}


