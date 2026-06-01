package util.CalcularMedia;

import java.util.Locale;
import java.util.Scanner;

public class MediaDoAluno {
    public static void main(String[] arg){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[3];

        for (double nota: notas){
            nota = sc.nextDouble();

        }

        System.out.println();

        sc.close();
    }


}
