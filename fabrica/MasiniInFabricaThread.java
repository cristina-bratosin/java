package fabrica;


public class MasiniInFabricaThread implements Runnable {
    
    @Override
    public void run(){
        while(true) {
            try {
                System.out.println(Fabrica.getInstance().getMasini().size());
                Thread.sleep(10000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
