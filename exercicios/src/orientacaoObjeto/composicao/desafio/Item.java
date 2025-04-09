package orientacaoObjeto.composicao.desafio;

public class Item {
	
	Produto produto;
	int qtd;
	
	Item(Produto produto, int qtd){
		this.produto = produto;
		this.qtd = qtd;
	}
	
	Produto getProduto() {
        return produto;
    }

    int getQtd() {
        return qtd;
    }
		
}
