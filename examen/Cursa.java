public class Cursa {
    
    private int id;
    private double pret;
    private int nrPasageri;
    private String destinatia;
    private String escala;
    
    public Cursa(){
        
    }
    
    public Cursa(double pret, int nrPasageri, String destinatia, String escala){
        this.pret = pret;
        this.nrPasageri = nrPasageri;
        this.destinatia = destinatia;
        this.escala = escala;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public double getPret(){
        return pret;
    }
    
    public void setPret(double pret){
        this.pret = pret;
    }
    
    public int getNrPasageri(){
        return nrPasageri;
    }
    
    public void setNrPasageri(int nrPasageri){
        this.nrPasageri = nrPasageri;
    }
    
    public String getDestinatia(){
        return destinatia;
    }
    
    public void setDestinatia(String destinatia){
        this.destinatia = destinatia;
    }
    
    public String getEscala(){
        return escala;
    }
    
    public void setEscala(String escala){
        this.escala = escala;
    }
    
    public String toString(){
        return "Cursa " + this.id + " " + this.pret + " " +
        this.nrPasageri + " " + this.destinatia + " " + this.escala;
    }
    
    public boolean equals(Object o){
        if(o instanceof Cursa){
            Cursa c = (Cursa) o;
            return c.id == this.id;
        }
        return false;
    }
    
    
}