package fundamentos;

import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");

		// Para os demais Byte, Short e Long escrevendo com a letra minuscula ele já
		// vira um primitivo.
		// byte
		Byte b = 100;
		Short s = 1000;

		Integer j = Integer.parseInt(entrada.next());
		Integer i = 10000; // Tipo primitivo é o int
		Long l = 100000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(j * 3);
		System.out.println(i * 3);
		System.out.println(l /3);
		
		Float f = 123.11F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; // char
		System.out.println(c + "...");

		entrada.close();
	}

}
