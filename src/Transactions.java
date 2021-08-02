public class Transactions {
    private float amount;
    private boolean checkPdetails;
    private String transactionType;

    public float getAmount() {
        return amount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    @Override
    public String toString() {
        return "Transactions{" +
                "amount=" + amount +
                ", checkPdetails=" + checkPdetails +
                ", transactionType='" + transactionType + '\'' +
                '}';
    }

    public Transactions(float amount, boolean checkPdetails) {
        this.amount = amount;
        this.checkPdetails = checkPdetails;
    }

    public boolean isCheckPdetails() {
        return checkPdetails = true;
    }

    public boolean isNotCheck() {
        return checkPdetails = false;
    }


}
