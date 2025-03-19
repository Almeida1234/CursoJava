package controle.exercicios;

import java.util.Scanner;

public class ExercicioControle7 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int somatotal = 0;
		int numero = 0;
		while(numero >= 0) {
			System.out.print("Digite um número: ");
			numero = entrada.nextInt();
			if(numero >= 0) {
				somatotal += numero;
			}
		}
		System.out.println("A soma total dos numeros é: " + somatotal);
		
		entrada.close();
	}
}
