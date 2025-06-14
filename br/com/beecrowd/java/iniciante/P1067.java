package br.com.beecrowd.java.iniciante;

import java.util.Scanner;

//0.072s
public class P1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        for (int i = 0; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

}
