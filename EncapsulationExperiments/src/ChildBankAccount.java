public class ChildBankAccount {
    private double balance;
    private double maxBalance;

    public ChildBankAccount (double maxBalance) {
        this.maxBalance = maxBalance;
    }

    public boolean depositMoney(double value) {
        if (balance + value <= maxBalance && value > 0 ) {
            balance = balance + value;
            return true;
        } else {
            return false;
        }
    }

    public boolean debitMoney(double value) {
        if ( balance - value < 0 || value < 0) {
            return false;
        } else {
            balance = balance - value;
            return  true;
        }
    }

    public double getBalance() {
        return balance;
    }


}
