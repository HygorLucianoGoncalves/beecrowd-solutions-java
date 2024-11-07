package br.com.beecrowd.java.iniciante;

import java.util.Scanner;

public class P1043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a,b,c;

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        if ((a + b) > c && (a + c) > b && (b + c) > a){
            System.out.printf("Perimetro = %.1f%n",(a + b + c));
        }else {
            System.out.printf("Area = %.1f%n",((a+b)*c)/2);
        }


    }
}
