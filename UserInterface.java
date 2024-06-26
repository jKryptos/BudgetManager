import java.util.Scanner;

public class UserInterface {

    Category income = new Category("Income", 1000);

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

    public void programStart(){
        System.out.println("**** WELCOME TO FINANCE TRACKER v0.1 ****");
        mainMenu();
    }

    public int userInputInteger(){
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.next());
    }

    public double userInputDouble(){
        Scanner scanner = new Scanner(System.in);
        return Double.parseDouble(scanner.next());
    }

    public void mainMenu(){
        System.out.println("1. Add funds\n2. Remove funds\n3. Move funds\n4. View all categories");
        switch (userInputInteger()) {
            case 1:
                addMenu();
                break;
            case 2:
                removeMenu();
                break;
            case 3:
                moveMenu();
                break;
            case 4:
                viewAll();
                break;
            default:
                System.out.println("Invalid choice!");
                mainMenu();
        }
    }

    public void addMenu(){
        System.out.println("Select category:\n1. Income\n2. Bills\n3. Gas\n4. Entertainment\n5. Insurance\n6. iLong\n7. iShort\n8. Bed\n9. House\n10. RRSP\n11. Return to main menu");
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
                bed.addFunds(userInputDouble());
                break;
            case 9:
                System.out.println("Enter amount:");
                house.addFunds(userInputDouble());
                break;
            case 10:
                System.out.println("Enter amount:");
                rrsp.addFunds(userInputDouble());
                break;
            case 11:
                mainMenu();
                break;
            default :
                System.out.println("Invalid choice!");
                addMenu();
        }
        mainMenu();
    }

    public void removeMenu(){
        System.out.println("Select category:\n1. Income\n2. Bills\n3. Gas\n4. Entertainment\n5. Insurance\n6. iLong\n7. iShort\n8. Bed\n9. House\n10. RRSP\n11. Return to main menu");
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
                bed.removeFunds(userInputDouble());
                break;
            case 9:
                System.out.println("Enter amount:");
                house.removeFunds(userInputDouble());
                break;
            case 10:
                System.out.println("Enter amount:");
                rrsp.removeFunds(userInputDouble());
                break;
            case 11:
                mainMenu();
                break;
            default :
                System.out.println("Invalid choice!");
                addMenu();
        }
        mainMenu();
    }

    public void moveMenu(){
    }

    public void viewAll(){
        //TODO: Add all these to a list and loop the print statement
        System.out.println(income);
        System.out.println(bills);
        System.out.println(gas);
        System.out.println(entertainment);
        System.out.println(insurance);
        System.out.println(iLong);
        System.out.println(iShort);
        System.out.println(bed);
        System.out.println(house);
        System.out.println(rrsp);
        System.out.println(settlement);
        Main.whiteSpace(1);
        mainMenu();
    }
}
