package br.com.beecrowd.java.iniciante;

import java.util.Scanner;

public class P1073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "^" + "2 = " + (i * i));
            }
        }


    }
}
