package br.com.beecrowd.java.iniciante;

import java.util.Scanner;

public class P1060 {
    // tempo no BEECROWD 0.182s
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double v1,v2,v3,v4,v5,v6;

        v1 = scanner.nextDouble();
        v2 = scanner.nextDouble();
        v3 = scanner.nextDouble();
        v4 = scanner.nextDouble();
        v5 = scanner.nextDouble();
        v6 = scanner.nextDouble();

        int total = 0;

        if (v1 > -1) total++;
        if (v2 > -1) total++;
        if (v3 > -1) total++;
        if (v4 > -1) total++;
        if (v5 > -1) total++;
        if (v6 > -1) total++;

        System.out.println(total + " valores positivos");


        scanner.close();
    }
}

// tempo no BEECROWD 0.192s
//{
//Scanner scanner = new Scanner(System.in);
//
//double[] values = new double[6];
//        for (int i = 0; i < values.length; i++) {
//values[i] = scanner.nextDouble();
//        }
//
//int total = 0;
//
//        for (double value : values) {
//        if (value > -1) {
//total++;
//        }
//        }
//
//        System.out.println(total + " valores positivos");
//
//
//        scanner.close();
//    }