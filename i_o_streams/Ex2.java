import java.io.*;

public class Ex2 {
    // receive from the console a file address with numbers on separate lines
    // read the numbers and display their sum in the console 
    
    public static void main(String[] args){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader cons = new BufferedReader(isr);
        
        try(isr; cons){
            String file = cons.readLine(); // read the file
            
            FileInputStream fis = new FileInputStream(file); // create a low level stream
            InputStreamReader isrn = new InputStreamReader(fis); 
            BufferedReader brn = new BufferedReader(isrn); 
            
            try(fis; isrn; brn){
                String line;
                int sum = 0;
                
                while((line=brn.readLine())!=null){ // read the lines, if not null
                    sum += Integer.parseInt(line);
                } 
                System.out.println("Suma: " +sum);
            }
            
        } catch (IOException e){
            e.printStackTrace();
        }
        
    }
    
}