package br.com.beecrowd.iniciante;

import java.util.Arrays;
import java.util.Scanner;

public class P1045 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a, b, c;
        a = teclado.nextDouble(); b = teclado.nextDouble(); c = teclado.nextDouble();

        double[] valores = {a, b, c};
        Arrays.sort(valores); // sort faz em ordem crescente ai passa os valores para ser inverso e fica uma ordem decrescente
        a = valores[2]; b = valores[1]; c = valores[0];

        if (a >= (b + c)) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (a * a == b * b + c * c) {
                System.out.println("TRIANGULO RETANGULO");
            } else if (a * a > b * b + c * c) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else if (a * a < b * b + c * c) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
        }


        if (a == b && a == c) {
            System.out.println("TRIANGULO EQUILATERO");
        } else if (a == b || b == c || a == c) {
            System.out.println("TRIANGULO ISOSCELES");
        }


        teclado.close();

    }


}
