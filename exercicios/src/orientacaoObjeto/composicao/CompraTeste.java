package orientacaoObjeto.composicao;

public class CompraTeste {
	
	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente = "Joãp Pedro";
		
		compra1.adicionarItem();
		compra1.adicionarItem("Caneta", 20, 7.45);
		compra1.adicionarItem(new Item("Borracha", 12, 3.89));
		compra1.adicionarItem(new Item("Caderno", 3, 18.79));
		
		
		System.out.println("Total de itens na compra 1 ==> " + compra1.itens.size());
		System.out.println("\nInformações do Item 1: " + compra1.itens.get(0) + ". "
				+ "Valor total do item: R$" + compra1.itens.get(0).obterValorTotal1());
        System.out.println("Informações do Item 2: " + compra1.itens.get(1) + ". "
        		+ "Valor total do item: R$" + compra1.itens.get(1).obterValorTotal1());
        System.out.println("Informações do Item 3: " + compra1.itens.get(2) + ". "
        		+ "Valor total do item: R$" + compra1.itens.get(2).obterValorTotal1());
        System.out.println("Informações do Item 4: " + compra1.itens.get(3) + ". "
        		+ "Valor total do item: R$" + compra1.itens.get(3).obterValorTotal1());
        System.out.println("Informações do Item 5: " + compra1.itens.get(4) + ". "
        		+ "Valor total do item: R$" + compra1.itens.get(4).obterValorTotal1());
        System.out.println("Valor total da Compra: R$" + compra1.obterValorTotal());
		System.out.println();
		
		// Só pra mostrar a relação bidirecional!!!
		double total = compra1.itens.get(0).compra
			.itens.get(1).compra.obterValorTotal();
		
		System.out.println("Valor total da compra: R$" + total);
	}

}
