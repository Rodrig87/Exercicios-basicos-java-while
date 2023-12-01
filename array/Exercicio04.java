package array;
import java.util.Arrays;
import java.util.Scanner;
public class Exercicio04 {

	public static void main(String[] args) {
		double soma = 0;
		Scanner input = new Scanner (System.in);
		double arrayNotas[] = new double [5];
		
		for (int x = 0; x < arrayNotas.length; x++) {
			System.out.println("Digite as notas: ");
			arrayNotas[x]= input.nextDouble();
			
		}
		for (double arrayNotas : soma) {
			soma =+ arrayNotas;
	}
	}
}
