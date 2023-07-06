package br.com.beecrowd.iniciante;

import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.max;

public class P1013 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a,b,c;
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        int maior = maior(maior(a,b),c);
        System.out.println(maior+" eh o maior");
    }

    private static int maior(int a,int b){
        return (a + b + Math.abs(a-b)) / 2;
    }
}
