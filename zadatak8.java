package domaci12;

public class zadatak3 {
    /*
    Kreirati dva niza i prikazati koji niz ima vise elemenata (Ne morate petlju koristiti vec mozete if statement)
     */
    public static void main(String[] args) {

        int [] prviNiz = {25, 46, 12, 7, 987, 35, 876, 24};
        int [] drugiNiz = {23, 65, 89, 123, 4, 8, 23, 89, 23, 56, 72};

        if ( prviNiz.length > drugiNiz.length){
            System.out.println("Prvi niz ima vise elemenata!");
        } else if ( drugiNiz.length > prviNiz.length){
            System.out.println("Drugi niz ima vise elemenata!");
        } else {
            System.out.println("Prvi i drugi niz imaju isto elemenata");
        }

    }
}
