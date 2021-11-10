package variaveis.constantes;

import java.util.Scanner;

public class TotalComDesconto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Qual o valor do produto? ");
		Double valorProduto = scanner.nextDouble();

		System.out.print("Quantidade: ");
		Integer quantidadeProduto = scanner.nextInt();

		Double subtotal = quantidadeProduto * valorProduto;

		Boolean quantidadeMenorDez = quantidadeProduto < 10;

		Double desconto = 0.0;

		if (!quantidadeMenorDez) {

			desconto = 10.0;
		}

		Double descontoValor = subtotal * desconto / 100;

		Double valorTotal = subtotal - descontoValor;

		System.out.println("Valor Total: " + valorTotal);

		scanner.close();
	}

}
