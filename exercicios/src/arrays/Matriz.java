package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		int qtdAluno = -1;
		
		while (true) {
			System.out.print("Quantos alunos você tem?: ");
            if (entrada.hasNextInt()) {  // Verifica se a próxima entrada é um inteiro
                qtdAluno = entrada.nextInt();
                break;
            } else {
                System.out.println("Por favor, insira um número inteiro válido.");
                entrada.next();
			}
        }
		
		int qtdNota = -1;
		
		while (true) {
			System.out.print("E quantas notas cada aluno vai ter?: ");
            if (entrada.hasNextInt()) {  // Verifica se a próxima entrada é um inteiro
                qtdNota = entrada.nextInt();
                break;
            } else {
                System.out.println("Por favor, insira um número inteiro válido.");
                entrada.next();
			}
        }
		
		double somatotal = 0;
		double mediaAluno = 0;
		double[][] notasDaTurma = new double[qtdAluno][qtdNota];
		
		for(int a = 0; a < notasDaTurma.length; a ++ ) {
			for(int n = 0; n < notasDaTurma[a].length; n ++) {
				while(true) {
					System.out.print("Informe a " + (n + 1) + "° nota do Aluno " + (a + 1) + ": ");
					if(entrada.hasNextDouble()) {
						double nota = entrada.nextDouble();
						if(nota < 0 || nota > 10) {
							System.out.println("Nota inválida. A nota deve ser entre 0 e 10.");
						} else {
							notasDaTurma[a][n] = nota;
							somatotal += notasDaTurma[a][n];
							mediaAluno += notasDaTurma[a][n];
							break;
						}
					} else {
						System.out.println("Digite um número!");
						entrada.next();
					}
				}
			}
			System.out.println("Notas do Aluno: " + Arrays.toString(notasDaTurma[a]) + " - Média do aluno: " + (mediaAluno / qtdAluno));	
			mediaAluno = 0;
		}
		double media = somatotal / (qtdAluno * qtdNota);
		System.out.println("A Soma total das notas da turma é: " + somatotal);
		System.out.println("A media da turma é: " + media);
		
		
		double somatotal1 = 0;
        double media1 = somatotal1 / (qtdAluno * qtdNota);
		for (double[] notasDoAluno : notasDaTurma) {
            double somaAluno = 0; // Soma das notas de cada aluno
            for (double nota : notasDoAluno) {
                somaAluno += nota; // Somando as notas do aluno
            }
            somatotal1 += somaAluno; // Soma das notas de todos os alunos
            media1 += somaAluno / notasDoAluno.length; // Calculando a média da turma
            System.out.println("Notas do Aluno: " + Arrays.toString(notasDoAluno) + " - Média do aluno: " + (somaAluno / notasDoAluno.length));
        }
		
		System.out.println("A Soma total das notas da turma é: " + somatotal1);
		System.out.println("A media da turma é: " + media1 / notasDaTurma.length);
		
		entrada.close();
		}
}


