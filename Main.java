import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Category income = new Category("Income");

        Category bills = new Category("Bills");
        Category gas = new Category("Gas");
        Category entertainment = new Category("Entertainment");
        Category insurance = new Category("Insurance");

        Category iLong = new Category("Long Fund");
        Category iShort = new Category("Short Fund");
        Category bed = new Category("Bed");
        Category house = new Category("House");
        Category rrsp = new Category("RRSP");
        Category settlement = new Category("Settlement");

        income.addFunds(BigDecimal.valueOf(1000));
        income.reportCategory();
        income.moveFunds(gas, BigDecimal.valueOf(120));
        income.reportCategory();
        gas.reportCategory();
        gas.moveFunds(income, BigDecimal.valueOf(80));
        income.reportCategory();
        gas.reportCategory();
        income.removeFunds(BigDecimal.valueOf(500));
        income.reportCategory();
    }
}