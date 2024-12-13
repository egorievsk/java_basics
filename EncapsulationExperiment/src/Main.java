public class Main {
    public static void main(String[] args) {

        ChildBankAccount acc = new ChildBankAccount(10000);
        acc.depositMoney(1000);
        acc.depositMoney(2000);
        acc.depositMoney(10000);
        acc.depositMoney(-1000);
        acc.printBalance();

        acc.debitMoney(500);
        acc.debitMoney(422.75);
        acc.debitMoney(50000);
        acc.debitMoney(-50);
        acc.printBalance();

        Country country = new Country("USA");
        country.setSquareCountry(5264.55);
        System.out.println(country.getName());
        System.out.println(country.getSquareCountry());

    }
}