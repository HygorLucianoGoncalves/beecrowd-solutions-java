package br.com.beecrowd.iniciante;

import java.util.Scanner;

public class P1001 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a,b;
        a = teclado.nextInt();
        b = teclado.nextInt();
        int x = a + b;
        System.out.println("x = "+x);
    }
}
