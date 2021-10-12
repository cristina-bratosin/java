package fabrica;


public class MasinaElectrica extends Masina {
    
    private int range = 100;
    
    public MasinaElectrica(){
        
    }
    
    public MasinaElectrica(int id, String culoare, double pret, int range){
        this.setId(id);
        this.setCuloare(culoare);
        this.setPret(pret);
        this.range = range; 
    }
    
    public int getRande(){
        return range;
    }
    
    public void setRange(int range){
        this.range = range;
    }
    
    @Override
    public String toString (){
        return "ME " + getId() + " " + getCuloare() + " " + getPret() + " " + range;
    }
    
    @Override
    public boolean equals (Object o){
        if (o instanceof MasinaElectrica){
            MasinaElectrica m = (MasinaElectrica) o;
            return this.getId() == (m.getId());
        }
        return false;
    }
}