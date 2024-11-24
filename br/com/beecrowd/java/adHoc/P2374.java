package br.com.beecrowd.java.adHoc;

import java.util.Scanner;

public class P2374 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pressaoDesejada,pressaoLida;

        pressaoDesejada = scanner.nextInt();
        pressaoLida = scanner.nextInt();

        System.out.println(pressaoDesejada - pressaoLida);

    }
}
