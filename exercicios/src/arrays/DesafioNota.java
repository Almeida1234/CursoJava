package arrays;

import java.util.Scanner;

public class DesafioNota {

	Scanner entrada;
	
	DesafioNota() {
        entrada = new Scanner(System.in);
    }
	
	int informeQtdNotas() {
		int qtdNotas = -1;
		while(true) {
			System.out.print("Quantas notas você quer informar?: ");
			if(entrada.hasNextInt()) {
				qtdNotas = entrada.nextInt();
				if(qtdNotas > 0) {
					break;
				} else {
					System.out.println("O número precisa ser inteiro e positivo!");
				}
			} else {
				System.out.println("Informe um número inteiro");
				entrada.next();
			}
		}
		return qtdNotas;
	}
	
	double[] digiteNotas () {
		// Solicita a quantidade de notas usando o metodo Informe notas
		int qtdNotas = informeQtdNotas(); 
		double[] notasAluno = new double[qtdNotas];
		
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
}
