package String;

import java.util.Scanner;
import java.util.StringTokenizer;
public class Exercicio03 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Digite aqui um texto: ");
		String resp = input.nextLine();
		StringTokenizer texto = new StringTokenizer (resp);
		System.out.println(texto.countTokens());

	}

}
