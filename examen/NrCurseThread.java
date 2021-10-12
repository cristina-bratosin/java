public class NrCurseThread implements Runnable{
    @Override
    public void run(){
        try{
            System.out.println(Aeroport.getInstance().getCurse().size());
            Thread.sleep(10000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        
    }
    
}