package br.com.beecrowd.java.iniciante;

import java.util.Scanner;

public class P1017 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double horas,km;
        horas = teclado.nextInt();
        km = teclado.nextInt();
        double total = (km/12)*horas;
        System.out.printf("%.3f\n",total);
        teclado.close();

    }
}
