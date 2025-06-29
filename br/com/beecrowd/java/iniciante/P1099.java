package br.com.beecrowd.java.iniciante;

import java.util.Scanner;
///
public class P1099 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int a = 1; a<= n; a++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int teste=0;
            if (x > y){
               int temp = x;
               x = y;
               y = temp;

            }
            for (int i=x+1; i <= y-1; i++) {
                if (i%2!=0) {
                    teste += i;
                }
            }
            System.out.println(teste);
        }
    }
}
///Scanner scanner = new Scanner(System.in);
///         int n = scanner.nextInt();
///         int teste = 0;
///         for (int a = 1; a <= n; a++) {
///             int x = scanner.nextInt();
///             int y = scanner.nextInt();
///             if (x > y) {
///                 x = y;
///             }
///             for (int i = x + 1; i <= y - 1; i++) {
///                 if (i % 2 != 0) {
///                     teste += i;
///                 }
///             }
///             System.out.println(teste);
///         }
///     }