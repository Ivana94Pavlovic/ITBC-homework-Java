package domaci13;

import java.util.Locale;

public class zadatak2 {
    /*
    Napraviti metodu koja ispisuje tekst i prihvata kao parametre dva String-a.
    Ispis je u sledećem formatu: “Ime: “ text1 “i Prezime: “ text 2.
    text1 treba da budu sva velika slova, dok text2 treba da budu sva mala slova.
    U main metodi pozvati nekoliko primera kako bi ste testirali (2-3 poziva je dovoljno)
     */
    public static void main(String[] args) {

        String text = imeIprezime("Ivana", "Pavlovic");
        System.out.println(text);

        text = imeIprezime("mIlOs", "paVLOvic");
        System.out.println(text);

        text = imeIprezime("zdravka", "paVLoviC");
        System.out.println(text);

        text = imeIprezime("DragoSLAV", "Pavlovic");
        System.out.println(text);
    }

    public static String imeIprezime (String text1, String text2) {

        String rezultat = "Ime: " + text1.toUpperCase() + " i Prezime: " + text2.toLowerCase();

        return rezultat;


    }
}
