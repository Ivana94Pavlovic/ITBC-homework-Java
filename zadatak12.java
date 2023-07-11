package domaci13;

public class zadatak1 {
    /*
    Napraviti metodu koja vraca boolean tip i prihvata kao parametre 2 integer-a.
    Metoda vraća true samo ako su ta dva integer-a jedan za drugim, na primer 16 17 ili 24 25.
    U main metodi ispisati sa println nekoliko primera kako bi ste testirali (4-5 poziva je dovoljno)
     */
    public static void main(String[] args) {

        Boolean rezultat = brojevi (15, 45);

        if (rezultat == true) {
            System.out.println("Brojevi su jedan za drugim!");
        } else {
            System.out.println("Brojevi nisu jedan za drugim!");
        }

        rezultat = brojevi (6, 7);

        if (rezultat == true) {
            System.out.println("Brojevi su jedan za drugim!");
        } else {
            System.out.println("Brojevi nisu jedan za drugim!");
        }

        rezultat = brojevi (18, 20);

        if (rezultat == true) {
            System.out.println("Brojevi su jedan za drugim!");
        } else {
            System.out.println("Brojevi nisu jedan za drugim!");
        }

        rezultat = brojevi (4, 5);

        if (rezultat == true) {
            System.out.println("Brojevi su jedan za drugim!");
        } else {
            System.out.println("Brojevi nisu jedan za drugim!");
        }

    }
    public static boolean brojevi (int a, int b){

        if ((b - a) == 1){
            return true;
        } else {
            return false;
        }

    }
}
