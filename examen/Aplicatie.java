import java.util.*;

public class Aplicatie {
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        
        while(true){
            String comanda = s.nextLine();
            String[] c = comanda.split("\\s+");
            
            Thread t = new Thread(new NrCurseThread());
            t.start();
            
            Aeroport aeroport = Aeroport.getInstance();
            
            switch(c[0].toLowerCase()){
                case "exit":
                    System.out.println("Aplicatia s-a oprit");
                    System.exit(0);
                case "start":
                    System.out.println("Adauga_cursa<tip><pret><nrPasageri><destinatie><escala>");
                    System.out.println("Afisare<tip>");
                    System.out.println("Afla_tip<idCursa>");
                    System.out.println("Sterge_cursa<idCursa>");
                    System.out.println("Exit");
                    break;
                default: 
                    System.out.println("Te rog introdu comanda Start!");
                    break;
                case "adauga_cursa":
                    try {
                        aeroport.adaugaCursa(c[1], Double.parseDouble(c[2]), Integer.parseInt(c[3]), c[4], c[5], c[6]);
                    } catch (PreaMulteCurseException e){
                        e.printStackTrace();
                    }
                    break;
                case "afisare":
                    aeroport.afisare(c[1]);
                    break;
                case "afla_tip":
                    aeroport.aflaTip(Integer.parseInt(c[1].toLowerCase()));
                    break;
                case "sterge_cursa":
                    aeroport.stergeCursa(Integer.parseInt(c[1]));
            }
            
        }
          
    }
}