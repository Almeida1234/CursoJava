package arrays;

import java.util.Scanner;

public class Desafio {
	
	public static void main(String[] args) {
		
//		Scanner entrada = new Scanner(System.in);
//		
//		System.out.print("Quantas notas você quer informar? ");
//		int qtdNotas = entrada.nextInt();
//		double[] notasAluno1 = new double[qtdNotas];
//		//double[] notasAluno1 = new double[entrada.nextInt()];
//		
//		for (int i = 0; i < notasAluno1.length; i++) {
//			System.out.print("Digite uma nota: ");
//			notasAluno1[i] = entrada.nextDouble();
//			
//		}
//		
//		double media = 0;
//		int qtd = 1;
//		for (double notas1 : notasAluno1) {
//			System.out.printf("\nNota %d: %.1f", qtd, notas1);
//			qtd ++;
//			media += notas1;
//		}
//				
//		System.out.printf("\nA média do aluno é %.1f", media / notasAluno1.length);
//		
//		entrada.close();
		
		
		Scanner entrada1 = new Scanner(System.in);
		
		// Validar quantidade de notas
		int num = 0;
		while (num <= 0) {
			System.out.print("Quantas notas você quer informar? ");
			if (entrada1.hasNextInt()) {
				num = entrada1.nextInt();
				if (num <= 0) {
					System.out.println("❌ Digite um número positivo!");
				}
			} else {
				System.out.println("❌ Entrada inválida! Digite um número inteiro.");
				entrada1.nextLine(); // limpa o buffer
			}
		}
		
		double[] notasAluno2 = new double[num];
		
		// Validar cada nota
		for (int i = 0; i < notasAluno2.length; i++) {
			double nota = -1;
			while (nota < 0 || nota > 10) {
				System.out.print("Digite a nota " + (i + 1) + " (0-10): ");
				if (entrada1.hasNextDouble()) {
					nota = entrada1.nextDouble();
					if (nota < 0 || nota > 10) {
						System.out.println("❌ Nota deve estar entre 0 e 10!");
					}
				} else {
					System.out.println("❌ Entrada inválida! Digite um número.");
					entrada1.nextLine(); // limpa o buffer
				}
			}
			notasAluno2[i] = nota;
		}
		
		// Exibir notas e calcular média
		double media1 = 0;
		int qtd1 = 1;
		for (double notas2 : notasAluno2) {
			System.out.printf("\nNota %d: %.1f", qtd1, notas2);
			qtd1 ++;
			media1 += notas2;
		}
				
		System.out.printf("\nA média do aluno é: %.1f\n", media1 / notasAluno2.length);
		
		entrada1.close();
		
		
	}

}
