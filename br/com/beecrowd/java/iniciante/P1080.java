package br.com.beecrowd.java.iniciante;
import java.util.Scanner;

public class P1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[101];
        int maior = 0;
        int indiceMaior = 0;

        for (int i = 1; i <= 100; i++) {
            numbers[i] = sc.nextInt();

            if (numbers[i] > maior) {
                maior = numbers[i];
                indiceMaior = i;
            }
        }
        System.out.println(maior);
        System.out.println(indiceMaior);

    }
}
