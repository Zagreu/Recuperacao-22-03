import java.util.Scanner;

import static java.lang.System.*;

public class Recuperacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int soma = 0;
        int maior = Integer.MAX_VALUE;
        int menor = Integer.MAX_VALUE;
            for (int i = 1; i <= 4; i++) {
                out.println("Digite o " + i + "° numero: ");
                numero = scanner.nextInt();
                soma += numero;
                if (numero > maior) {
                    maior = numero;
                }
                 if (numero < menor) {
                     menor = numero;
                 }
            }
            double media = (double) soma / 4;
        out.println("soma total: " +soma);
        out.println("Maior numero " +maior);
        out.println("Menor numero " +menor);
        out.println("Media dos numeros digitados " +media);
        scanner.close();
    }
}
