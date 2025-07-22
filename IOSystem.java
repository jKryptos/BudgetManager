import java.io.*;
import java.util.ArrayList;

public class IOSystem {

    public IOSystem() {

    }

    public static void saveData() throws IOException{
        try {
            FileOutputStream dataOut = new FileOutputStream("save.ser");
            ObjectOutputStream objectOut = new ObjectOutputStream(dataOut);

            objectOut.writeObject(Category.categories);

            objectOut.close();
        } catch (IOException e) {
            System.out.println("Could not save data!");
        }

    }

    public static void loadData() throws IOException{

        try{
            FileInputStream dataIn = new FileInputStream("save.ser");
            ObjectInputStream objectIn = new ObjectInputStream(dataIn);

            Category.categories = (ArrayList<Category>) objectIn.readObject();

        } catch (IOException | ClassNotFoundException e){
            System.out.println("Could not load data!");
        }
    }
}
