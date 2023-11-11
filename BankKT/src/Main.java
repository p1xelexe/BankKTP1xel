import java.util.*;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Bank bank = new Bank(new ArrayList<>(), "MyBank");
    private static final TransactionHistory transactionHistory = new TransactionHistory(new ArrayList<>());
    private static Account currentAccount = null;

    public static void main(String[] args) {
        while (true) {
            showMainMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    performTransaction();
                    break;
                case 3:
                    showTransactionHistory();
                    break;
                case 4:
                    System.out.println("Всего хорошего!");
                    System.exit(0);
                default:
                    System.out.println("Неверный выбор. Попробуйте еще раз.");
            }
        }
    }

    private static void showMainMenu() {
        System.out.println("-------------------------------");
        System.out.println("1. Создать новый аккаунт");
        System.out.println("2. Выполнить транзакцию");
        System.out.println("3. Показать историю транзакций");
        System.out.println("4. Выход");
        System.out.println("-------------------------------");
        System.out.print("Введите ваш выбор: ");
    }

    private static void createAccount() {
        CreatePerson createPerson = new CreatePerson();
        Person person = createPerson.getPerson();
        System.out.print("Введите номер аккаунта: ");
        String accountNumber = scanner.nextLine();
        Account account = new Account(accountNumber);
        account.setPerson(person);
        bank.getAccounts().add(account);
        currentAccount = account;
        System.out.println("Аккаунт создан успешно!");
    }

    private static void performTransaction() {
        if (currentAccount == null) {
            System.out.println("Пожалуйста, сначала создайте аккаунт.");
            return;
        }
        System.out.println("-------------------------------");
        System.out.println("1. Внести деньги");
        System.out.println("2. Снять деньги");
        System.out.println("-------------------------------");
        System.out.print("Введите ваш выбор: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введите сумму: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        if (choice == 1) {
            currentAccount.setBalance(currentAccount.getBalance() + amount);
            transactionHistory.getTransactionList().add(
                    new BankTransaction(currentAccount, new Transaction(new Date(), amount, TransactionType.DEPOSIT))
            );
            System.out.println("Деньги успешно внесены на счет!");
        } else if (choice == 2) {
            if (currentAccount.getBalance() < amount) {
                System.out.println("На вашем счету недостаточно средств для выполнения этой операции!");
            } else {
                currentAccount.setBalance(currentAccount.getBalance() - amount);
                transactionHistory.getTransactionList().add(
                        new BankTransaction(currentAccount, new Transaction(new Date(), amount, TransactionType.WITHDRAWAL))
                );
                System.out.println("Деньги успешно сняты со счета!");
            }
        }
    }

    private static void showTransactionHistory() {
        for (BankTransaction bankTransaction : transactionHistory.getTransactionList()) {
            Account account = bankTransaction.getAccount();
            Transaction transaction = bankTransaction.getTransaction();
            System.out.println(
                    "Account: " + account.getAccountNumber() +
                            ", Date: " + transaction.getDate() +
                            ", Amount: " + transaction.getAmount() +
                            ", Type: " + transaction.getType()
            );
        }
    }
}
