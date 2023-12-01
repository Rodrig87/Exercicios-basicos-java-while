package exerciciosfor;
import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		double soma = 0;
		int cont = 1;
		Scanner input = new Scanner (System.in);
		System.out.println("Informe a quantidade de alunos na sala: ");
		int alunos = input.nextInt();
		for (int x = 1; cont <= alunos; x++) {
			System.out.println("Digite a nota: ");
			double nota = input.nextDouble();
			System.out.println();
			soma = soma + nota;
			cont++;
		}
		double media = soma/alunos;
		System.out.println("A média é de: "+ media);
	}
	
}
