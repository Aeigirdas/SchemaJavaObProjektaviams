
package schema;

public class Main {

    public static void main(String[] args) {
        Schema schema = new Schema();
        schema.pridetiIvesti();
        schema.pridetiIvesti();
        schema.pridetiIvesti();
        schema.pridetiIvesti();
        schema.nustatytiREiksme(1, false);
        schema.nustatytiREiksme(2, true);
        schema.nustatytiREiksme(3, true);
        schema.nustatytiREiksme(4, false);
        schema.pridetiAND();
        schema.sujungtielementus(1, 5);
        schema.sujungtielementus(2, 5);
        schema.sujungtielementus(3, 5);
        schema.pridetiNOT();
        schema.sujungtielementus(1, 6);
        schema.pridetiOR();
        schema.sujungtielementus(3, 7);
        schema.sujungtielementus(4, 7);
        schema.pridetiXOR();
        schema.sujungtielementus(5, 8);
        schema.sujungtielementus(6, 8);
        schema.sujungtielementus(7, 8);
        //schema.spausdintiSchema();        nemokejau taisyklingai atspausdinti schemos 
        System.out.println("rezultatas: " + schema.gautiRezultata(1));
        System.out.println("rezultatas: " + schema.gautiRezultata(2));
        System.out.println("rezultatas: " + schema.gautiRezultata(3));
        System.out.println("rezultatas: " + schema.gautiRezultata(4));
        System.out.println("rezultatas: " + schema.gautiRezultata(5));
        System.out.println("rezultatas: " + schema.gautiRezultata(6));
        System.out.println("rezultatas: " + schema.gautiRezultata(7));
        System.out.println("rezultatas: " + schema.gautiRezultata(8));
    }
}

