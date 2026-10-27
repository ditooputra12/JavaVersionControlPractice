public abstract class TransactionBase {
    protected String customerName;
    protected String accountNumber;

    public TransactionBase(CardRequestInput input) {
        this.customerName = input.getCustomerName();
        this.accountNumber = input.getAccountNumber();
    }

    public abstract void executeTransaction();
}