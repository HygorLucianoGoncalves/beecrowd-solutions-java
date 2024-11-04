package br.com.beecrowd.iniciante;

import java.util.Scanner;

public class P2006 {
    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);

        int typeForTea, a, b, c, d, e;
        int result = 0;
        typeForTea = T.nextInt();
        a = T.nextInt();
        b = T.nextInt();
        c = T.nextInt();
        d = T.nextInt();
        e = T.nextInt();


        Integer[] resposta = {a, b, c, d, e};
        for (Integer resp : resposta) {
            if (resp == typeForTea) {
                result++;
            }
        }

        System.out.println(result);
    }
}
