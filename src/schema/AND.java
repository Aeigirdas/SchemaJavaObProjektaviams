package schema;

public class AND extends Elementas {

    public boolean gautiReiksme() {
        if (ivestys.isEmpty()) {
            isvestis = false;
        } else {
            for (Elementas e : ivestys) {
                if (e.gautiReiksme() == true) {
                    isvestis = true;
                } else {
                    isvestis = false;
                    break;
                }
            }
        }
        return isvestis;
    }
}
