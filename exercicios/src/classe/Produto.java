package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto() {
		
	}
	
	Produto(String nome) {
		this.nome = nome;
		
	}
	
	Produto(String nome, double preco) { 
		this.nome = nome;
		this.preco = preco;
		//desconto = descontoInicial;
	}
	
	double precoComDesconto() { 
		return this.preco * (1 - desconto); 
	}
	
	double precoComDesconto(double descontoDoGerente) {
		return this.preco * (1 - (desconto + descontoDoGerente)); 
		
	}

}
