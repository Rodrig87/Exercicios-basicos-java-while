package array;
import java.util.Arrays;
public class Exercicio01 {

	public static void main(String[] args) {
		int intArray [] = {2,5,46,12,34};
		int intArray2 [] = new int [5];
		for(int i = 0; i<intArray.length;i++) {
			System.out.print(intArray[i]+ " ");
	}
		System.out.println();
		for(int i = 4; i>=0;i--) {
			System.out.print(intArray[i]+ " ");
			intArray2 [4-i]=intArray[i];
	}
		System.out.println();
		for(int i = 0; i<intArray.length;i++) {
			System.out.print(intArray2[i]+ " ");
	}
		
	}

}
