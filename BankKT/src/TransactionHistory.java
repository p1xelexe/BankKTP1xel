import java.util.List;

public class TransactionHistory {
    private List<BankTransaction> transactionList;

    public TransactionHistory(List<BankTransaction> transactionList){
        this.transactionList = transactionList;
    }

    public List<BankTransaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<BankTransaction> transactionList) {
        this.transactionList = transactionList;
    }
}
