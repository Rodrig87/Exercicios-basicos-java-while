package exerciciosfor;

public class ex3 {

	public static void main(String[] args) {
		double x = 0;
		
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				x = i / 2;
				System.out.println(i + " = " + x);
			}else {
				x = 3 * i + 1;
				System.out.println(i + " = " + x);
			}
	}

}
}