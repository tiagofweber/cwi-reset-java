import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número de 1 a 10:");
		int num = scan.nextInt();

		System.out.println("Tabuada do " + num + ":");

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
	}
}