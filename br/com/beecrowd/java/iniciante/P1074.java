package br.com.beecrowd.java.iniciante;

import java.util.Arrays;
import java.util.Scanner;

public class P1074 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] x = new int[n+1];
        for (int j = 1; j <= n; j++) {
            x[j] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {

            if (x[i] > 0 && x[i] % 2 == 0) {
                System.out.println("EVEN POSITIVE");
            } else if (x[i] < 0 && x[i] % 2 == 0) {
                System.out.println("EVEN NEGATIVE");
            } else if (x[i] > 0 && x[i] % 2 != 0) {
                System.out.println("ODD POSITIVE");
            } else if (x[i] < 0 && x[i] % 2 != 0) {
                System.out.println("ODD NEGATIVE");
            } else System.out.println("NULL");


        }


    }
}
