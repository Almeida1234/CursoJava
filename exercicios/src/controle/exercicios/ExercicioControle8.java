package controle.exercicios;

import java.util.Scanner;

public class ExercicioControle8 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int contador = 0;
		int valor = 0;
		
		while(contador < 10) {
			System.out.print("Digite um numero: ");
			int numero = entrada.nextInt();
			contador += 1;
			
			if(numero > valor) {
				valor = numero;
			}
		}
		System.out.println("O maior número digitado foi o: " + valor);
		
		int contador1 = 0;
		int valor1 = 0;
		
		do {
			System.out.print("Digite um numero: ");
			int numero1 = entrada.nextInt();
			contador1 += 1;
			
			if(numero1 > valor1) {
				valor1 = numero1;
			}
		} while(contador1 < 10);
		
		System.out.println("O maior número digitado foi o: " + valor1);
		
		entrada.close();
	}

}
