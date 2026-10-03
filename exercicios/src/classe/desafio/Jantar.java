package classe.desafio;

import java.util.Scanner;

public class Jantar {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nomePessoa = Pessoa.lerNome(entrada, "Digite o nome da primeira pessoa: ");
		pessoa1.pesoPessoa = lerPeso(entrada, "Digite o peso da primeira pessoa: ");
		
		String nomepessoa2 = Pessoa.lerNome(entrada, "Digite o nome da segunda pessoa: ");
		double pesopessoa2 = lerPeso(entrada, "Digite o peso da segunda pessoa: ");
		Pessoa pessoa2 = new Pessoa(nomepessoa2, pesopessoa2);
		
		
		Comida comida1 = new Comida();
		comida1.nomeComida = Pessoa.lerNome(entrada, "Digite o nome da primeira comida: ");
		comida1.pesoComida = lerPeso(entrada, "Digite o peso da primeira comida: ");
		
		String nomecomida2 = Pessoa.lerNome(entrada, "Digite o nome da segunda comida: ");
		double pesocomida2 = lerPeso(entrada, "Digite o peso da segunda comida: ");
		Comida comida2 = new Comida(nomecomida2, pesocomida2);
		
		System.out.printf("%nPeso do %s antes de comer: %.3f", pessoa1.nomePessoa, pessoa1.pesoPessoa);
		System.out.printf("%nPeso do %s antes de comer: %.3f", pessoa2.nomePessoa, pessoa2.pesoPessoa);
		
		pessoa1.retornoNovoPeso(comida1);
		pessoa2.comer(comida2);
		
		System.out.printf("%nPeso do %s depois de comer %s: %.3f", pessoa1.nomePessoa, comida1.nomeComida, pessoa1.pesoPessoa);
		System.out.printf("%nPeso do %s depois de comer %s: %.3f", pessoa2.nomePessoa, comida2.nomeComida, pessoa2.pesoPessoa);
			
		entrada.close();
	}
	
	
	
	private static double lerPeso(Scanner entrada, String mensagem) {
		
		while(true) {
			System.out.print(mensagem);
			String valor = entrada.nextLine().trim();
			
			valor = valor.replace(",", "."); // Substitui vírgula por ponto para permitir entrada de números decimais
			
			try {
				double peso = Double.parseDouble(valor);
				if(peso > 0) {
					return peso;
				} else {
					System.out.println("Peso deve ser maior que zero. Tente novamente.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Entrada inválida. Por favor, insira um número válido.");
			}
		}
	}

}
