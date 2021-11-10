package estruturas.de.decisao;

import java.util.Scanner;

public class NotasConcurso {

	static final Integer NOTA_MINIMA_PARA_APROVACAO = 60;

	static final Integer NOTA_MINIMA_TOTAL_APROVACAO = 150;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nota Portugu�s: ");
		Double notaPort = scanner.nextDouble();

		System.out.print("Nota Matem�tica: ");
		Double notaMat = scanner.nextDouble();

		Double resultado = notaPort + notaMat;

		Boolean aprovacaoPort = notaPort >= NOTA_MINIMA_PARA_APROVACAO;

		Boolean aprovacaoMat = notaMat >= NOTA_MINIMA_PARA_APROVACAO;

		Boolean totalAprovacao = resultado >= NOTA_MINIMA_TOTAL_APROVACAO;

		if (aprovacaoPort && aprovacaoMat && totalAprovacao) {
			System.out.println("Parab�ns sua pontua��o total foi de " + resultado + " e voc� foi aprovado!!");
		} else {
			System.out.println("Voc� n�o atingiu a nota m�nima para aprova��o");
		}

		scanner.close();

	}

}
