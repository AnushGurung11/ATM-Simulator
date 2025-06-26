
/*
This class will contain all the account details like
1. Account number
2. Account Pin
3. Account Balance
 */


public class Account extends Person {
    //TODO Creating account instance variables
    //TODO Creating setter and getter
    //TODO Creating constructor
    //TODO Methods for setting the deposit , withdraw

    //Instance variables
    private int accountNumber ;
    private String pin;
    private double balance;

    //Creating setter and getter methods
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public void setPin(String pin){
        //Creating a condition for setting pin with minimum length of  4
        if(pin.length()>=4&&pin.length()<=9){
            this.pin = pin;
        }


    }

    public String getPin(){
        return this.pin;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    //Creating methods
    public void deposit(double amount){
        //Condition for minimum deposit
        if(amount>=500){
            this.balance+=amount;
        }else{
            System.out.println("Insufficient deposit amount.");
        }

    }
    public void withdraw(double amount){
        //Condition Checking for the balance
        if(amount>this.balance){
            System.out.println("Insufficient balance.");
        }else{
            this.balance-= amount;
        }
    }

    //Creating constructor
    public Account(String name, String date,int accountNumber, String pin, double deposit ){
        super(name,date);
        setAccountNumber(accountNumber);
        setPin(pin);
        deposit(deposit);
        System.out.println("Account has been created.");
    }

}
