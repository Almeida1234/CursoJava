package arrays;

public class MatrizFinal {
	public static void main(String[] args) {
		MatrizMedia teste = new MatrizMedia();
		int qtdAluno = teste.informeQtdAluno();
        if (qtdAluno == 1) {
            double notasAluno = teste.mediaFinal1();
            System.out.printf("Media Final do aluno: %.2f", notasAluno);
        } else if (qtdAluno > 1) {
            double notasAluno1 = teste.mediaFinal();
            System.out.printf("Media Final da turma: %.2f", notasAluno1);
        } else {
        	System.out.printf("O número precisa ser positivo!");
        }
	}
}
