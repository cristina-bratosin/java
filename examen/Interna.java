public class Interna extends Cursa{
    
    private int durata;
    
    public Interna(){
        
    }
    
    public Interna(double pret, int nrPasageri, String destinatia, String escala){
        super(pret, nrPasageri, destinatia, escala);
    }
    
    public Interna(double pret, int nrPasageri, String destinatia, String escala, int durata){
        super(pret, nrPasageri, destinatia, escala);
        this.durata = durata;
    }
    
    public int getDurata(){
        return durata;
    }
    
    public void setDurata(int durata){
        this.durata = durata;
    }
    
}