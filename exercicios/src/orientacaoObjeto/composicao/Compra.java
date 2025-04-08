package orientacaoObjeto.composicao;

import java.util.ArrayList;

public class Compra {
	
	String cliente;
	ArrayList<Item> itens = new ArrayList<>();
	
	// Método para adicionar item sem parâmetros
	void adicionarItem() {
		// Criando um item com valores padrão (pode ser alterado conforme necessário)
		Item adicionarItem = new Item();
		adicionarItem.nome = "Pão";  
		adicionarItem.quantidade = 1;         
		adicionarItem.preco = 10.0;
		Item adicionarItem1 = new Item();
		adicionarItem1.nome = "queijo";  
		adicionarItem1.quantidade = 5;         
		adicionarItem1.preco = 10.0;
		
		// Adicionando o item à lista
		this.adicionarItem(adicionarItem);
		this.adicionarItem(adicionarItem1);
	}
	
	// Método para adicionar item com parâmetros
	void adicionarItem(String nome, int quantidade, double preco) {
		this.adicionarItem(new Item(nome, quantidade, preco));
	}
	
	// Método para adicionar um item já criado
	void adicionarItem(Item item) {
		// Adicionando o item à lista de itens
		this.itens.add(item);
		// Associando a compra ao item
		item.compra = this;
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item: itens) {
			total += item.quantidade * item.preco;
		}
		return total;
	}

}
