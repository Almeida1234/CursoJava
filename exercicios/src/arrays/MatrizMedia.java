package arrays;

import java.util.Arrays;

public class MatrizMedia extends MatrizNota {
	double[] notasAluno;
	
	
	 // Método para calcular a soma das notas
	double somaTotalNotas1() {
       if (notasAluno == null) {
           // Se as notas ainda não foram inseridas, solicitamos ao usuário
           notasAluno = digiteNotas1();
       }
       double soma = 0;
       for (double somaNota : notasAluno) {
           soma += somaNota; 
       }
       return soma;
   }
	
	// Método para calcular a média final
    double mediaFinal1() {
        // Chama o método para obter a soma das notas
        double somaNotas = somaTotalNotas1();
        // Usa o atributo notasAluno para obter a quantidade de notas
        int qtdNotas = notasAluno.length;
        System.out.println("Notas do Aluno: " + Arrays.toString(notasAluno));
        System.out.println("Soma Final: " + somaTotalNotas1());
        // Calcula a média dividindo a soma das notas pela quantidade de notas
        return somaNotas / qtdNotas;
    }	
	
    public double mediaFinal() {
        double somatotal = 0; // Soma total das notas de todos os alunos
        int totalNotas = 0; // Contador total de notas

        // Loop para percorrer todos os alunos
        for (double[] notasDoAluno : digiteNotas()) {
            double somaAluno = 0; // Soma das notas de cada aluno
            // Loop para percorrer as notas de cada aluno
            for (double nota : notasDoAluno) {
                somaAluno += nota; // Somando as notas do aluno
            }
            somatotal += somaAluno; // Soma das notas de todos os alunos
            totalNotas += notasDoAluno.length; // Contabilizando o número total de notas
            System.out.println("Notas do Aluno: " + Arrays.toString(notasDoAluno) + " - Média do aluno: " + (somaAluno / notasDoAluno.length));
        }
        
        // Calculando a média final da turma (soma total das notas / número total de notas)
        return somatotal / totalNotas;
    }
}
