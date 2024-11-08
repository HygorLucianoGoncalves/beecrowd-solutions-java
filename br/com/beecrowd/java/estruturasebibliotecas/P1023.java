package br.com.beecrowd.java.estruturasebibliotecas;

import java.util.*;

public class P1023 { /*
Entrada
A primeira linha de cada caso de teste contém um inteiro N (1 ≤ N ≤ 1*106), indicando a quantidade de imóveis.
As N linhas contém um par de valores X (1 ≤ X ≤ 10) e Y (1 ≤ Y ≤ 200), indicando a quantidade de moradores de cada imóvel e
o respectivo consumo total de cada imóvel (em m3). Com certeza, nenhuma residência consome mais do que 200 m3 por mês.
O final da entrada é representado pelo número zero.

Saída
Para cada entrada, deve-se apresentar a mensagem “Cidade# n:”, onde n é o número da cidade seguindo a sequência (1, 2, 3, ...) e
em seguida deve-se listar, por ordem ascendente de consumo, a quantidade de pessoas seguido de um hífen e o consumo destas pessoas, arredondando o valor para baixo.
Na terceira linha da saída deve-se mostrar o consumo médio por pessoa da cidade, com 2 casas decimais sem arredondamento, considerando o consumo real total.
 Imprimir uma linha em branco entre dois casos de teste consecutivos. No fim da saída não deve haver uma linha em branco.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeDeImoveis;


        ArrayList<Integer> listQuantidadeDeMoradores = new ArrayList<Integer>();
        ArrayList<Integer> listConsumoDoImovel = new ArrayList<Integer>();
        Collections.sort(listConsumoDoImovel);

        while (true) {
            int quantidadeDeMoradoes;
            int consumoDoimovel;
            quantidadeDeImoveis = scanner.nextInt();
            if (quantidadeDeImoveis == 0) {
                break;
            }

            for (int i = 0; i < quantidadeDeImoveis; i++) {
                listQuantidadeDeMoradores.add(quantidadeDeMoradoes = scanner.nextInt());
                listConsumoDoImovel.add(consumoDoimovel = scanner.nextInt() / quantidadeDeMoradoes);

            }
            int cidade = 0;

            cidade++;

        }

        System.out.println(listQuantidadeDeMoradores);
        System.out.println(listConsumoDoImovel);
    }
}
