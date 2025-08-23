import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        float numero1 = scanner.nextFloat();

        System.out.print("Digite o segundo numero: ");
        float numero2 = scanner.nextFloat();

        float resultado = numero1 + numero2;
        System.out.println("Resultado: " + resultado);
    }
}