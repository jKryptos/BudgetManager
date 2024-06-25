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
                System.out.println("Invalid choice!, choose a number from 1 to 4.");
                mainMenu();
                break;
        }
    }

    public void addMenu(){

    }

    public void removeMenu(){

    }

    public void moveMenu(){

    }

    public void viewAll(){

    }
}
