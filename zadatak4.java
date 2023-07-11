package domaci10;

import java.util.Scanner;

public class zadatak2 {
    /*
    Napraviti promenljive "username" i "password" i definisati neke vrednosti po zelji.
    Korisnik unosi preko skenera dve vrednosti koje bi trebale da predstavljaju
    username i password i program treba da ih uporedi.
    Ako su username i password tačni, ispisati "Uspešno ste se ulogovali",
    a ako je jedno od ta dva pogrešno ispisati istu poruku "Pogrešan username ili password"
     */

    public static void main(String[] args) {

        Scanner inputU = new Scanner(System.in);
        System.out.print("Unesite Vas username: ");

        String username = inputU.nextLine();

        String prviU = "ivana.pavlovic";
        String drugiU = "milos.pavlovic";
        String treciU = "zdravka.pavlovic";
        String cetvrtiU = "dragoslav.pavlovic";

        Scanner inputP = new Scanner(System.in);
        System.out.print("Unesite Vas password: ");

        String password = inputP.nextLine();

        String prviP = "ip28";
        String drugiP = "mp31";
        String treciP = "zp61";
        String cetvrtiP = "dp65";

        if(username.equals(prviU) && password.equals(prviP)){
            System.out.println("Uspesno sto ste ulogovali.");
         } else if (username.equals(drugiU) && password.equals(drugiP)){
            System.out.println("Uspesno ste se ulogovali.");
        } else if (username.equals(treciU) && password.equals(treciP)){
            System.out.println("Uspesno ste se ulogovali");
        } else if (username.equals(cetvrtiU) && password.equals(cetvrtiP)){
            System.out.println("Uspesno ste se ulogovali.");
        } else {
            System.out.println("Pogrešan username ili password");
        }

        inputU.close();
        inputP.close();
    }
}
