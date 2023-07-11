package domaci9;

/*
Napraviti paket domaci9 i klasu Zadatak1 i u njoj napraviti main metodu (public static void main...)
preko skenera uneti svoje ime i prezime (odvojeno) i godinu rodjenja,
ispisati ime i prezime i koliko godina imate.
 */

import java.util.Scanner;

public class zadatak1 {
    public static void main(String[] args) {

        Scanner podaci = new Scanner (System.in);

        System.out.print("Unesite vase ime: ");
        String ime = podaci.nextLine();

        System.out.print("Unesite vase prezime: ");
        String prezime = podaci.nextLine();

        System.out.print("Unesite godinu rodjenja: ");
        int godinaRodjenja = podaci.nextInt();

        int brojGodina = 2023 - godinaRodjenja;

        System.out.println("Vasi podaci su: " + ime + " " + prezime + " " + "i imate " + brojGodina + " godina.");

        podaci.close();

    }
}
