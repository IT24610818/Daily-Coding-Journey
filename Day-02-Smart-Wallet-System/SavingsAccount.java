public class SavingsAccount extends Account{

    public SavingsAccount(String accountNo, double balance, String ownerName) {
        super(accountNo, balance, ownerName);
    }

    @Override
    public void withdraw(double amount) {
        if(getBalance() - amount >= 500){
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn: "+amount+" | Success!");
        }
        else{
            System.out.println("Transaction Denied! Minimum balance (500) must be maintained.");
        }
    }
}
