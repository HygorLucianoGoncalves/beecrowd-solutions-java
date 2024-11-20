package br.com.beecrowd.java.adHoc;

import java.util.Scanner;

public class P2413 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int primiroLink,segundoLink;
        int terceiroLink = sc.nextInt();

        segundoLink = terceiroLink * 2;
        primiroLink = segundoLink * 2;

        System.out.println(primiroLink);
        sc.close();
    }
}
