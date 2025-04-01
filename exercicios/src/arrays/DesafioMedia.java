package arrays;

public class DesafioMedia extends DesafioNota  {
	double[] notasAluno;
	
	
	 // Método para calcular a soma das notas
	double somaTotalNotas() {
        if (notasAluno == null) {
            // Se as notas ainda não foram inseridas, solicitamos ao usuário
            notasAluno = digiteNotas();
        }
        double soma = 0;
        for (double somaNota : notasAluno) {
            soma += somaNota; 
        }
        return soma;
    }

    // Método para calcular a média final
    double mediaFinal() {
        // Chama o método para obter a soma das notas
        double somaNotas = somaTotalNotas();
        // Usa o atributo notasAluno para obter a quantidade de notas
        int qtdNotas = notasAluno.length;

        // Calcula a média dividindo a soma das notas pela quantidade de notas
        return somaNotas / qtdNotas;
    }
}
