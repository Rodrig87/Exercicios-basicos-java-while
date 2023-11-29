package repetição;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		double soma = 0;
		int cont = 0;
		Scanner input = new Scanner (System.in);
		System.out.println("Informe a quantidade de alunos:");
		int aluno = input.nextInt();
		while (cont < aluno) {
			System.out.println("Digite a primeira nota: ");
			double nota = input.nextDouble();
			soma = soma + nota;
			cont++;
		
	}
		double media = soma/aluno;
		System.out.println("A média é :" +media);
}
}