package domaci14;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class zadatak2 {
    /*
    Napraviti metodu koja radi konverziju valuta. Valute koje se koriste su EUR, USD, GBP.
    Napisati konverzije preko switch-a, tako sto proveravate koju je valutu korisnik uneo kao parametar,
    a vracate (return) u toj nekoj novoj valuti izracunatu vrednost.
    U main-u preko skenera korisnik unosi broj dinara koji zeli da konvertuje u neku valutu,
    i samu valutu kao string. Ispisati nekoliko primera poziva u main-u.
    Valute su vrednosti double i njih mozete uzeti sa sajta NBS. (3-4 poziva dovoljno).
     */
    public static void main(String []args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Unesite valutu: ");
        String valuta = input.nextLine();

        System.out.println("Unesite iznos za konverziju: ");
        double iznos = input.nextDouble();

        double rezultat = konverzija(valuta, iznos);

        System.out.println("Konvertovani iznos je: " + rezultat);

        double primerRezultat = konverzija("eur", 5000);
        System.out.println("primer 1 iznos je: " + primerRezultat);
        primerRezultat = konverzija("usd", 10000);
        System.out.println("primer 2 iznos je: " + primerRezultat);
        primerRezultat = konverzija("GBP", 15000);
        System.out.println("primer 3 iznos je: " + primerRezultat);

    }

    public static double konverzija(String valuta, double iznos) {
        valuta = valuta.toUpperCase();
        double rezultat = 0;

        switch(valuta) {
            case "EUR":
                rezultat = iznos / 117.30;
                break;
            case "USD":
                rezultat = iznos / 106.20;
                break;
            case "GBP":
                rezultat = iznos / 133.87;
                break;
        }

        return rezultat;
    }

    }

