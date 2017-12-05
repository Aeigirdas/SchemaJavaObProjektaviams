
package schema;


public class OR extends Elementas {
    
      public boolean gautiReiksme() {
        if (ivestys.isEmpty()) {
            isvestis = false;
        } else {
            for (Elementas e : ivestys) {
                if (e.gautiReiksme() == false) {
                    isvestis = false;
                } else {
                    isvestis = true;
                    break;
                }
            }
        }
        return isvestis;
    }
    
}
