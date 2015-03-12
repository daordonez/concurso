import java.util.Scanner;


public class NoCumple232 {

    public static Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {

        int diaN = tec.nextInt();
        int mesN = tec.nextInt();
        int anoN = tec.nextInt();

        int diaA = tec.nextInt();
        int mesA = tec.nextInt();
        int anoA = tec.nextInt();

        int acDiasN = 0;
        for (int i = mesN + 1; i < 12 ; i++) {
            int diasM = diaMes(i);
            for (int j = 0 ; j < diasM  ; j++) {
                acDiasN++;

            }
        }
        System.out.println(acDiasN);


        acDiasN += diaN;

        int anosEnt = anoA - anoN - 2;

        acDiasN += anosEnt * 364;

        System.out.println(acDiasN);

        for (int i = 0; i < mesA - 1 ; i++) {
            acDiasN += diaMes(i);
        }

        acDiasN += diaA;

        System.out.println(acDiasN);

    }

    public static int diaMes(int mes){

        mes -= 1;

        int dias = 0;

        switch (mes){
            case 0:
            case 2:
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
                dias = 31;
            break;
            case 3:
            case 5:
            case 8:
            case 10:
                dias = 30;
            break;
            case 1:
                dias = 28;
            break;
        }

        return dias;

    }
}
