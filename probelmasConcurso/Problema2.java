
import java.util.*;

public class Problema2 {

    //Problema E
    static Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {

        //Precios
        int p1 = tec.nextInt();
        int p2 = tec.nextInt();
        int p3 = tec.nextInt();
        int p4 = tec.nextInt();

        int vec[] = new int[2];

        vec[0] = tec.nextInt();
        vec[1] = tec.nextInt();



    }

    public static int b1(int vec[], int p1) {

        int precio = 0;

         precio = (vec[0] * p1) + (vec[1] * p1);

        return precio;
    }

    public static int b2(int vec[], int p2) {

        int precio = 0;

        if (vec[0] > 0){
            precio += p2 * vec[0];
        }

        if (vec[1] > 0){
            precio += p2 * vec[1];
        }

        return precio;
    }

    public static int b3(int vec[], int p2) {

        int precio = 0;

        if (vec[0] > 0){
            precio += p2;
        }

        if (vec[1] > 0){
            precio += p2;
        }

        return precio;
    }

    public static int b4(int vec[], int p2) {

        int precio = 0;

        if (vec[0] != 0 || vec[1] != 0){

            precio = p2;
        }

        return precio;
    }
}
