package fundamentos.operadores;

public class Ternario {
	
	public static void main(String[] args) {
		
		double media = 7.6;
		String resultadoParcial = media >= 5.0 ?
				"recuperação." : "reprovado.";
		String resultadoFinal = media >= 7.0 ? 
				"aprovado." : resultadoParcial;
		System.out.println("O aluno está " + resultadoFinal);
		
		boolean bomComportamento = true;
		boolean passouPorMedia = media >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "Não.";
		
		System.out.printf("Tem desconto? %s", resultado);
		/*
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "Não.";
				
		System.out.printf("Tem desconto? %s", resultado);
		*/
	}

}
