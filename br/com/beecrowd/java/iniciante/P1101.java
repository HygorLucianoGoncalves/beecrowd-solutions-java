package br.com.beecrowd.java.iniciante;

import java.util.Scanner;

public class P1101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int out = 0;
            int contnumers = 0;
            int tamanhovetor = 0;

            if (m <= 0 || n <= 0) {
                break;
            } else if (m > n) {
                int temp = m;
                m = n;
                n = temp;
            }

            for (int i = m; i <= n; i++) {
                tamanhovetor++;
            }

            int[] teste = new int[tamanhovetor];

            for (int i = m; i <= n; i++) {
                teste[contnumers] = i;
                contnumers++;
                out += i;

            }
            for (int a : teste) {
                System.out.print(a + " ");
            }
            System.out.println("Sum=" + out);
        }

    }
}
