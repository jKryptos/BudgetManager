import java.io.Serializable;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Category implements Serializable {

    private final String name;
    private BigDecimal funds;
    public static List<Category> categories = new ArrayList<>();

    public static void addCategoriesToArray(){
        categories.add(new Category("Income"));
        categories.add(new Category("Bills"));
        categories.add(new Category("Gas"));
        categories.add(new Category("Entertainment"));
        categories.add(new Category("Insurance"));
        categories.add(new Category("iLong"));
        categories.add(new Category("iShort"));
        categories.add(new Category("House"));
        categories.add(new Category("RRSP"));
    }

    DecimalFormat format = new DecimalFormat("##0.00");

    public Category(String name){
        this.name = name;
        this.funds = BigDecimal.valueOf(0.00);
    }

    public Category(String name, double funds){
        this.name = name;
        this.funds = BigDecimal.valueOf(funds);
    }

    public void addFunds(double amountToAdd){
        this.funds = this.funds.add(BigDecimal.valueOf(amountToAdd));
    }

    public void removeFunds(double amountToRemove){
        if (this.funds.compareTo(BigDecimal.valueOf(amountToRemove)) < 0){
            System.out.println("Insufficient funds!");
        } else {
            this.funds = this.funds.subtract(BigDecimal.valueOf(amountToRemove));
            }
        }

    public String getName(){
        return this.name;
    }


    public BigDecimal getFunds(){
        return this.funds;
    }

    public void setFunds(double funds){
        this.funds = BigDecimal.valueOf(funds);
    }


    public String toString () {
        return this.name + ": $" + format.format(this.funds);
    }
}
