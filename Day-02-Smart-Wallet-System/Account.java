public abstract class Account {
    private String accountNo;
    private double balance;
    private String ownerName;

    public Account(String accountNo, double balance, String ownerName) {
        this.accountNo = accountNo;
        this.balance = balance;
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println(amount + "deposited. New Balance: "+ balance);
    }

    abstract void withdraw(double amount);
}
