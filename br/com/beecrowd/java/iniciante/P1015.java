package br.com.beecrowd.java.iniciante;

import java.util.Scanner;

public class P1015 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x1,y1,x2,y2;
        x1 = teclado.nextDouble();
        y1 = teclado.nextDouble();
        x2 = teclado.nextDouble();
        y2 = teclado.nextDouble();

        double p1 = Math.pow((x2-x1),2);
        double p2 = Math.pow((y2-y1),2);
        double distancia = Math.sqrt(p1+p2);
        System.out.printf("%.4f",distancia);


    }
}
