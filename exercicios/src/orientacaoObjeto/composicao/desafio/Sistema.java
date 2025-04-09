package orientacaoObjeto.composicao.desafio;

public class Sistema {
	
	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 1.00, 100);
		compra1.adicionarItem(new Produto("Notebook", 2000.00), 2);

		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 10.00, 10);
		compra2.adicionarItem(new Produto("Impressora", 1000.00), 1);
		
		Compra compra3 = new Compra();
		compra3.adicionarItem("Carro", 60000.00, 1);
		compra3.adicionarItem(new Produto("Casa", 1000000.00), 1);
		compra3.adicionarItem(new Produto("Sofá", 2500.00), 1);
		
		Cliente cliente = new Cliente("Ricardo Almeida");
		cliente.adicionarCompra(compra1);
		cliente.compras.add(compra2);
		
		Cliente cliente1 = new Cliente("Cecilia Novaes");
		cliente1.adicionarCompra(compra1);
		cliente1.compras.add(compra3);
		
		System.out.println(String.format("O valor da compra do %s foi de R$%.2f"
				, cliente.nome, cliente.valorTotal()));
		System.out.println(String.format("Ele comprou um total de: %d itens"
				, cliente.getTotalDeItens()));
		
		System.out.println();
		
		System.out.println(String.format("O valor da compra da %s foi de R$%.2f"
				, cliente1.nome, cliente1.valorTotal()));
		System.out.println(String.format("Ela comprou um total de: %d itens"
				, cliente1.getTotalDeItens()));
		}

}
