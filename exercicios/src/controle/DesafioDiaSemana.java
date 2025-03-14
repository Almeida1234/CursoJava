package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	
	public static void main(String[] args) {
		
		// Desafio criar um programa aonde o usuário irá digitar o dia da semana
		// e o programa retorna o numero associado a ele ex:
		// Domingo -> 1
		// Quarta -> 4
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um dia da semana: ");
		String semana = entrada.next().toUpperCase().replace("Ç", "C").replace("Á", "A");
		
				
		if(semana.equals("DOMINGO")) {
			int domingo = 1;
			System.out.printf("Domingo é associado ao número: %d \n", domingo);
			System.out.println("Domingo é associado ao número: " + domingo);
			System.out.println(String.format("Domingo é associado ao número: %d", domingo));
		}else if(semana.equalsIgnoreCase("segunda")) {
			System.out.println("Segunda é associado ao número: 2");
		}else if(semana.equalsIgnoreCase("terca") 
				|| semana.equalsIgnoreCase("terça") ) {
			System.out.println("Terça é associado ao número: 3");
		}else if(semana.equals("QUARTA")) {
			System.out.println("Quarta é associado ao número: 4");
		}else if(semana.equals("QUINTA")) {
			System.out.println("Quinta é associado ao número: 5");
		}else if(semana.equals("SEXTA")) {
			System.out.println("Sexta é associado ao número: 6");
		}else if(semana.equals("SABADO")) {
			System.out.println("Sábado é associado ao número: 7");
		}else {
			System.out.println("Esse dia da semana não exite");
		}
		
		
		entrada.close();
		
	}

}
