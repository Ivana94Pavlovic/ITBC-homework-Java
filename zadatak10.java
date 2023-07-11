package domaci12;

public class zadatak2 {
    /*
    Kreirati niz proizvoljne duzine celobrojnih vrednosti
    i pomnoziti poslednji element sa ukupnim brojem elemenata
    (Koristiti .length, ne fiksnu vrednost)
     */
    public static void main(String[] args) {

     int [] niz = {2, 4, 6, 8, 10, 12};

     int proizvod = niz[niz.length - 1] * niz.length;

        System.out.println("Rezultat je: " + proizvod );

    }
}
