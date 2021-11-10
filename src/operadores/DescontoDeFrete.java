package operadores;

import java.util.Scanner;

public class DescontoDeFrete {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Valor do Produto R$: ");
		Double valorProduto = scanner.nextDouble();

		Integer valorFrete = 15;

		Double valorTotal = null;

		if (valorProduto < 100) {
			valorTotal = valorProduto + valorFrete;
		}
		if (valorProduto >= 100) {
			valorTotal = valorProduto;
		}

		System.out.println("O valor total é de R$: " + valorTotal);

		scanner.close();

		// Boolean

		/*
		 * System.out.print("Valor do Produto R$: "); Double valorProduto =
		 * scanner.nextDouble();
		 * 
		 * Boolean cobrarFrete = valorProduto < 100;
		 * 
		 * Double valorTotal = valorProduto;
		 * 
		 * if (cobrarFrete) { valorTotal += 15.0; }
		 * 
		 * System.out.println("O valor total é de R$: " + valorTotal);
		 * 
		 * scanner.close();
		 */

	}

}
