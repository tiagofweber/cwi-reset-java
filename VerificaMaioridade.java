import java.util.Scanner;

public class VerificaMaioridade {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] idades = new int[10];
		int qtdMaioridade = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite a idade da pessoa " + (i + 1) + ":");
			idades[i] = scan.nextInt();
		}

		for (int idade : idades) {
			if (idade >= 18) {
				qtdMaioridade++;
			}
		}

		for (int i = 0; i < 10; i++) {
			System.out.println("A pessoa " + (i +1) + " tem " + idades[i] + " anos.");
		}

		System.out.println(
			"A quantidade de pessoas com idade maior ou igual a 18 anos é " +
			qtdMaioridade
		);
	}
}