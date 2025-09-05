import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(
                "Bem vindo à sua calculadora\n" +
                        "+ para Adição\n" +
                        "x para Multiplicação\n" +
                        "- para Subtração\n" +
                        "% para Divisão\n\n" +
                        "Escreva na mesma linha: primeiro número, sinal e segundo número\n>>> "
        );

        int numeroUm = scanner.nextInt();
        String sinal = scanner.next();
        int numeroDois = scanner.nextInt();

        int conta = 0;

        if (sinal.equals("+")) {
            conta = numeroUm + numeroDois;
        } else if (sinal.equals("x")) {
            conta = numeroUm * numeroDois;
        } else if (sinal.equals("-")) {
            conta = numeroUm - numeroDois;
        } else if (sinal.equals("%")) {
            conta = numeroUm / numeroDois;
        } else {
            System.out.println("Sinal inválido!");
            scanner.close();
            return;
        }

        System.out.println("Resultado: " + conta);

        scanner.close();
    }
}
