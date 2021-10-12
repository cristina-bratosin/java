package fabrica;

public class MasinaCuMotor extends Masina {
    
    private double cRezervor = 55;
    
    public MasinaCuMotor(){
        
    }
    
    public MasinaCuMotor(int id, String culoare, double pret, double cRezervor){
        this.setId(id);
        this.setCuloare(culoare);
        this.setPret(pret);
        this.cRezervor = cRezervor; 
    }
    
    public double getCRezervor(){
        return cRezervor;
    }
    
    public void setCRezervor(double cRezervor){
        this.cRezervor = cRezervor;
    }
    
    @Override
    public String toString (){
        return "McM " + getId() + " " + getCuloare() + " " + getPret() + " " + cRezervor;
    }
    
    @Override
    public boolean equals (Object o){
        if (o instanceof MasinaCuMotor){
            MasinaCuMotor m = (MasinaCuMotor) o;
            return this.getId() == (m.getId());
        }
        return false;
    }
}    