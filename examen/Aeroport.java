import java.util.*;

public class Aeroport {
    
    private List<Cursa> curse = new ArrayList<>();
    private int curseAdaugate;
    
    private Aeroport(){
        
    }
    
    private static final class SingletonHolder{
        private static final Aeroport SINGLETON = new Aeroport();
    }
    
    public static final Aeroport getInstance(){
        return SingletonHolder.SINGLETON;
    }
    
    public List<Cursa> getCurse(){
        return curse;
    }
    
    public void adaugaCursa(String tip, double pret, int nrPasageri, String destinatie, String escala, String durata_tara){
        if(curse.size()> 4){
            throw new PreaMulteCurseException();
        } else if(tip.equals("i")){
            Cursa c = new Interna(pret, nrPasageri, destinatie, escala, Integer.parseInt(durata_tara));
            c.setId(++curseAdaugate);
            curse.add(c);
            System.out.println("Cursa a fost adaugata!");
        } else if(tip.equals("e")){
            Cursa c = new Externa(pret, nrPasageri, destinatie, escala, durata_tara);
            c.setId(++curseAdaugate);
            curse.add(c);
            System.out.println("Cursa a fost adaugata!");
        }       
    }
    
    public void afisare(String tip){
        if(curse.isEmpty()){
            System.out.println("Nu exista curse");
        } else {        
            switch(tip){
                case "i":
                    curse.stream().filter(c->c instanceof Interna).forEach(System.out::println);
                    break;
                case "e":
                    curse.stream().filter(c->c instanceof Externa).forEach(System.out::println);
                    break;
                case "t":
                    curse.forEach(System.out::println);
                }
        }
    }
        
    public void aflaTip(Integer idCursa){
        if (idCursa <= curseAdaugate){
            for (Cursa cursa: curse){
                if(idCursa.equals(cursa.getId())){
                    if(cursa instanceof Externa){
                        System.out.println("extern!");
                    } 
                    if(cursa instanceof Interna){
                        System.out.println("intern");
                    }
                } 
            }
        } else {
            System.out.println("Cursa cautata nu exista");
        }
    }
        
    public void stergeCursa(Integer idCursa){
        if(curse.isEmpty()){ 
            System.out.println("Nu exista curse!"); 
        }
        else {
            for(int i = 0; i < curse.size(); i++){
                if(idCursa.equals(curse.get(i).getId())){
                    Cursa c = curse.get(i);
                    curse.remove(c);
                    System.out.println("Cursa " + c +" a fost stearsa");
                }
            }
            
        } 
    }   

} 
          
        


    
    
