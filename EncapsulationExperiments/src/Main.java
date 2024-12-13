import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {

        Country country = new Country("Brasil");
        country.setCapital("Rio Di Janeiro");
        country.setAmountPeoples(50000000);
        country.setSquare(854625.55);
        country.setIsExitToSea(true);

        System.out.println("Name country: " + country.getNameCountry());
        System.out.println("Capital of country: " + country.getCapital());
        System.out.println("Amount peoples of country: " + country.getAmountPeoples());
        System.out.println("Exit to sea in country: " + country.getIsExitToSea());
        System.out.println("Square of country: " + country.getSquare());
//        ChildBankAccount account = new ChildBankAccount(10000);
//        account.depositMoney(1000);
//        account.depositMoney(2000);
//        account.depositMoney(10000);
//        account.depositMoney(-1000);
//        System.out.println("Balance :" + account.getBalance());
//
//        account.debitMoney(500);
//        account.debitMoney(422.75);
//        account.debitMoney(500000);
//        account.debitMoney(-50);
//        System.out.println("Balance :" + account.getBalance());
    }
}