//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Account example
        BankAccount account = new BankAccount();
        account.setAccountBalance(10000.0);
        account.setCustomerName("Andreas");
        account.withdrawFunds(100.0);
        account.depositFunds(100.8);
    }
}