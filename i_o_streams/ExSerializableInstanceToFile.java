import java.io.*;

public class ExSerializableInstanceToFile{
    public static void main(String[]args) {
        Cat cat = new Cat("Tom", 2);
        try {
            FileOutputStream fos = new FileOutputStream("cat");
            BufferedOutputStream bos =  new BufferedOutputStream(fos);
            ObjectOutputStream oos =  new ObjectOutputStream(bos);
            
            try(fos;bos;oos){
                System.out.println(cat);
                oos.writeObject(cat);
            } 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} 