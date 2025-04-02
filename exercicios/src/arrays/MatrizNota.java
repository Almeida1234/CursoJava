package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrizNota {
	double[] notasDaTurma;
	int valorAluno;
	Scanner entrada;
	
	MatrizNota(){
		entrada = new Scanner(System.in);
	}
	
	int informeQtdAluno() {
		int qtdAluno = -1;
		
		while (true) {
			System.out.print("Quantos alunos você tem?: ");
            if (entrada.hasNextInt()) {  // Verifica se a próxima entrada é um inteiro
                qtdAluno = entrada.nextInt();
                valorAluno = qtdAluno;
                break;
            } else {
                System.out.println("Por favor, insira um número inteiro válido.");
                entrada.next();
			}
        }
		return qtdAluno;
	}
	
	int informeQtdNota() {
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
		return qtdNota;
	}
	
	int informeQtdNotas1() {
		int qtdNotas1 = -1;
		while(true) {
			System.out.print("Quantas notas você quer informar?: ");
			if(entrada.hasNextInt()) {
				qtdNotas1 = entrada.nextInt();
				if(qtdNotas1 > 0) {
					break;
				} else {
					System.out.println("O número precisa ser inteiro e positivo!");
				}
			} else {
				System.out.println("Informe um número inteiro");
				entrada.next();
			}
		}
		return qtdNotas1;
	}
	
	double[] digiteNotas1 () {
		// Solicita a quantidade de notas usando o metodo Informe notas
		int qtdNotas1 = informeQtdNotas1(); 
		double[] notasAluno = new double[qtdNotas1];
		
		for(int i = 0; i < notasAluno.length; i++) {
			while(true) {
				System.out.print("Informe a " + (i + 1) + "° nota: ".replace(".", ","));
				if(entrada.hasNextDouble()) {
					double num = entrada.nextDouble();
					if (num < 0 || num > 10) {
	                    System.out.println("Nota inválida. A nota deve ser entre 0 e 10.");
	                }else {
						notasAluno[i] = num;
						break;						
					}
				} else {
					System.out.println("Digite um número!");
					entrada.next();
				}
			}
		}
		
	return notasAluno;
	}
	
	double[][] digiteNotas () {
		int qtdAluno = this.valorAluno;
		int qtdNota = informeQtdNota();
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
							break;
						}
					} else {
						System.out.println("Digite um número!");
						entrada.next();
					}
				}
			}
		}		
		return notasDaTurma;
	}
	public static void main(String[] args) {
        MatrizNota novanota = new MatrizNota();

        // Pergunta para o usuário se ele quer inserir apenas 1 aluno ou múltiplos
        int qtdAluno = novanota.informeQtdAluno();
        if (qtdAluno == 1) {
            double[] notasAluno = novanota.digiteNotas1();
            System.out.println("Notas do aluno: " + Arrays.toString(notasAluno));
        } else {
            double[][] notasTurma = novanota.digiteNotas();
            // Exibindo as notas de cada aluno
            for (int i = 0; i < notasTurma.length; i++) {
                System.out.println("Notas do aluno " + (i + 1) + ": " + Arrays.toString(notasTurma[i]));
            }
        }
    }
}
