package classe.desafio;

import java.util.Scanner;

public class Pessoa {
	
	String nomePessoa;
	double pesoPessoa;
	
	Pessoa(){
		
	}
	
	Pessoa(String nomePessoa, double pesoPessoa){
		this.nomePessoa = nomePessoa;
		this.pesoPessoa = pesoPessoa;
	}
		
	String comer(Comida comida) {
		if(comida != null) {
			this.pesoPessoa += comida.pesoComida;
		} else {
			System.out.println("Comida não pode ser nula.");
		}
		return String.format("%nPeso do %s depois de comer %s: %.3f", this.nomePessoa, comida.nomeComida, this.pesoPessoa);	
	}
	
	void retornoNovoPeso(Comida comida) {
		if(comida != null) {
			this.pesoPessoa += comida.pesoComida;
			System.out.printf("%nPeso do %s depois de comer %s: %.3f", this.nomePessoa, comida.nomeComida, this.pesoPessoa);
		} else {
			System.out.println("Comida não pode ser nula.");
		}
	}
	
	public static String lerNome(Scanner entrada, String mensagem) {
		
		while(true) {
			System.out.print(mensagem);
			String nome = entrada.nextLine();
		
			if(nome != null && !nome.trim().isEmpty()) {
				return nome;
			} else {
				System.out.println("Nome inválido. Tente novamente.");
			}
		}
	}

	
}
