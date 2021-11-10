package operadores;

import java.util.Scanner;

public class Aposentadoria {

	static final Integer IDADE_MINIMA_PARA_APOSENTAR = 55;

	static final Integer TEMPO_MINIMO_CONTRIBUINDO = 25;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Idade: ");
		Integer idade = scanner.nextInt();

		System.out.print("Tempo de contribui��o: ");
		Integer contribuicao = scanner.nextInt();

		Boolean idadadeParaAposentar = idade >= IDADE_MINIMA_PARA_APOSENTAR;

		Boolean tempoContribuindo = contribuicao >= TEMPO_MINIMO_CONTRIBUINDO;

		Boolean aposentadoriaLiberada = idadadeParaAposentar && tempoContribuindo;

		if (aposentadoriaLiberada) {
			System.out.println("Voc� pode se aposentar!");
		} else {
			System.out.println("Voc� ainda n�o pode se aposentar");
		}

		scanner.close();
	}
}