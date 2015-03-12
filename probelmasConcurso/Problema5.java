
import java.util.*;

public class Problema5 {

    static Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {

        int pac = tec.nextInt();

        int vecPeso[] = new int[pac];
        int vecAlt[] = new int[pac];

        for (int i = 0; i < pac ; i++) {
            vecPeso[i] = tec.nextInt();
            vecAlt[i] = tec.nextInt();
        }

        burbuja(vecPeso, vecAlt);

        for (int i = 0; i <vecAlt.length ; i++) {

            System.out.println(vecPeso[i]+" "+vecAlt[i]);
        }




    }

    public static void burbuja(int vec[], int vec2[]){

            int i, j, aux, aux2, aux3;
            for (i = 0; i < vec.length; i++) {
                for (j = 0; j < vec.length - i - 1; j++) {
                    if (vec[j + 1] > vec[j]) {
                        aux = vec[j + 1];
                        aux2 = vec2[j + 1];
                        vec[j + 1] = vec[j];
                        vec2[j + 1] = vec2[j];
                        vec[j] = aux;
                        vec2[j] = aux2;


                    }
                    if (vec[j + 1 ] == vec[j]) {
                        if (vec2[j + 1] < vec2[j]){
                            aux3 = vec2[j + 1];
                            vec2[j + 1] = vec2[j];
                            vec2[j] = aux3;
                        }
                    }
                }
            }

    }
}
