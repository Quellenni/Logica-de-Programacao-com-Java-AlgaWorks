package estruturas.de.decisao;

import java.util.Scanner;

public class DiasDaSemana {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o dia da semana:  ");
		Integer diaSemana = scanner.nextInt();

		String dia = "";

		switch (diaSemana) {
		case 1:
			dia = "Domingo";
			break;

		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Ter�a";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "S�bado";
			break;
		default:
			System.err.println("Digite um dia v�lido");
			System.exit(1);

		}
		System.out.println(dia);
		scanner.close();
	}

}
