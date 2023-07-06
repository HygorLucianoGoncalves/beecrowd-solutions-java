package br.com.beecrowd.iniciante;

import java.util.Scanner;

public class P1016 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x,y,km,minutos;
        x = 60;
        y = 90;
        km = teclado.nextInt();
        minutos = km*2;
        System.out.println(minutos+" minutos");
    }
}
