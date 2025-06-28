package br.com.beecrowd.java.teste;

/// Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.
///
/// Entrada
/// Não há nenhuma entrada neste problema. - ok
///
/// Saída
/// Imprima a sequencia conforme exemplo abaixo.
///
/// Exemplo de Entrada	Exemplo de Saída
/// I=0 J=1
/// I=0 J=2
/// I=0 J=3
/// I=0.2 J=1.2
/// I=0.2 J=2.2
/// I=0.2 J=3.2
/// .....
/// I=2 J=?
/// I=2 J=?
/// I=2 J=?
/// ///  user for and if with numers > 0 = i=0  12 = 1=1 21 = i=2
public class P1098 {

    public static void main(String[] args) {

        double i = 0;
        double j = 1;
        double j2 = 2;
        double j3 = 3;

        for (int k = 0; k < 11; k++) {
            if (k == 0) {
                System.out.printf("I=%.0f J=%.0f\n", i, j);
                System.out.printf("I=%.0f J=%.0f\n", i, j2);
                System.out.printf("I=%.0f J=%.0f\n", i, j3);
            } else if (k != 5 && k != 10) {
                System.out.printf("I=%.1f J=%.1f\n", i, j);
                System.out.printf("I=%.1f J=%.1f\n", i, j2);
                System.out.printf("I=%.1f J=%.1f\n", i, j3);
            } else if (k == 5) {
                System.out.printf("I=%.0f J=%.0f\n", i, j);
                System.out.printf("I=%.0f J=%.0f\n", i, j2);
                System.out.printf("I=%.0f J=%.0f\n", i, j3);
            } else {
                System.out.printf("I=%.0f J=%.0f\n", i, j);
                System.out.printf("I=%.0f J=%.0f\n", i, j2);
                System.out.printf("I=%.0f J=%.0f\n", i, j3);
            }
            i += 0.2;
            j += 0.2;
            j2 += 0.2;
            j3 += 0.2;
        }
    }
}
