package schema;

import java.util.ArrayList;

public class Schema {

    public Schema() {

        Elementas.ELEMENTO_NR = 1;

    }

    ArrayList<Elementas> elementai = new ArrayList();
    ArrayList<Elementas> sarasasElementoRezultatui = new ArrayList();
    
    
    public int elementoRezultatas(Elementas e) {
        int skaiciuokle = 0;
        sarasasElementoRezultatui.clear();
        for (Elementas el : e.ivestys) {
           if( el.gautiReiksme() == true){
               if(!sarasasElementoRezultatui.contains(el)){
               skaiciuokle++;
               sarasasElementoRezultatui.add(el);}
           
           skaiciuokle+=elementoRezultatas(el);
           }
        }

        return skaiciuokle;

    }

    public int kiekElementu() {

        return elementai.size();

    }

    public ArrayList<Elementas> getElementai() {
        return elementai;
    }

    public void setElementai(ArrayList<Elementas> elementai) {
        this.elementai = elementai;
    }

    public void pridetiIvesti() {
        elementai.add(new Ivestis());
    }

    public void pridetiAND() {
        elementai.add(new AND());
    }

    public void pridetiOR() {
        elementai.add(new OR());
    }

    public void pridetiXOR() {
        elementai.add(new XOR());
    }

    public void pridetiNOT() {
        elementai.add(new NOT());
    }

    public void salintiElementa(Elementas e) {
        if (e != null) {
            elementai.remove(e);
            for (Elementas el : elementai) {
                el.ivestys.remove(e);
            }
        }
    }

    public void salintiElementa(int id) {
        Elementas e = gautiElementaPagalID(id);
        salintiElementa(e);
    }

    public void sujungtielementus(Elementas nuo, Elementas iki) {
        if (iki.getClass() != Ivestis.class) {   //cia norejau, kad neleistu ivesciai prijungti ivesties, bet nezinau ar sintakse tokia
            iki.ivestys.add(nuo);
        }

    }

    public void sujungtielementus(int nuo, int iki) {
        Elementas e_nuo = gautiElementaPagalID(nuo);
        Elementas e_iki = gautiElementaPagalID(iki);
        sujungtielementus(e_nuo, e_iki);
    }

    public void salintiSujungima(int nuo, int iki) {

        Elementas e_nuo = gautiElementaPagalID(nuo);
        Elementas e_iki = gautiElementaPagalID(iki);
        salintiSujungima(e_nuo, e_iki);

    }

    public void salintiSujungima(Elementas nuo, Elementas iki) {
        iki.ivestys.remove(nuo);

    }

    public void spausdintiSchema() {
        for (Elementas e : elementai) {
            System.out.println(e.getClass() + "\t" + e.id);
            if (e.ivestys.isEmpty()) {
                System.out.println("\tNERA");
            } else {
                for (Elementas el : elementai) {
                    System.out.println("\t" + el.getClass() + "\t" + e.id);
                }
            }
        }
    }

    public boolean gautiRezultata(int id) {
        Elementas dab = gautiElementaPagalID(id);

        return gautiRezultata(dab);
    }

    public boolean gautiRezultata(Elementas el) {
        if (el != null) {
            return el.gautiReiksme();
        }
        return false;
    }

    public void nustatytiREiksme(int id, boolean reiksme) {
        Elementas dab = gautiElementaPagalID(id);
        if (dab != null && dab.getClass().equals(Ivestis.class)) {
            dab.isvestis = reiksme;

        }
    }

    public Elementas gautiElementaPagalID(int id) {
        for (Elementas e : elementai) {
            if (e.id == id) {
                return e;
            }
        }
        return null;
    }
}
