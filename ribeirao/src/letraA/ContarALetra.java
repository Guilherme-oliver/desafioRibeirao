package letraA;

import java.util.Scanner;

public class ContarALetra {
    /*
    2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou
    minúscula, além de informar a quantidade de vezes em que ela ocorre.

    IMPORTANTE: Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser
    previamente definida no código;
     */
    public static String contarA(String input) {
        int contagem = 0;
        for (char c : input.toCharArray()) {
            if (c == 'a' || c == 'A') {
                contagem++;
            }
        }

        if (contagem > 0) {
            return "A letra 'a' aparece " + contagem + " vezes na string.";
        } else {
            return "A letra 'a' não está presente na string.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String entrada = scanner.nextLine();
        String resultado = contarA(entrada);
        System.out.println(resultado);
        scanner.close();
    }
}