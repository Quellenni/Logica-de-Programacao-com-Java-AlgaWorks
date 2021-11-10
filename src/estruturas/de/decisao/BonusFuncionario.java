package estruturas.de.decisao;

import java.util.Scanner;

public class BonusFuncionario {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Meta de faturamento anual da empresa:  ");
		Double metaFaturamento = scanner.nextDouble();

		System.out.print("Faturamento real: ");
		Double realFaturamento = scanner.nextDouble();

		System.out.print("M�dia salarial do funcion�rio: ");
		Double mediaSalarial = scanner.nextDouble();

		Boolean faturamentoReal = realFaturamento >= metaFaturamento;

		Boolean faturamentoMeta = (realFaturamento < metaFaturamento)
				&& (realFaturamento >= (metaFaturamento * 80) / 100);

		if (faturamentoReal) {
			System.out.println("O b�nus do funcion�rio ser� de 100%: " + mediaSalarial);
		} else if (faturamentoMeta) {
			System.out.println("O b�nus do funcion�rio ser� de 80%: " + (mediaSalarial * 80) / 100);
		} else {
			System.out.println("Esse ano n�o ter� b�nus");
		}

		scanner.close();
	}
}
