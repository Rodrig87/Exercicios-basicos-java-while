package String;
import java.util.StringTokenizer;

public class Exercicio01 {

	public static void main(String[] args) {
		String str = "Hello";
			String resultado = str.replace("l", "w");
		System.out.println(resultado);
		//Substituição de Caracteres

		String x = "Hello World";
			resultado = x.substring(6);
		System.out.println(resultado);
		//Para extrair um texto de uma String
			resultado = x.substring (3, 8);
		System.out.println(resultado);
		
		
		String y = "Hello";
			resultado = y.toUpperCase();
		System.out.println(resultado);
		//Alterando os caracteres de uma String para maiúsculo
		
		String z = "Hello";
			resultado = z.toLowerCase ( ); 
		System.out.println(resultado);
		//Alterando os caracteres de uma String para minúsculo
		
	
		String t = " Hello ";
			resultado = t.trim ( ); 
		System.out.println(resultado);
		//Retirando espaços em branco
		
		String b = "Hello";
			char c = b.charAt (1); 
		System.out.println(c);
		//Extração de Caractere
		
		String s1 = "Hello";
		String s2 = "HELLO";
		boolean b1 = s1.equals ("Hello");
		boolean b2 = s1.equals (s2);
		boolean b3 = s1.equalsIgnoreCase (s2);
		boolean b4=s1.equalsIgnoreCase("azul"); 
		System.out.println(b1 +" "+ b2 +" "+ b3 + " " + b4);
		//Comparação de Strings
		
		String s = "abc";
		int tam = s.length();
		System.out.println(tam);
		//Tamanho de uma string
		
		String u = "Hello World World2";
		int pos = u.indexOf ("l");
		int pos1 = u.lastIndexOf ("l");
		System.out.println(pos + " " + pos1);
		//Identificando a posição de caracteres ou substrings em uma String
		
		String valor = "CDD4.0 - Java";
		System.out.println(valor.compareTo("CDD4.0 - Java") == 0 ? true : false);
		System.out.println(valor.compareTo("CDD4.0 - JAVA") == 0 ? true : false);
		System.out.println(valor.compareToIgnoreCase("CDD4.0 - JAVA") == 0 ? true : false);
		
		/*Ambos fazem comparação de duas
		Strings, sendo que o primeiro
		(compareTo) considera letras
		maiúsculas e minúsculas na
		comparação e o segundo
		(compareToIgnoreCase)*/
		
		System.out.println();
		String valor2 = "CDD - Java";
		 System.out.println(valor2.endsWith("Java"));
		 System.out.println(valor2.startsWith("C"));
		 System.out.println(valor2.startsWith("DD", 1));
		 
		 /*O método endsWith verifica se a String termina
		com o valor especificado, por outro lado o
		startsWith verifica se a String começa com o valor
		especificado.*/ 	
		 
		 StringTokenizer exemplo = new StringTokenizer("O mundo não é mais o mesmo mas não iremos desistir nunca");
			System.out.println(exemplo.countTokens());
		//Contando palavras de um texto usando StringTokenizer
	}
			

}
