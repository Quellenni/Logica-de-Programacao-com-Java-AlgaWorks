package operadores;

import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		Double primNumero = scanner.nextDouble();

		System.out.println("Digite 1 para soma (+)");
		System.out.println("Digite 2 para subtração (-)");
		System.out.println("Digite 3 para multiplicação (*)");
		System.out.println("Digite 4 para divisão (/)");

		Integer operacao = scanner.nextInt();

		System.out.print("Digite o segundo número: ");
		Double segNumero = scanner.nextDouble();

		Double resultado = null;

		if (operacao.equals(1)) {
			resultado = primNumero + segNumero;
		}

		if (operacao.equals(2)) {
			resultado = primNumero - segNumero;
		}

		if (operacao.equals(3)) {
			resultado = primNumero * segNumero;
		}

		if (operacao.equals(4)) {
			resultado = primNumero / segNumero;
		}

		System.out.println("Resultado: " + resultado);

		scanner.close();

	}

}
