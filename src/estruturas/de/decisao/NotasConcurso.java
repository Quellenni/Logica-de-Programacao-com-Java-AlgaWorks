package estruturas.de.decisao;

import java.util.Scanner;

public class NotasConcurso {

	static final Integer NOTA_MINIMA_PARA_APROVACAO = 60;

	static final Integer NOTA_MINIMA_TOTAL_APROVACAO = 150;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nota Português: ");
		Double notaPort = scanner.nextDouble();

		System.out.print("Nota Matemática: ");
		Double notaMat = scanner.nextDouble();

		Double resultado = notaPort + notaMat;

		Boolean aprovacaoPort = notaPort >= NOTA_MINIMA_PARA_APROVACAO;

		Boolean aprovacaoMat = notaMat >= NOTA_MINIMA_PARA_APROVACAO;

		Boolean totalAprovacao = resultado >= NOTA_MINIMA_TOTAL_APROVACAO;

		if (aprovacaoPort && aprovacaoMat && totalAprovacao) {
			System.out.println("Parabéns sua pontuação total foi de " + resultado + " e você foi aprovado!!");
		} else {
			System.out.println("Você não atingiu a nota mínima para aprovação");
		}

		scanner.close();

	}

}
