import java.util.Scanner;

public class CompararNumeros {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numMaior = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um número:");
			int num = scan.nextInt();

			if (i == 0) {
				numMaior = num;
			} else if (numMaior < num) {
				numMaior = num;
			}
		}

		System.out.println("O maior número digitado foi: " + numMaior);
	}
}