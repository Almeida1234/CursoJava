package orientacaoObjeto.composicao.desafio;

import java.util.ArrayList;

public class Compra {
	
	ArrayList<Item> itens = new ArrayList<>();
	
	void adicionarItem(Produto produto, int qtd){
		this.itens.add(new Item(produto, qtd));
	}
	
	void adicionarItem(String nome, double preco, int qtd){
		var produto = new Produto (nome, preco);
		this.itens.add(new Item (produto, qtd));
	}
	
	int getQuantidadeTotal() {
	    int total = 0;
	    for (Item item : itens) { // Assumindo que `itens` seja a lista de produtos comprados
	        total += item.getQtd();
	    }
	    return total;
	}
	
	double obterValorTotal() {
		double total = 0;
		for(Item item: itens) {
			total += item.produto.preco * item.qtd;
		}
	
		return total;
	}
}
