package classe.desafio;

public class Pessoa {
	
	String nome;
	double peso;
	
	Pessoa(){
		
	}
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
		
	double comer(Comida comida) {
		this.peso += comida.pesoComida;
		return this.peso;
	}

	
}
