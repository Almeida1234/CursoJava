package orientacaoObjeto.composicao;

public class Item {
	
	String nome;
	int quantidade;
	double preco;
	Compra compra;
	
	Item(){
		
	}
	
	Item(String nome, int quantidade, double preco){
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	public double obterValorTotal1() {
        return quantidade * preco;
    }
	
	 public String toString() {
	        return nome + " (R$" + preco + " x " + quantidade + ")";
	 }

}
