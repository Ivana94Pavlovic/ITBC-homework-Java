package domaci11;

import java.util.Scanner;

public class zadatak3 {
    /*
    Sa do while petljom uraditi sumu brojeva koje korisnik unese.
    Minimum jedan broj mora da se unese (to do while svakako obezbedjuje).
    Program ispisuje koja je suma kada upisete 0 ili negativan broj
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Unesite neki broj: ");
        int broj = input.nextInt();

        int sum = 0;

        do{
            sum = sum + broj;
            System.out.print("Unesite neki broj: ");
            broj = input.nextInt();
        }  while (broj > 0);

        System.out.print("Suma pozitivnih brojeva je: " + sum);

    }
}
