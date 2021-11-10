package operadores;

import java.util.Scanner;

public class CalculoGastoMensal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Double gastoTotal = 0.0;

		System.out.print("Conta de luz R$: ");
		gastoTotal += scanner.nextDouble();

		System.out.print("Conta de água R$: ");
		gastoTotal += scanner.nextDouble();

		System.out.print("Conta de telefone R$: ");
		gastoTotal += scanner.nextDouble();

		System.out.print("Escola do filho R$: ");
		gastoTotal += scanner.nextDouble();

		System.out.print("Fatura do cartão R$: ");
		gastoTotal += scanner.nextDouble();

		System.out.print("Gastos com supermercado R$: ");
		gastoTotal += scanner.nextDouble();

		System.out.println("O gasto total do mês foi de R$: " + gastoTotal);

		scanner.close();
	}

}
