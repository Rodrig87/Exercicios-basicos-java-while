package exerciciosfor;

public class ex2 {

	public static void main(String[] args) {
		int soma = 0;
		int soma2 = 0;
		for (int x = 1; x <= 20; x++) { 
			if (x % 3 == 0) {
				soma += x;
			}
			if (x % 5 == 0) {
				soma2 += x;
			}
		x++;			
		}
		System.out.print("A soma dos multiplos de 3 é: " + soma);	
		
		System.out.print("\nA soma dos multiplos de 5 é: " + soma2);
		int somatotal = soma + soma2; 
		System.out.print("\nA soma total é de: " + somatotal);
	}

}
