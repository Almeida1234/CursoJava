package orientacaoObjeto.composicao.desafio;

import java.util.ArrayList;

public class Cliente {
	
	String nome;
	
	ArrayList<Compra> compras = new ArrayList<>();
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}
	
	int getTotalDeItens() {
	    int total = 0;
	    for (Compra compra : compras) {
	        total += compra.getQuantidadeTotal();
	    }
	    return total;
	}
	
	double valorTotal() {
		double total = 0;
		for(Compra compra: compras)
			total += compra.obterValorTotal();
		
		return total;
	}
}
