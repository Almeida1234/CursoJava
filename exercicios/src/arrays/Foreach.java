package arrays;

public class Foreach {
	
	public static void main(String[] args) {
		
		// percorrendo o array com foreach
		double[] notasAlunoA = { 7.9, 8, 6.7, 10 };
		double totalA = 0;
		for (double nota : notasAlunoA) { // para cada nota no array notasAlunoA
			System.out.println("Nota: " + nota);
			totalA += nota;
		}		
		System.out.printf("A média final do aluno é: %.1f\n\n", totalA / notasAlunoA.length);
		
		// percorrendo o array sem foreach
		double[] notasAlunoB = new double[4];
		notasAlunoB[0] = 6.9;
		notasAlunoB[1] = 8.9;
		notasAlunoB[2] = 5.9;
		notasAlunoB[3] = 10;
		double totalB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) { 
			System.out.println("Nota: " + notasAlunoB[i]);
			totalB += notasAlunoB[i];
		}
		System.out.printf("A média final do aluno é: %.1f\n", totalB / notasAlunoB.length);
		
		
	}

}
