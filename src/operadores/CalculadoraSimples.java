package operadores;

import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o primeiro n�mero: ");
		Double primNumero = scanner.nextDouble();

		System.out.println("Digite 1 para soma (+)");
		System.out.println("Digite 2 para subtra��o (-)");
		System.out.println("Digite 3 para multiplica��o (*)");
		System.out.println("Digite 4 para divis�o (/)");

		Integer operacao = scanner.nextInt();

		System.out.print("Digite o segundo n�mero: ");
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
