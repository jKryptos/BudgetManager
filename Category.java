import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Category {

    private String name;
    private BigDecimal funds;

    DecimalFormat format = new DecimalFormat("##0.00");

    public Category(String name){
        this.name = name;
        this.funds = BigDecimal.valueOf(0.00);
    }

    public Category(String name, BigDecimal funds){
        this.name = name;
        this.funds = funds;
    }

    public void addFunds(BigDecimal amountToAdd){
        this.funds = this.funds.add(amountToAdd);
    }

    public void removeFunds(BigDecimal amountToRemove){
        this.funds = this.funds.subtract(amountToRemove);
    }

    public void reportCategory(){
        System.out.println(this.name + ": $" + format.format(this.funds));
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
}
