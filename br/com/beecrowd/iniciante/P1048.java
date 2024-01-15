package br.com.beecrowd.iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P1048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario = scanner.nextDouble();

        if (salario <= 400){
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 15 %%\n",salario + (salario*0.15),salario*0.15);
        } else if (salario <= 800){
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 12 %%\n",salario + (salario*0.12),salario*0.12);
        } else if(salario <= 1200){
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 10 %%\n",salario + (salario*0.10),salario*0.10);
        } else if (salario <= 2000){
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 7 %%\n",salario + (salario*0.07),salario*0.07);
        }else System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 4 %%\n",salario + (salario*0.04),salario*0.04);

        scanner.close();
    }

}
