public class Bank{

    private CheckingAccount account1;
    private CheckingAccount account2;

    public Bank() {
        account1 = new CheckingAccount("vikram",100,"2");
        account2 = new CheckingAccount("Gurpreet", 200, "5");
    }

    public static void main(String[] args) {
        System.out.println("This is the detail of account1 : ");
        Bank bankOfGods = new Bank();
        System.out.println(bankOfGods.account1.getBalance());
        bankOfGods.account1.setBalance(500);
        System.out.println(bankOfGods.account1.getMonthlyInterestRate());

        
    }
}