package br.com.beecrowd.java.iniciante;

import java.util.Scanner;

public class P1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c = 0;
        int r = 0;
        int s = 0;
        int total = 0;
        for (int i = 1; i <= n; i++) {
            int value = sc.nextInt();
            total += value;
            int type = sc.next().charAt(0);
            switch (type) {
                case 'C':
                    c += value;
                    break;
                case 'R':
                    r += value;
                    break;
                case 'S':
                    s += value;
                    break;
            }
        }
        System.out.println("Total: "+ total +" cobaias");
        System.out.println("Total de coelhos: " + c);
        System.out.println("Total de ratos: " + r);
        System.out.println("Total de sapos: " + s);
        System.out.printf("Percentual de coelhos: %.2f %%\n", (c / (double)total)  * 100);
        System.out.printf("Percentual de ratos: %.2f %%\n", (r / (double)total) * 100);
        System.out.printf("Percentual de sapos: %.2f %%\n", (s / (double)total) * 100);


    }
}
