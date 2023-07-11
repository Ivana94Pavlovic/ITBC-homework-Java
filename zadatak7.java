package domaci11;

import java.util.Scanner;

public class zadatak2 {
    /*
    Pomocu while petlje, korisnik neprestano unosi brojeve i oni se sabiraju.
    Kada korisnik upise 0, program ispisuje sumu prethodno unetih brojeva i program se zavrsava.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Unesite neki pozitivan broj: ");

        int broj = input.nextInt();
        int sum = 0;

        while (broj > 0){
            sum = sum + broj;
            System.out.print("Unesite neki pozitivan broj: ");
            broj = input.nextInt();
        }
        System.out.println("Suma pozitivnih brojeva je: " + sum);

    }
}
