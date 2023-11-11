import java.util.List;
public class Bank {
    private List<Account> accounts;
    private String bankName;

    public Bank(List<Account> accounts, String bankName){
        this.accounts =accounts;
        this.bankName = bankName;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
