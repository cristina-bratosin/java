import java.io.*;

public class Ex3{
    public static void main(String[] args){
        /* read from the console some lines entered from the keyboard and write them in the "log.txt" file
        *  the application stops when the "stop" string is read */
        try {
            InputStreamReader inCons = new InputStreamReader(System.in);
            BufferedReader cons = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter("log.txt");
            
            
            try (inCons;cons;pw) {   
                String line;
                
                while(((line = cons.readLine())!= null) && (!(line.toLowerCase().equals("stop")))){
                    pw.println(line);
                }

            } catch (IOException ioe) {
                    ioe.printStackTrace();
            }
            
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        
    }
    
}