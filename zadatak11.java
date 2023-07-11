package domaci10;

import java.util.Scanner;

public class zadatak1 {
    /*
     Preko skenera uneti godinu, program treba da izracuna da li je godina prestupna.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Unesite godinu: ");

        int godina = input.nextInt();

        // Na interentu sam nasla uslove za racunanje prestupne godine

        if(godina % 4 ==0){
            System.out.println("Godina je prestupna.");
    } else if(godina % 100 != 0 && godina % 400 == 0 ){
            System.out.println("Godina je prestupna.");
        } else {
            System.out.println("Godina nije prestupna.");
        }

        input.close();
    }
}
