package br.com.beecrowd.iniciante;


import java.util.Scanner;

public class P1021 {
    public static void main(String[] args) {
        var teclado = new Scanner(System.in);
        double valor = teclado.nextDouble();

        int dinheiro[] = {100, 50, 20, 10, 5, 2};
        double moedas[] = {1.0, 0.50, 0.25, 0.10, 0.05, 0.01};

        int notas,notasMoedas = 0;
        
        System.out.println("NOTAS:");
        for(int i = 0; i < dinheiro.length; i++){
            notas = (int) (valor / dinheiro[i]);
            valor = valor % dinheiro[i] + 0.00001;
            System.out.println(notas+" nota(s) de R$ "+dinheiro[i]+",00");
        }

       System.out.println("MOEDAS:");
        for(int i = 0; i < moedas.length; i++){
            notasMoedas = (int) (valor / moedas[i]);
            valor = valor % moedas[i] + 0.00001;
            System.out.printf("%d moeda(s) de R$ %.2f%n",notasMoedas, moedas[i]);
        }
        teclado.close();
    }
    
}
