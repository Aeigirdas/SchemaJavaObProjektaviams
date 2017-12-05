
public class Gija extends Thread {
    
    boolean testi = true;
    Piesinys pies = null;
    int zingsniu_skaicius = 0;
    int laikas = 500; 
    
    
    public Gija(Piesinys p, int kiek, int laikas){
        pies = p;
        zingsniu_skaicius = kiek;
        this.laikas = laikas;
    }
    
    
    public void setTesti(boolean testi) {
        this.testi = testi;
    }
    
    public void sustoti(){
    this.testi = false;
    }
    
    @Override
    public void run(){
       try{
                for (int i = 1;i<=zingsniu_skaicius && testi; i++) {
                pies.setZingsnis(i);
                pies.repaint();
                Thread.sleep(1000);}}
             catch (InterruptedException ex) {}
                pies.setZingsnis(0);
                pies.repaint();
    } 
    
    
}
