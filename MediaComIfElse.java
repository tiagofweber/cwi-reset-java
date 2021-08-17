import java.util.Scanner;

public class MediaComIfElse {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a primeira nota:");
		double nota1 = scan.nextDouble();

		System.out.println("Digite a segunda nota:");
		double nota2 = scan.nextDouble();

		System.out.println("Digite a terceira nota:");
		double nota3 = scan.nextDouble();

		System.out.println("Digite a quarta nota:");
		double nota4 = scan.nextDouble();

		double soma = nota1 + nota2 + nota3 + nota4;
		double media = soma / 4;

		System.out.println("A média das notas é: " + media);

		if (media == 10) {
			System.out.println("Aluno aprovado com louvores!");
		} else if (media >= 7) {
			System.out.println("Aluno aprovado!");			
		} else if (media < 7) {
			System.out.println("Aluno reprovado!");
		}
	}
}