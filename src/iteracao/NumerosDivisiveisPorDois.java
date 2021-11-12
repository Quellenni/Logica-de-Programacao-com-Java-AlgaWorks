package iteracao;

public class NumerosDivisiveisPorDois {

	static final Integer DIVISOR = 2;

	public static void main(String[] args) {

		Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		int i = 0;

		while (i < numeros.length) {
			Integer numero = numeros[i];
			Integer divisorDois = numero % DIVISOR;

			if (divisorDois.equals(0)) {

				System.out.println(" Divisor de 2: " + numero);
			}

			i++;

		}

	}

}
