package fabrica;

public abstract class Masina {
    
    private int id;
    private String culoare;
    private double pret;
    
    public Masina(){  
    }
    
    public Masina(int id, String culoare, double pret){  
        this.id = id;
        this.culoare = culoare;
        this.pret = pret;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getCuloare(){
        return culoare;
    }
    
    public void setCuloare(String culoare){
        this.culoare = culoare;
    }
    
    public double getPret(){
        return pret;
    }
    
    public void setPret(double pret){
        this.pret = pret;
    }
    
    @Override
    public String toString (){
        return "Masina " + getId() + " " + getCuloare() + " " + getPret();
    }
    
    @Override
    public boolean equals (Object o){
        if (o instanceof Masina){
            Masina m = (Masina) o;
            return this.id == (m.id);
        }
        return false;
    }
    
    
}