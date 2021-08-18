import java.util.Scanner;

public class ImprimirIntervalo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean numInvalido = true;

		System.out.println("Digite o primeiro número:");
		int num1 = scan.nextInt();
		int num2 = 0;

		while (numInvalido) {
			System.out.println("Digite o segundo número:");
			num2 = scan.nextInt();

			if (num2 <= num1) {
				System.out.println("Número inválido! O segundo número deve ser maior que o primeiro!");
			} else {
				numInvalido = false;
			}
		}

		for (int i = num1+1; i < num2; i++) {
			System.out.println(i);
		}
	}
}