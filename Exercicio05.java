package repetição;
import java.util.Scanner;
public class Exercicio05 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Digite um número: ");
		int resp = input.nextInt();
		int x = 1;
		int y = 1;
		int qtd = 0;
		int qtd2 = 0;
		System.out.println("Impares");
		while (x <= resp) {
			if (x%2!=0) {
				System.out.println(x + " ");
				qtd++;
			}x++;
		}System.out.println("\n quantidade de números impares " + qtd);
		
		System.out.println("\n Pares");
		while (y <= resp) {
			if(y%2==0) {
			System.out.println(y + " ");
			qtd2++;
			}y++;
		}System.out.println("\n quantidade de números pares " + qtd2);
}
		
	}
