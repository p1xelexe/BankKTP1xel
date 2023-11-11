import java.util.Date;

public class Transaction {
    private Date date;
    private double amount;
    private TransactionType type;

    public Transaction(Date date, double amount, TransactionType type){
        this.date = date;
        this. amount = amount;
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }
}
