
package schema;


public class XOR extends Elementas {
    private int counter = 0;
     public boolean gautiReiksme() {
        if (ivestys.isEmpty()) {
            isvestis = false;
        } else {
            for (Elementas e : ivestys) {
                if (e.gautiReiksme() == true) {
                    counter++;
                } 
            }
        }
        if(counter%2==0) {isvestis = false;}
        else{isvestis = true;}
        return isvestis;
    }
    
}
