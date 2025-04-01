package arrays;

import java.util.Scanner;

public class Desafio {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		int qtdNota = -1;
		
		while (true) {
			System.out.print("Quantas notas você quer informar? ");
            if (entrada.hasNextInt()) {  // Verifica se a próxima entrada é um inteiro
                qtdNota = entrada.nextInt();
                break;
            } else {
                System.out.println("Por favor, insira um número inteiro válido.");
                entrada.next();
			}
        }
			
		double[] notaAluno1 = new double[qtdNota];
		
		for(int i = 0; i < notaAluno1.length; i ++ ) {
			while(true) {
				System.out.print("Informe a " + (i + 1) + "° nota do Aluno: ");
				if (entrada.hasNextDouble()) {  // Verifica se a próxima entrada é um double
					double num = entrada.nextDouble();
					if (num < 0 || num > 10) {
	                    System.out.println("Nota inválida. A nota deve ser entre 0 e 10.");
	                }else {
						notaAluno1[i] = num;
						break;						
					}
	            } else {
	                System.out.println("Por favor, insira um número.");
	                entrada.next();
				}				
			}
		}
		
		double somaTotalNota = 0;
		for(double nota: notaAluno1) {
			somaTotalNota += nota;			
		}
		
		System.out.println("A Soma total das notas do aluno: " + somaTotalNota);
		System.out.println("Sua média fechou em: " + somaTotalNota / notaAluno1.length);
			
		entrada.close();
	}

}
