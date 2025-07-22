import java.io.IOException;
import java.util.Scanner;

public class UserInterface {

    static final int DEFAULT_FUND_AMOUNT_ZERO = 0;
    boolean moveMenuFlag = false;

    public void programStart() throws IOException {
        System.out.println("**** WELCOME TO FINANCE TRACKER v0.1 ****");
        Category.addCategoriesToArray();
        IOSystem.loadData();
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

    public void mainMenu() throws IOException {
        try {
            System.out.println("1. Add funds\n2. Remove funds\n3. Move funds\n4. View all categories\n5. Save data\n6. Load data");
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
            case 5:
                IOSystem.saveData();
                mainMenu();
                break;
            case 6:
                IOSystem.loadData();
                mainMenu();
                break;
            default:
                System.out.println("Invalid choice!");
                mainMenu();
            }
        } catch (IOException e){
            System.out.println("Error");
        }
    }

    public void addMenu() throws IOException {
        System.out.println("*ADD FUNDS*\nSelect category:\n1. Income\n2. Bills\n3. Gas\n4. Entertainment\n5. Insurance\n6. iLong\n7. iShort\n8. House\n9. RRSP\n10. Return to main menu");

        int choice = userInputInteger();

        if (choice >= 1 && choice <= 9){
            int index = choice -1;
            if (index < Category.categories.size()){
                String categoryName = Category.categories.get(index).getName();
                System.out.println("Enter amount to add to " + categoryName + " :");
                double amount = userInputDouble();
                Category.categories.get(index).addFunds(amount);
            }
        } else if (choice == 10){
            mainMenu();
        } else {
            System.out.println("Invalid Choice!");
            addMenu();
        }
        if (!moveMenuFlag){
            mainMenu();
        }
    }

    public void removeMenu() throws IOException {
        System.out.println("*REMOVE FUNDS*\nSelect category:\n1. Income\n2. Bills\n3. Gas\n4. Entertainment\n5. Insurance\n6. iLong\n7. iShort\n8. House\n9. RRSP\n10. Return to main menu");
        int choice = userInputInteger();

        if (choice >= 1 && choice <= 9){
            int index = choice -1;
            if (index < Category.categories.size()){
                String categoryName = Category.categories.get(index).getName();
                System.out.println("Enter amount to remove from " + categoryName + " :");
                double amount = userInputDouble();
                Category.categories.get(index).removeFunds(amount);
            }
        } else if (choice == 10){
            mainMenu();
        } else {
            System.out.println("Invalid Choice!");
            addMenu();
        }
        if (!moveMenuFlag){
            mainMenu();
        }
    }

    public void moveMenu() throws IOException {
        moveMenuFlag = true;
        removeMenu();
        addMenu();
        moveMenuFlag = false;
        mainMenu();
    }

    public void viewAll() throws IOException {

        for (int i = 0; i < Category.categories.size(); i++){
            System.out.println(Category.categories.get(i));
        }
        Main.whiteSpace(1);
        mainMenu();
    }
}
