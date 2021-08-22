import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetor1 = new int[5];
		int[] vetor2 = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Entre com um número:");
			int num = scan.nextInt();
			vetor1[i] = num;
		}

		for (int i = 0; i < 5; i++) {
			vetor2[i] = vetor1[i] * 2;
		}

		System.out.println("Vetor 1:");
		for (int vet : vetor1) {
			System.out.println(vet);
		}

		System.out.println("Vetor 2:");
		for (int vet : vetor2) {
			System.out.println(vet);
		}
	}
}