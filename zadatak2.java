package domaci9;

/*
Napraviti klasu Zadatak2 u okviru paketa domaci9 i uraditi konverziju celzijusa u farenhajte.
Korisnik unosi preko skenera temperaturu za celzijus u celobrojnoj vrednosti
i program ispisuje oba u formatu "31C = 87.8F", zaokruziti farenhajte na jednu decimalu.
 */

import java.util.Scanner;

public class zadatak2 {
    public static void main(String[] args) {

        Scanner konvertor = new Scanner (System.in);

        System.out.print("Unesite temperaturu u celzijusu: ");
        int temperaturaC = konvertor.nextInt();

        double temperaturaF = 1.8 * temperaturaC + 32;

        System.out.printf("Konevrtovana temperatura: %dC = %.1fF", temperaturaC, temperaturaF);

        konvertor.close();
    }
}
