package fabrica;

public class MasinaCautataNuExistaException extends Exception {
    public MasinaCautataNuExistaException(){
        super("Mașina căutată nu există!");
    }
}
