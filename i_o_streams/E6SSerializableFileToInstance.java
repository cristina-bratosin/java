import java.io.*;

public class E6SSerializableFileToInstance  {
    public static void main(String []args) {
        try(FileInputStream fis = new FileInputStream("cat");
            ObjectInputStream ois = new ObjectInputStream(fis)) {
                
            Cat cat = (Cat) ois.readObject();
            System.out.println(cat);
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
            
        }
    }