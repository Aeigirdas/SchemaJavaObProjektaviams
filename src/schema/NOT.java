
package schema;


public class NOT extends Elementas {
    public void pridetiIvesti(Elementas e) {
        if (ivestys.isEmpty()) {
            ivestys.add(e);
        }
    }

    @Override
    public boolean gautiReiksme() {
        if (ivestys.isEmpty()) {
            isvestis = true;
        } else isvestis = !ivestys.get(0).gautiReiksme();
        return isvestis;
    }

}