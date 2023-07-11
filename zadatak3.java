package domaci10;

import java.util.Scanner;

public class zadatak3 {
    /*
    Napisati program gde korisnik unese dan pa mesec rodjenja i program vrati koji je to horoskopski znak.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Unesite datum u formatu - dan mesec : ");
        int dan = input.nextInt();
        int mesec = input.nextInt();

        switch (mesec) {

            case 1:
                if (dan > 0 && dan <= 20) {
                    System.out.println("Vi ste jarac u horoskopu.");
                } else if (dan >= 21 && dan <= 31) {
                    System.out.println("Vi ste vodolija u horoskopu.");
                } else {
                    System.out.println("Nevalidan broj. Januar ima 31 dan.");
                }
                break;

            case 2:
                if (dan > 0 && dan <= 19){
                    System.out.println("Vi ste vodolija u horoskopu.");
                } else if (dan > 19 && dan <= 28){
                    System.out.println("Vi ste riba u horoskopu.");
                } else {
                    System.out.println("Nevalidan broj. Februar ima 29 dana.");
                }
                break;

            case 3:
                if (dan > 0 && dan <= 20){
                    System.out.println("Vi ste riba u horoskopu.");
                } else if (dan > 20 && dan <= 31){
                    System.out.println("Vi ste ovan u horoskopu.");
                } else {
                    System.out.println("Nevalidan unos. Mart ima 31 dan.");
                }
                break;

            case 4:
                if (dan > 0 && dan <= 20){
                    System.out.println("Vi ste ovan u horoskopu.");
                 } else if (dan > 20 && dan <= 30){
                    System.out.println("Vi ste bik u horoskopu.");
                 } else {
                    System.out.println("Nevalidan unos. April ima 30 dana.");
                }
                break;

            case 5:
                if (dan > 0 && dan <= 21){
                    System.out.println("Vi ste bik u horoskopu.");
                } else if (dan > 21 && dan <= 31){
                    System.out.println("Vi ste blizanac u horoskopu.");
                } else {
                    System.out.println("Nevalidan unos. Maj ima 31 dan.");
                }
                break;

            case 6:
                if (dan > 0 && dan <= 21){
                    System.out.println("Vi ste blizanac u horoskopu.");
                } else if (dan > 21 && dan <= 30) {
                    System.out.println("Vi ste rak u horoskopu.");
                } else {
                    System.out.println("Nevalidan unos. Jun ima 30 dana.");
                }
                break;

            case 7:
                if (dan > 0 && dan <= 22) {
                    System.out.println("Vi ste rak u horoskopu.");
                } else if (dan > 22 && dan <= 31) {
                    System.out.println("Vi ste lav u horoskopu.");
                } else {
                    System.out.println("Nevalidan unos. Jul ima 31 dan.");
                }
                break;

            case 8:
                if (dan > 0 && dan <= 22) {
                    System.out.println("Vi ste lav u horoskopu.");
                } else if (dan > 22 && dan <= 31) {
                    System.out.println("Vi ste devica u horoskopu.");
                } else {
                    System.out.println("Nevalidan unos. Avgust ima 31 dan.");
                }
                break;

            case 9:
                if (dan > 0 && dan <= 22) {
                    System.out.println("Vi ste devica u horoskopu.");
                } else if (dan > 22 && dan <= 30) {
                    System.out.println("Vi ste vaga u horoskopu.");
                } else {
                    System.out.println("Nevalidan unos. Septembar ima 30 dana.");
                }
                break;

            case 10:
                if (dan > 0 && dan <= 23) {
                    System.out.println("Vi ste vaga u horoskopu.");
                } else if (dan > 23 && dan <= 31) {
                    System.out.println("Vi ste skorpija u horoskopu.");
                } else {
                    System.out.println("Nevalidan unos. Oktobar ima 31 dan.");
                }
                break;

            case 11:
                if (dan > 0 && dan <= 22) {
                    System.out.println("Vi ste skorpija u horoskpu.");
                } else if (dan > 22 && dan <= 30) {
                    System.out.println("Vi ste strelac u horoskopu.");
                } else {
                    System.out.println("Nevalidan unos. Novembar ima 30 dana.");
                }
                break;

            case 12:
                if (dan > 0 && dan <= 22) {
                    System.out.println("Vi ste strelac u horoskpu.");
                } else if (dan > 22 && dan <= 31) {
                    System.out.println("Vi ste jarac u horoskopu.");
                } else {
                    System.out.println("Nevalidan unos. Decembar ima 31 dan.");
                }
                break;
                }

                input.close();

    }
}
