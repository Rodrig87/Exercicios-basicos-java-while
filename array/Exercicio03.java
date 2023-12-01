package array;
import java.util.Scanner;
import java.util.Arrays;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int Arraya []= new int [10];
		int Arrayb []= new int [10];
		int Arrayc []= new int [10];
		int Arrayd []= new int [10];
		
		for(int i = 0; i<Arraya.length;i++) {
			System.out.println("Digite aqui os valores");
			Arraya[i] = input.nextInt(); 
	}	System.out.println("O Array A tem os seguintes valores: ");
		for (int x : Arraya) {
			System.out.print(x +" ");
		}
		System.out.println("O Array B tem os seguintes valores: ");
		for(int i = 0; i<Arrayb.length;i++) {
			System.out.println("Digite aqui os valores");
			Arrayb[i] = input.nextInt();
	}
		System.out.println("O Array C tem os seguintes valores: ");
		for(int i = 0; i<Arrayc.length;i++) {
			System.out.println("Digite aqui os valores");
			Arrayc[i] = input.nextInt();
	}
		System.out.println("O Array D tem os seguintes valores: ");
		for(int i = 0; i<Arrayd.length;i++) {
			System.out.println("Digite aqui os valores");
			Arrayd[i] = input.nextInt();
	}
	}

}
