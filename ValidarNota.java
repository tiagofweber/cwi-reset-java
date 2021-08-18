import java.util.Scanner;

public class ValidarNota {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean notaInvalida = true;

		while(notaInvalida) {

			System.out.println("Digite uma nota entre 0 e 10:");
			double nota = scan.nextDouble();

			if (nota < 0 || nota > 10) {
				System.out.println("Número inválido!");
			} else {
				System.out.println("Você digitou a nota " + nota);
				notaInvalida = false;
			}
		}

		
	}
}