package controle.exercicios;

import java.util.Scanner;

public class ExercicioControle1 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um número entre 0 e 10: ");
		int num = entrada.nextInt();
		
		if(num >= 0 && num <= 10) {
			System.out.println("Número válido");
			if(num % 2 == 0) {
				System.out.println(String.format("O número %d é Par!", num));
			}else {
				System.out.println(String.format("O número %d é Ímpar!", num));
			}
		}else {
			System.out.println("Número não está entre 0 e 10");
		}
		
		entrada.close();
	}

}
