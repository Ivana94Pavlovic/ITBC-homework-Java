package domaci14;

import java.util.Scanner;

public class zadatak1 {
    /*
    Napraviti metodu koja ispisuje niz i kao parametre prihvata niz.
    Unutar metode pronaći najveću vrednost u nizu, a zatim tu vrednost postaviti
    kao vrednost svakog elementa u nizu. Koristiti scanner za popunjavanje početnog niza.
    (3-4 puta pozvati metodu).
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [] niz = new int [5];


        for (int i=0; i < 5; i++){
            System.out.println("Unesite pozitivan broj: ");
            niz [i] = input.nextInt();
        }

        niz = promena(niz);

        System.out.print("Novi niz je: ");

        for(int i = 0; i < niz.length; i++) {
            System.out.print(niz[i]);
        }
    }

    public static int[] promena (int nizNovi []){
        int max = 0;

        for (int i=0; i< nizNovi.length; i++) {
            if (nizNovi[i] > max) {
                max = nizNovi[i];
            }
        }
        for (int i = 0; i<nizNovi.length; i++){
            nizNovi [i] = max;
        }

        return nizNovi;

    }
}
