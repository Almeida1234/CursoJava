package classe.desafio;

public class Jantar {
	
	public static void main(String[] args) {
		
		Comida comida1 = new Comida("Feijão", 0.223);
		
		Comida comida2 = new Comida();
		comida2.nomeComida = "Arroz";
		comida2.pesoComida = 0.300;
		
		Pessoa pessoa1 = new Pessoa("Ricardo", 82.0);
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.nome = "Cecilia";
		pessoa2.peso = 59.0;
		
		System.out.println("Peso da " + pessoa1.nome + " antes de comer: " + pessoa1.peso);
		System.out.println("Peso da " + pessoa2.nome + " antes de comer: " + pessoa2.peso);
		
		pessoa1.comer(comida2);
		pessoa2.comer(comida1);
		
		System.out.printf("%nPeso do %s depois de comer %s: %.3f", pessoa1.nome, comida2.nomeComida, pessoa1.peso);
		System.out.printf("\nPeso da %s depois de comer %s: %.3f", pessoa2.nome, comida1.nomeComida, pessoa2.peso);
		
		
	}

}
