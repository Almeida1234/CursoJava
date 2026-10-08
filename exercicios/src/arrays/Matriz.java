package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int qtdAlunos = 0;
		while (qtdAlunos <= 0) {
			System.out.print("Informe quantos alunos tem na turma: ");
			if (entrada.hasNextInt()) {
				qtdAlunos = entrada.nextInt();
				if (qtdAlunos <= 0) {
					System.out.println("❌ Digite um número positivo!");
				}
			} else {
				System.out.println("❌ Entrada inválida! Digite um número inteiro.");
				entrada.next(); // limpa o buffer				
			}
		}
		
		int qtdNotas = 0;
		while (qtdNotas <= 0) {
			System.out.print("Quantas notas cada aluno tem: ");
			if (entrada.hasNextInt()) {
				qtdNotas = entrada.nextInt();
				if (qtdNotas <= 0) {
					System.out.println("❌ Digite um número positivo!");
				}
			} else {
				System.out.println("❌ Entrada inválida! Digite um número inteiro.");
				entrada.next(); // limpa o buffer				
			}
		}		
		
		double[][] notasDaTurma = new double [qtdAlunos][qtdNotas];
		
		double total = 0;
		double subTotal = 0;
		for (int a = 0; a < notasDaTurma.length; a++) {	
			subTotal = 0;
			System.out.printf("Digite o nome do(a) %dº aluno(a): ", a + 1);
			String nomeAluno = entrada.next();
			
			for (int n = 0; n < notasDaTurma[a].length; n++) {
			double nota = -1; 
			while (nota < 0 || nota > 10) { 
				System.out.printf( "Digite a %dº nota do(a) Aluno(a) %s: ", n + 1, nomeAluno); 
				if (entrada.hasNextDouble()) { 
					nota = entrada.nextDouble(); 
					if (nota < 0 || nota > 10) { 
						System.out.println( "❌ Nota inválida! Digite uma nota entre 0 e 10."); 
					} 
				} else { 
				System.out.println( "❌ Entrada inválida! Digite um número."); 
				entrada.next(); 
				} 
			} 
				notasDaTurma[a][n] = nota; 
				total += nota; 
				subTotal += nota; 
			}
			System.out.printf("A média %s é: %.1f\n\n", nomeAluno, subTotal / notasDaTurma[a].length);
		}

		double media = total / (qtdAlunos * qtdNotas);
		System.out.println("A média da turma é " + media + "\n");
		
		for(double[] notasDoAluno : notasDaTurma) {
			System.out.println("Notas: " + Arrays.toString(notasDoAluno));
		}
		
		entrada.close();

	}

}
