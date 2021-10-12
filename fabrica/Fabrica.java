package fabrica;
import java.util.*;

public class Fabrica {
    
    private List<Masina> masini = new ArrayList<>();
    int nrMasiniCreate = 1;
    
    private Fabrica(){
    }
    
    public static final class SingletonHolder{
        public static final Fabrica SINGLETON = new Fabrica();
    }
    
    public static final Fabrica getInstance(){
        return SingletonHolder.SINGLETON;
    }
    
    public List<Masina> getMasini(){
        return masini;
    }
    
    public void setMasini(List<Masina> masini){
        this.masini = masini;
    }
    
    public void adaugaMasinaElectrica (Masina m){
        if (masini.size()<10){
            masini.add(m);
            m.setId(Fabrica.getInstance().nrMasiniCreate);
            nrMasiniCreate++;
            System.out.println("Masina adaugata!");
        } else { 
            System.out.println("Fabrica este plina!");
        }
    }
    
    public void adaugaMasinaCuMotor (Masina m){
        if (masini.size()<10){
            masini.add(m);
            m.setId(Fabrica.getInstance().nrMasiniCreate);
            nrMasiniCreate++;
            System.out.println("Masina adaugata!");
        } else { 
            System.out.println("Fabrica este plina!");
        }
        
    }
    
    public void afisare(){
        if(masini.isEmpty()) {
            throw new FabricaEsteGoalaException();
        }
        masini.forEach(System.out::println);
    }
    
    public void afisareDetalii(Integer id) throws MasinaCautataNuExistaException {
       for (Masina masina : masini){
            if(id.equals(masina.getId())){
                System.out.println(masina);
            } else {
                throw new MasinaCautataNuExistaException();
            }
        }
    }
    
    public void afisareMasiniElectrice(){
       if(masini.isEmpty()){
            throw new FabricaEsteGoalaException();
        }
        for (Masina masina : masini){
            if(masina instanceof MasinaElectrica){
                System.out.println(masina);
            } 
        }
    }
    
    public void afisareMasiniCuMotor(){
       if(masini.isEmpty()){
            throw new FabricaEsteGoalaException();
        }
        for (Masina masina : masini){
            if(masina instanceof MasinaCuMotor){
                System.out.println(masina);
            } 
        }
    }
    
    public void vinde(Integer id) throws MasinaCautataNuExistaException {
        if(masini.isEmpty()){
            throw new FabricaEsteGoalaException();
        }
        for (int i = 0; i < masini.size(); i++){
            if(id.equals(masini.get(i).getId()) ){
                masini.remove(masini.get(i));
                System.out.println("Mașina " + masini.get(i) + " a fost vândută!");
            } else {
                throw new MasinaCautataNuExistaException();
            }
            
        }
        
       
    }
}

