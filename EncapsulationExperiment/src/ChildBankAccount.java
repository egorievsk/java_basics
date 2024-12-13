public class ChildBankAccount {
    private double balance;
    private double maxBalance;

    public ChildBankAccount(double maxBalance) {
        this.maxBalance = maxBalance;
    }

    public double getBalance() {
        return  balance;
    }

    public boolean depositMoney(double value) {

        if (value < 0) {
            System.out.println("Вносимая сумма меньше 0");
            return false;
        } else if (balance + value > maxBalance) {
            System.out.println("Вы не можете пополнить Ваш депозит на сумму: " + value);
            return false;
        } else {
            balance = balance + value;
            return true;
        }

    }

    public boolean debitMoney(double value) {
        if (value < 0) {
            System.out.println("Вносимая сумма меньше 0");
            return false;
        } else if (balance - value < 0) {
            System.out.println("Вы не можете снять деньги на сумму: " + value);
            return false;
        } else {
            balance = balance - value;
            return true;
        }
    }

    public void printBalance() {
        System.out.println("Balance: " + getBalance());
    }
}
