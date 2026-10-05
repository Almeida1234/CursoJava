package arrays;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];
		System.out.println(Arrays.toString(notasAlunoA)); // imprime o conteúdo do array
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 10;
		
		System.out.println(Arrays.toString(notasAlunoA)); // imprime o conteúdo do array
		System.out.println(notasAlunoA); // imprime o endereço de memória do array
		System.out.println("Notas do aluno A: " + notasAlunoA[0] + ", " + notasAlunoA[1] + ", " + notasAlunoA[2] + ", " + notasAlunoA[3]);
		System.out.println("\nPrimeira nota do aluno A: " + notasAlunoA[0]);
		System.out.println("Ultima nota do aluno A: " + notasAlunoA[notasAlunoA.length - 1] + "\n"); // length retorna o tamanho do array, no caso 4, e subtraindo 1 retorna o índice da última posição do array
		
		// percorrendo o array com for o length faz com que o for percorra o array até o final, independente do tamanho do array
		double totalA = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			System.out.println("Nota " + (i + 1) + ": " + notasAlunoA[i]);
			totalA += notasAlunoA[i];
		}		
		System.out.printf("A média final do aluno é: %.1f\n", totalA / notasAlunoA.length);
		
		
		final double notaArmazenada = 5.9; // constante, não pode ser alterada
		// outra forma de declarar um array, sem precisar informar o tamanho do array
		double[] notasAlunoB = { 6.9, 8.9, notaArmazenada, 10 };
		System.out.println("\nNotas do aluno B: " + Arrays.toString(notasAlunoB));
		
		double totalB = 0;
		for (int j = 0; j < notasAlunoB.length; j++) {
			System.out.println("Nota " + (j + 1) + ": " + notasAlunoB[j]);
			totalB += notasAlunoB[j];
		}		
		System.out.printf("A média final do aluno é: %.1f", totalB / notasAlunoB.length);
		
		
		
	}

}
