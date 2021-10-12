public class Externa extends Cursa{
    
    private String tara;
    
    public Externa(){
        
    }
    
    public Externa(double pret, int nrPasageri, String destinatia, String escala){
        super(pret, nrPasageri, destinatia, escala);
    }
    
    public Externa(double pret, int nrPasageri, String destinatia, String escala, String tara){
        super(pret, nrPasageri, destinatia, escala);
        this.tara = tara;
    }
    
    public String getTara(){
        return tara;
    }
    
    public void setDurata(String tara){
        this.tara = tara;
    }
    
}