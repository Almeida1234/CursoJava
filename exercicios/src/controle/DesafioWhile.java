package controle;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int quantidadeDeNotas = 0;
		double total = 0;
		double nota = 0;
				
		while(nota != -1){
			System.out.print(String.format("Digite a nota do aluno (ou -1 p/ sair): "));
			nota = entrada.nextDouble();
			
			if(nota >= 0 && nota <=10){
				quantidadeDeNotas +=1;
				total += nota; 				
			} else if(nota != -1){
				System.out.println("Nota invalida tente novamente!");
			}
		}
		double media = total / quantidadeDeNotas;
		System.out.println(String.format("O valor total de todas as notas digitadas validas "
				+ "foi de %.1f", total));
		System.out.println(String.format("Foram digitadas %d notas validas no sistema.", quantidadeDeNotas));
		System.out.println(String.format("A média dos alunos é de %.1f", media));
		
		entrada.close();
		
	}

}
