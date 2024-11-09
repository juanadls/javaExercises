public class BankAccount {

    //Attributes:
    private String accountNumber;
    private String accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    //Getters
public String getAccountNumber(){
    return accountNumber;
}

public String getAccountBalance(){
    return accountBalance;
}

public String getCustomerName(){
    return customerName;
}

public String getEmail(){
    return email;
}

public String getPhoneNumber(){
    return phoneNumber;
}

//Setters:

    public String setAccountNumber (String accountNumber){
    return this.accountNumber =accountNumber;
    }

    public String setAccountBalance (String accountBalance){
    return this.accountBalance = accountBalance;
    }

    public String setCustomerName(String customerName){
    return this.customerName = customerName;
    }

    public String setEmail (String email){
    return this.email= email;
    }

    public String setPhoneNumber (String phoneNumber){
    return this.phoneNumber = phoneNumber;
    }

    public static void depositFunds(){}
    public static void withdrawFunds (){}

}


