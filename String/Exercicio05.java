package String;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Digite aqui um texto: ");
		String resp = input.nextLine();
		
		String texto = resp.toUpperCase();
		System.out.println(texto);

	}

}
