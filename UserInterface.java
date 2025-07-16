import java.util.Scanner;

public class UserInterface {

    static final int DEFAULT_FUND_AMOUNT_ZERO = 0;

    Category income = new Category("Income", 100);
    Category bills = new Category("Bills", 100);
    Category gas = new Category("Gas", 100);
    Category entertainment = new Category("Entertainment", 100);
    Category insurance = new Category("Insurance", 100);
    Category iLong = new Category("Long Fund", 100);
    Category iShort = new Category("Short Fund", 100);
    Category house = new Category("House", 100);
    Category rrsp = new Category("RRSP", 100);

    public void programStart(){
        System.out.println("**** WELCOME TO FINANCE TRACKER v0.1 ****");
        mainMenu();
    }

    public int userInputInteger(){
        boolean validInput = false;
        int userInput = DEFAULT_FUND_AMOUNT_ZERO;

        do{
            try {
                Scanner scanner = new Scanner(System.in);
                userInput = Integer.parseInt(scanner.next());
                validInput = true;
            } catch (NumberFormatException nfe){
                System.out.println("Invalid input, enter an integer.");
            }
        } while(!validInput);
        return userInput;
    }

    public double userInputDouble(){
        boolean validInput = false;
        double userInput = DEFAULT_FUND_AMOUNT_ZERO;

        do{
            try{
                Scanner scanner = new Scanner(System.in);
                userInput = Double.parseDouble(scanner.next());
                validInput = true;
            } catch (NumberFormatException nfe){
                System.out.println("Invalid input, enter a double.");
            }
        } while(!validInput);
        return userInput;
    }

    public void mainMenu(){
        System.out.println("1. Add funds\n2. Remove funds\n3. View all categories");
        switch (userInputInteger()) {
            case 1:
                addMenu();
                break;
            case 2:
                removeMenu();
                break;
            case 3:
                viewAll();
                break;
            default:
                System.out.println("Invalid choice!");
                mainMenu();
        }
    }

    public void addMenu(){
        System.out.println("Select category:\n1. Income\n2. Bills\n3. Gas\n4. Entertainment\n5. Insurance\n6. iLong\n7. iShort\n8. House\n9. RRSP\n10. Return to main menu");
        switch(userInputInteger()){
            case 1:
                System.out.println("Enter amount:");
                income.addFunds(userInputDouble());
                break;
            case 2:
                System.out.println("Enter amount:");
                bills.addFunds(userInputDouble());
                break;
            case 3:
                System.out.println("Enter amount:");
                gas.addFunds(userInputDouble());
                break;
            case 4:
                System.out.println("Enter amount:");
                entertainment.addFunds(userInputDouble());
                break;
            case 5:
                System.out.println("Enter amount:");
                insurance.addFunds(userInputDouble());
                break;
            case 6:
                System.out.println("Enter amount:");
                iLong.addFunds(userInputDouble());
                break;
            case 7:
                System.out.println("Enter amount:");
                iShort.addFunds(userInputDouble());
                break;
            case 8:
                System.out.println("Enter amount:");
                house.addFunds(userInputDouble());
                break;
            case 9:
                System.out.println("Enter amount:");
                rrsp.addFunds(userInputDouble());
                break;
            case 10:
                mainMenu();
                break;
            default :
                System.out.println("Invalid choice!");
                addMenu();
        }
        mainMenu();
    }

    public void removeMenu(){
        System.out.println("Select category:\n1. Income\n2. Bills\n3. Gas\n4. Entertainment\n5. Insurance\n6. iLong\n7. iShort\n8. House\n9. RRSP\n10. Return to main menu");
        switch(userInputInteger()){
            case 1:
                System.out.println("Enter amount:");
                income.removeFunds(userInputDouble());
                break;
            case 2:
                System.out.println("Enter amount:");
                bills.removeFunds(userInputDouble());
                break;
            case 3:
                System.out.println("Enter amount:");
                gas.removeFunds(userInputDouble());
                break;
            case 4:
                System.out.println("Enter amount:");
                entertainment.removeFunds(userInputDouble());
                break;
            case 5:
                System.out.println("Enter amount:");
                insurance.removeFunds(userInputDouble());
                break;
            case 6:
                System.out.println("Enter amount:");
                iLong.removeFunds(userInputDouble());
                break;
            case 7:
                System.out.println("Enter amount:");
                iShort.removeFunds(userInputDouble());
                break;
            case 8:
                System.out.println("Enter amount:");
                house.removeFunds(userInputDouble());
                break;
            case 9:
                System.out.println("Enter amount:");
                rrsp.removeFunds(userInputDouble());
                break;
            case 10:
                mainMenu();
                break;
            default :
                System.out.println("Invalid choice!");
                removeMenu();
        }
        mainMenu();
    }

    public void viewAll(){
        System.out.println(income);
        System.out.println(bills);
        System.out.println(gas);
        System.out.println(entertainment);
        System.out.println(insurance);
        System.out.println(iLong);
        System.out.println(iShort);
        System.out.println(house);
        System.out.println(rrsp);
        Main.whiteSpace(1);
        mainMenu();
    }
}
