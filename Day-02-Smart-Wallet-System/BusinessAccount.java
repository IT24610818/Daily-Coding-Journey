public class BusinessAccount extends Account {
    public BusinessAccount(String accountNo, double balance, String ownerName) {
        super(accountNo, balance, ownerName);
    }

    @Override
    public void withdraw(double amount) {
        double tax = amount * 0.01;
        double totalAmount = amount + tax;

        if(getBalance() >= totalAmount){
            setBalance(getBalance() - totalAmount);
            System.out.println("Withdrawn: "+amount+" | Tax (1%): "+tax+" | Success!");
        }
        else{
            System.out.println("Insufficient funds for withdrawal and tax.");
        }
    }
}
