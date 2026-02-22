public class WalletMain {
    public static void main(String[] args) {
        System.out.println("--- Smart Wallet System Initialized ---");

        Account savings = new SavingsAccount("S001",2000.0,"Thisaja Bandara");
        System.out.println("Owner: "+savings.getOwnerName()+" (Savings)");
        savings.withdraw(1800.0);

        System.out.println("\n-----------------------------------\n");
        Account business = new BusinessAccount("B001",10000.0,"Sky_Park");
        System.out.println("Owner: "+business.getOwnerName()+" (Business)");
        business.withdraw(5000.0);
        System.out.println("Current Balance: "+business.getBalance());
    }
}