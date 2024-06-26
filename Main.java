public class Main {
    public static void main(String[] args) {

        UserInterface UI = new UserInterface();
        UI.programStart();
    }

    public static void whiteSpace(int amountOfWhiteSpace){
        for(int i = 0; i < amountOfWhiteSpace; i++){
            System.out.println();
        }
    }
}