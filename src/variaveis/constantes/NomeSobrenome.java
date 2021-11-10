package variaveis.constantes;

import java.util.Scanner;

public class NomeSobrenome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter your first name: ");

		String firstName = scanner.nextLine();

		System.out.print("Please enter your last name: ");

		String lastName = scanner.nextLine();

		System.out.println("Hello " + firstName + " " + lastName + "!");

		scanner.close();
	}

}