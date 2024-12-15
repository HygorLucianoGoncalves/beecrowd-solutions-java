package br.com.beecrowd.java.iniciante;

import java.util.Scanner;

public class P1070 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = 1; i <= 6; i++) {
            if (x % 2 == 0) {
                x++;
                System.out.println(x);
            }else{
                System.out.println(x);
            }
            x++;


        }
    }
}
