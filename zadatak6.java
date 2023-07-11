package domaci11;

public class zadatak1 {
    /*
    Napisati for petlju koja ide od 0 do 1000 i prikazuje sve brojeve deljive sa 3
     */
    public static void main(String[] args) {

        for(int i = 0; i <= 1000; i+=3) {
            if (i != 0) {
                System.out.println("Broj " + i + " je deljiv sa 3!");
            }
        }


    }
}
