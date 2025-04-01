package arrays;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		
		double notaArmazenada1 = 5.9; 
		double[] notasAlunoA = new double[4];
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = notaArmazenada1;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[0]);
		System.out.println(notasAlunoA[notasAlunoA.length -1]); // buscar a ultima nota
		
		double total = 0;
		// FOReach
		for(double notas : notasAlunoA) {
			total += notas;
			System.out.println(notas);
		}		
		/* for da forma normar
		 * for(int i = 0; i < notasAlunoA.length ; i ++ ) { 
		 * total += notasAlunoA[i];
		 * System.out.println(notasAlunoA[i]); }
		 */
		System.out.println(total);
		System.out.printf("\nA média é %.1f",total / 4);
		
		//converti para um int
		int total1 = (int) total; 
		System.out.printf("\nA média é %d",total1 / 4);
		//converti para um double
		double total2 = (double) total1;
		System.out.printf("\nA média é %.1f\n\n",total2 / notasAlunoA.length); // melhor forma de percorrer o array
	
		double notaArmazenada = 5.9;
		//Outra forma de criar um ARRAY, porém não é muito utilizado!
		double[] notasAlunoB = {7.5, 7.8, notaArmazenada, 10};
		System.out.println(Arrays.toString(notasAlunoB));
		
		double total3 = 0;
		int j = 0;
		while(j < notasAlunoB.length) {
			total3 += notasAlunoB[j];
			System.out.println(notasAlunoB[j]);
			j += 1;  
		}
		System.out.println(total3);
		System.out.printf("\nA média é %.1f",total3 / 4);
		
		//converti para um int
		int total4 = (int) total3; 
		System.out.printf("\nA média é %d",total4 / 4);
		//converti para um double
		double total5 = (double) total4;
		System.out.printf("\nA média é %.1f",total5 / notasAlunoB.length); // melhor forma de percorrer o array
	
	}

}
