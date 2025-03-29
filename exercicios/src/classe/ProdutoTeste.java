package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {	
		
		Produto p1 = new Produto("Notebook", 4356.89);
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		
		var p3 = new Produto("Boracha", 9.30);
		  
		Produto.desconto = 0.29;		 
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p1.precoComDesconto(0.05);
		double precoFinal3 = p2.precoComDesconto();
		double precoFinal4 = p2.precoComDesconto(0.10);
		double precoFinal5 = p3.precoComDesconto();
		double precoFinal6 = p3.precoComDesconto(0.10);
		
		double mediaCarrinho = (precoFinal1 + precoFinal3 + precoFinal5) / 3;
		double mediaCarrinho1 = (precoFinal2 + precoFinal4 + precoFinal6) / 3;
		
		System.out.println(p1.nome + " R$" + p1.preco + " terá Desconto de " + Produto.desconto +"%"); 
		System.out.println(String.format("Preço final do notebook com desconto: R$%.2f", precoFinal1));
		System.out.println(String.format("Média de compra: R$%.2f", mediaCarrinho));
		System.out.println(String.format("Preço final do notebook com desconto, Gerente: R$%.2f", precoFinal2));
		System.out.println(String.format("Média de compra com desconto do Gerente: R$%.2f", mediaCarrinho1));
		System.out.println("\n" + p2.nome + " R$" + p2.preco + " terá Desconto de " + Produto.desconto +"%");
		System.out.println(String.format("Preço final da Caneta com desconto: R$%.2f", precoFinal3));
		System.out.println(String.format("Média de compra: R$%.2f", mediaCarrinho));
		System.out.println(String.format("Preço final da Caneta com desconto, Gerente: R$%.2f", precoFinal4));
		System.out.println(String.format("Média de compra com desconto do Gerente: R$%.2f", mediaCarrinho1));
		System.out.println("\n" + p3.nome + " R$" + p3.preco + " terá Desconto de " + Produto.desconto +"%");
		System.out.println(String.format("Preço final da %s com desconto: R$%.2f", p3.nome, precoFinal5));
		System.out.println(String.format("Média de compra: R$%.2f", mediaCarrinho));
		System.out.println(String.format("Preço final da %s com desconto, Gerente: R$%.2f", p3.nome, precoFinal6));
		System.out.println(String.format("Média de compra com desconto do Gerente: R$%.2f", mediaCarrinho1));
	}

}
