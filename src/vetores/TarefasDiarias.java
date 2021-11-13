package vetores;

import java.util.Scanner;

public class TarefasDiarias {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] tarefa = new String[5];

		for (int i = 0; i < tarefa.length; i++) {

			System.out.print("Tarefa " + (i + 1) + ":");
			tarefa[i] = scanner.nextLine();

		}

		System.out.println("Tarefas do dia: ");
		for (int i = 0; i < tarefa.length; i++) {
			System.out.println((i + 1) + ": " + tarefa[i]);
		}

		scanner.close();
	}

}