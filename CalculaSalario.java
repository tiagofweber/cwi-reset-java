import java.util.Scanner;

public class CalculaSalario {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor por hora trabalhada:");
		double valorPorHora = scan.nextDouble();

		System.out.println("Digite a quantidade de horas trabalhadas por mês:");
		double horasTrabalhadas = scan.nextDouble();

		double salarioMensal = valorPorHora * horasTrabalhadas;
		System.out.println("O total do seu salário no mês atual é: " + salarioMensal);
	}
}