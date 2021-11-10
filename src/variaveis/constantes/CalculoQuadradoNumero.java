package variaveis.constantes;

import java.util.Scanner;

public class CalculoQuadradoNumero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número: ");
		Integer numero = scanner.nextInt();

		Integer quadradoNumero = numero * numero;

		System.out.println("O quadrado do número " + numero + " é: " + quadradoNumero);

		scanner.close();
	}

}
