package programaFibonacci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    /*
    1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos
    2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem
    que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem
    avisando se o número informado pertence ou não a sequência.

    IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode
    ser previamente definido no código;
     */
    public static String pertenceAFibonacci(int n) {
        List<Integer> fib = new ArrayList<>();
        fib.add(0);
        fib.add(1);

        while (fib.get(fib.size() - 1) < n) {
            fib.add(fib.get(fib.size() - 1) + fib.get(fib.size() - 2));
        }

        if (fib.contains(n)) {
            return "O número " + n + " pertence à sequência de Fibonacci.";
        } else {
            return "O número " + n + " não pertence à sequência de Fibonacci.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();
        String resultado = pertenceAFibonacci(numero);
        System.out.println(resultado);
        scanner.close();
    }
}