package br.com.beecrowd.iniciante;

import java.util.Scanner;

public class P1012 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a,b,c;
        double triangulo,circulo,trapezio,quadrado,retangulo;
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();
        triangulo = (a * c)/2;
        circulo = Math.pow(c,2)*3.14159;
        trapezio = ((a+b)*c)/2;
        quadrado = Math.pow(b,2);
        retangulo = a*b;
        System.out.printf("TRIANGULO: %.3f\n",triangulo);
        System.out.printf("CIRCULO: %.3f\n",circulo);
        System.out.printf("TRAPEZIO: %.3f\n",trapezio);
        System.out.printf("QUADRADO: %.3f\n",quadrado);
        System.out.printf("RETANGULO: %.3f\n",retangulo);

    }
}
