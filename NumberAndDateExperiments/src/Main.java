import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        MoneyCalculator moneyCalculator = new MoneyCalculator();
        System.out.println(moneyCalculator.calculateCassetteCount(4001));

        UsageAnalytics analytics = new UsageAnalytics();
        analytics.countVisit();
        analytics.countVisit();
        int visits = analytics.countVisit();
        System.out.println("Всего посещений: " + visits);

        System.out.println(getPeriodFromJavaBirthday());
    }

    public static String getPeriodFromJavaBirthday() {
        LocalDate dateOfBirth = LocalDate.of(1995,5,23);
        Period period = dateOfBirth.until(LocalDate.now());

        return period.getYears() + " years, " + period.getMonths() + " months, " +
                period.getDays() + " days";
    }
}