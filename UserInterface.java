import java.util.Scanner;

public class UserInterface {

    static final int DEFAULT_FUND_AMOUNT_ZERO = 0;
    boolean moveMenuFlag = false;

    public void programStart(){
        System.out.println("**** WELCOME TO FINANCE TRACKER v0.1 ****");
        Category.addCategoriesToArray();
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
        System.out.println("*ADD FUNDS*\nSelect category:\n1. Income\n2. Bills\n3. Gas\n4. Entertainment\n5. Insurance\n6. iLong\n7. iShort\n8. House\n9. RRSP\n10. Return to main menu");
        switch(userInputInteger()){
            case 1:
                System.out.println("Enter amount to add to " + Category.categories.get(0).getName() + " :");
                Category.categories.get(0).addFunds(userInputDouble());
                break;
            case 2:
                System.out.println("Enter amount to add to " + Category.categories.get(1).getName() + " :");
                Category.categories.get(1).addFunds(userInputDouble());
                break;
            case 3:
                System.out.println("Enter amount to add to " + Category.categories.get(2).getName() + " :");
                Category.categories.get(2).addFunds(userInputDouble());
                break;
            case 4:
                System.out.println("Enter amount to add to " + Category.categories.get(3).getName() + " :");
                Category.categories.get(3).addFunds(userInputDouble());
                break;
            case 5:
                System.out.println("Enter amount to add to " + Category.categories.get(4).getName() + " :");
                Category.categories.get(4).addFunds(userInputDouble());
                break;
            case 6:
                System.out.println("Enter amount to add to " + Category.categories.get(5).getName() + " :");
                Category.categories.get(5).addFunds(userInputDouble());
                break;
            case 7:
                System.out.println("Enter amount to add to " + Category.categories.get(6).getName() + " :");
                Category.categories.get(6).addFunds(userInputDouble());
                break;
            case 8:
                System.out.println("Enter amount to add to " + Category.categories.get(7).getName() + " :");
                Category.categories.get(7).addFunds(userInputDouble());
                break;
            case 9:
                System.out.println("Enter amount to add to " + Category.categories.get(8).getName() + " :");
                Category.categories.get(8).addFunds(userInputDouble());
                break;
            case 10:
                mainMenu();
                break;
            default :
                System.out.println("Invalid choice!");
                addMenu();
        }
        if (!moveMenuFlag){
            mainMenu();
        }
    }

    public void removeMenu(){
        System.out.println("*REMOVE FUNDS*\nSelect category:\n1. Income\n2. Bills\n3. Gas\n4. Entertainment\n5. Insurance\n6. iLong\n7. iShort\n8. House\n9. RRSP\n10. Return to main menu");
        switch(userInputInteger()){
            case 1:
                System.out.println("Enter amount to remove from " + Category.categories.get(0).getName() + " :");
                Category.categories.get(0).removeFunds(userInputDouble());
                break;
            case 2:
                System.out.println("Enter amount to remove from " + Category.categories.get(1).getName() + " :");
                Category.categories.get(1).removeFunds(userInputDouble());
                break;
            case 3:
                System.out.println("Enter amount to remove from " + Category.categories.get(2).getName() + " :");
                Category.categories.get(2).removeFunds(userInputDouble());
                break;
            case 4:
                System.out.println("Enter amount to remove from " + Category.categories.get(3).getName() + " :");
                Category.categories.get(3).removeFunds(userInputDouble());
                break;
            case 5:
                System.out.println("Enter amount to remove from " + Category.categories.get(4).getName() + " :");
                Category.categories.get(4).removeFunds(userInputDouble());
                break;
            case 6:
                System.out.println("Enter amount to remove from " + Category.categories.get(5).getName() + " :");
                Category.categories.get(5).removeFunds(userInputDouble());
                break;
            case 7:
                System.out.println("Enter amount to remove from " + Category.categories.get(6).getName() + " :");
                Category.categories.get(6).removeFunds(userInputDouble());
                break;
            case 8:
                System.out.println("Enter amount to remove from " + Category.categories.get(7).getName() + " :");
                Category.categories.get(7).removeFunds(userInputDouble());
                break;
            case 9:
                System.out.println("Enter amount to remove from " + Category.categories.get(8).getName() + " :");
                Category.categories.get(8).removeFunds(userInputDouble());
                break;
            case 10:
                mainMenu();
                break;
            default :
                System.out.println("Invalid choice!");
                removeMenu();
        }
        if (!moveMenuFlag){
            mainMenu();
        }

    }

    public void moveMenu(){
        moveMenuFlag = true;
        removeMenu();
        addMenu();
        moveMenuFlag = false;
        mainMenu();
    }

    public void viewAll(){

        for (int i = 0; i < Category.categories.size(); i++){
            System.out.println(Category.categories.get(i));
        }
        Main.whiteSpace(1);
        mainMenu();
    }
}
