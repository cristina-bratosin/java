import java.io.*;
import java.util.Random;

public class Ex1{
    // receive a positive number n
    // receive the address of a file to write in
    // write n random numbers in the file on separate lines
    
    public static void main(String []args){
        InputStreamReader in = new InputStreamReader(System.in); 
        BufferedReader cons = new BufferedReader(in); 
            
        try(in; cons){
            int n = Integer.parseInt(cons.readLine()); 
            String file = cons.readLine(); 
            
            Random r = new Random();
            
            try(PrintStream out = new PrintStream(file)){
                for(int i = 0; i < n; i++){
                    out.println(r.nextInt(1000));
                }  
            }     
                
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
        
    }
}
