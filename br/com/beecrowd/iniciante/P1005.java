package br.com.beecrowd.iniciante;

import java.util.Scanner;

public class P1005 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a,b,media;
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        media = ((3.5 * a) + (7.5 * b))/11;
        System.out.printf("MEDIA = %.5f\n",media);
    }

}
