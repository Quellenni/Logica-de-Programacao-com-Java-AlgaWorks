package variaveis.constantes;

import java.util.Scanner;

public class SituacaoAluno {
	
	static final Integer NOTA_MINIMA_PARA_APROVACA0 = 70;
	
	public static void main(String[] args) {
		
	 Scanner scanner = new Scanner(System.in);
		
	 System.out.print("Digite sua nota: ");
	 Double notaAluno = scanner.nextDouble();
	 
	 Boolean alunoAprovado = notaAluno >= NOTA_MINIMA_PARA_APROVACA0;
	 
	 if (alunoAprovado) {
		 System.out.println("Parab�ns! Aluno aprovado!!");
		 }else {
			 System.out.println("Aluno de recupera��o!");
		 }
	 
	 scanner.close();
	 
	}
}