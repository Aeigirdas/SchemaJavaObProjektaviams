
package schema;

import java.util.ArrayList;

public class Elementas {
    int id;
    static int ELEMENTO_NR = 1;
    boolean isvestis = false;
    public ArrayList<Elementas> ivestys = new ArrayList<>();
    int x,y;

    public static int getELEMENTO_NR() {
        return ELEMENTO_NR;
    }

    
    
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setIsvestis(boolean isvestis) {
        this.isvestis = isvestis;
    }

    public void setIvestys(ArrayList<Elementas> ivestys) {
        this.ivestys = ivestys;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public Elementas() {
        id = ELEMENTO_NR;
        ELEMENTO_NR++;
        x = (int)(Math.random()*300);
        y = (int)(Math.random()*300);
    }

    public void pridetiIvesti(Elementas e) {
        ivestys.add(e);
    }

    public boolean gautiReiksme(){
        return isvestis;
    }

   public int getLygis(){
    
    int lygis=0;
    for(Elementas e:ivestys){
        lygis = Math.max(lygis, e.getLygis());
    }
    return lygis+1;
    
    }
   
   
   
   
   
   
}
