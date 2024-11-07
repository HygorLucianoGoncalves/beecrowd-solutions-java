package br.com.beecrowd.java.estruturasebibliotecas;

import java.util.Scanner;

public class P1022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Número de casos de teste

        for (int i = 0; i < n; i++) { // faz um for com cada caso

            int n1 = scanner.nextInt();
            scanner.next();
            int d1 = scanner.nextInt();

            String operator = scanner.next();

            int n2 = scanner.nextInt();
            scanner.next();
            int d2 = scanner.nextInt();

            int resultNumerator = 0;
            int resultDenominator = 0;

            switch (operator) { //faz o cálculo conforme o operador
                case "+":
                    resultNumerator = (n1 * d2) + (n2 * d1);
                    resultDenominator = d1 * d2;
                    break;
                case "-":
                    resultNumerator = (n1 * d2 ) - (n2 * d1);
                    resultDenominator = d1 * d2;
                    break;
                case "*":
                    resultNumerator = n1 * n2;
                    resultDenominator = d1 * d2;
                    break;
                case "/":
                    resultNumerator = n1 * d2;
                    resultDenominator = n2 * d1;
                    break;
            }

            int resultNumerator2 = resultNumerator;
            int resultDenominator2 = resultDenominator;

            int gcd = mdc(Math.abs(resultNumerator), Math.abs(resultDenominator));

             resultNumerator2 =  resultNumerator2 / gcd;
             resultDenominator2 /= gcd;

            System.out.printf("%d/%d = %d/%d%n", resultNumerator, resultDenominator, resultNumerator2, resultDenominator2);
        }
        scanner.close();
    }
/**implementa o algoritmo para calcular o Maior Divisor Comum (MDC) de dois números inteiros, a e b, usando o algoritmo de Euclides.

Aqui está o que está acontecendo no código:

A função public static int mdc(int a, int b) é declarada para calcular o MDC de a e b.

Um loop while é usado para calcular o MDC. O loop continua enquanto b não for igual a zero.

Dentro do loop:

int temp = b; armazena o valor de b em uma variável temporária temp.

b = a % b; calcula o resto da divisão de a por b e armazena o resultado em b.

a = temp; atribui o valor temporário temp de volta a a. Isso é feito para que a contenha o valor original de b, e b contenha o resto da divisão anterior.

O loop continua até que b seja igual a zero. Quando isso acontece, significa que a contém o valor do MDC.

A função retorna o valor absoluto de a usando Math.abs(a) antes de retornar o resultado. Isso garante que o MDC seja sempre um valor não negativo.

O algoritmo de Euclides é eficiente para calcular o MDC de dois números inteiros e é baseado na ideia de que o MDC de dois números não muda se você substituir
um deles pelo resto da divisão entre os dois números. Portanto, ele continua calculando o resto da divisão até que o segundo número se torne zero,
momento em que o primeiro número conterá o MDC.
**/
    public static int mdc(int a, int b) {// Maior Divisor Comum
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
}


