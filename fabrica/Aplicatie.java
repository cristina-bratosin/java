package fabrica;
import java.util.*;

public class Aplicatie {
    
    public static Scanner s = new Scanner(System.in);
    
    public static void main (String [] args){

        Thread t1 = new Thread (new MasiniInFabricaThread());
        t1.start();
        
        while(true){
            System.out.println("Comanda ta:");
            String comanda =  s.nextLine();
            String [] c = comanda.split("\\s+");
            
            switch (c[0].toLowerCase()){
                case "exit":
                    System.out.println("Fabrica s-a oprit!");
                    System.exit(0);  
                case "start":
                    System.out.println("Comenzile disponibile sunt:");
                    System.out.println("ADAUGA <tip> <culoare> <pret>");
                    System.out.println("AFISARE");
                    System.out.println("DETALII <id_masina>");
                    System.out.println("AFISEAZA <tip>");
                    System.out.println("VINDE <id_masina>");
                    System.out.println("EXIT");
                    break;
                default:
                    System.out.println("Te rog introdu comanda START!");
                    break;
                case "adauga":
                    if (c[1].equals("electrica")){
                        Masina m = new MasinaElectrica();
                        m.setCuloare(c[2]);
                        m.setPret(Integer.parseInt(c[3]));
                        Fabrica.getInstance().adaugaMasinaElectrica(m);
                    } else if (c[1].equals("motor")) {
                        Masina m = new MasinaCuMotor();
                        m.setCuloare(c[2]);
                        m.setPret(Integer.parseInt(c[3]));
                        Fabrica.getInstance().adaugaMasinaCuMotor(m);
                    }
                    break; 
                case "afisare":
                    Fabrica.getInstance().afisare();
                    break;
                case "vinde":
                    try {
                        Fabrica.getInstance().vinde(Integer.parseInt(c[1]));
                    } catch (MasinaCautataNuExistaException e){
                        e.printStackTrace();
                    }
                    break;
                case "afiseaza":
                    if (c[1].equals("electica")){
                        Fabrica.getInstance().afisareMasiniElectrice();
                    } else if (c[1].equals("motor")){ 
                        Fabrica.getInstance().afisareMasiniCuMotor();
                    }
                    break;
                case "detalii":
                    try { 
                        Fabrica.getInstance().afisareDetalii(Integer.parseInt(c[1]));
                    } catch (MasinaCautataNuExistaException e){
                        e.printStackTrace();
                    }
                    break;
            }
        

        }        
        
    
        
    }
}
