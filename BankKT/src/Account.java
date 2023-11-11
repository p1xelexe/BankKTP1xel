public class Account {
    private String AccountNumber;
    private Person person;
    private double balance;

    public Account(String AccountNumber){
        this.AccountNumber = AccountNumber;
        this.balance = balance;
        this.person = person;
    }


    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        // add amount to balance
    }

}
