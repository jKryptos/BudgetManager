import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Category {

    private final String name;
    private BigDecimal funds;

    DecimalFormat format = new DecimalFormat("##0.00");

    public Category(String name){
        this.name = name;
        this.funds = BigDecimal.valueOf(0.00);
    }

    public Category(String name, double funds){
        this.name = name;
        this.funds = BigDecimal.valueOf(funds);
    }

    public void addFunds(BigDecimal amountToAdd){
        this.funds = this.funds.add(amountToAdd);
    }

    public void removeFunds(double amountToRemove){
        this.funds = this.funds.subtract(BigDecimal.valueOf(amountToRemove));
    }

    public BigDecimal getFunds(){
        return this.funds;
    }

    public void setFunds(BigDecimal funds){
        this.funds = funds;
    }

    public void moveFunds(Category categoryToAddTo, BigDecimal amountToMove){
        this.funds = this.funds.subtract(amountToMove);
        categoryToAddTo.addFunds(amountToMove);
    }

    public String toString(){
        return this.name + ": $" + format.format(this.funds);
    }

    /*    public void reportCategory(){
        System.out.println(this.name + ": $" + format.format(this.funds));
    }*/
}
