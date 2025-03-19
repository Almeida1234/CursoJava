package controle.exercicios;

import java.util.Scanner;

public class ExercicioControle4 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int contadorDeDivisore = 0;
		
		System.out.print("Digite um número para verificar se é primo: ");
		int numero = entrada.nextInt();
		
		if(numero <= 1) {
			System.out.println("O número deve ser maior que 1 para ser considerado primo.");
		}else {
			for(int i = 2; i < numero; i++) {
				if(numero % i == 0) {
					contadorDeDivisore++;
				}
			}
			if(contadorDeDivisore == 0) {
				System.out.println(String.format("O número %d é primo.", numero));
			}else {
				System.out.println(String.format("O número %d não é primo.", numero));
			}
		}
		
		
		System.out.println("-----------------------------------------------");
		
		
		int contadorDeDivisore1 = 0;
		
		System.out.print("Digite um número para verificar se é primo: ");
		int numero1 = entrada.nextInt();
		
		if(numero1 <= 1) {
			System.out.println("O número deve ser maior que 1 para ser considerado primo.");
		}else {
			for(int i = 2; i < numero1; i++) {
				if(numero1 % i == 0) {
					contadorDeDivisore1++;
				}
			}
			
			switch (contadorDeDivisore1) {
			
			case 0:
				System.out.println(String.format("O número %d é primo.", numero1));
				break;
				
			default:
				System.out.println(String.format("O número %d não é primo.", numero1));
			}
			
		}
				
				
		entrada.close();
	}

}
