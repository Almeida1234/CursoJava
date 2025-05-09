package orientacaoObjeto.polimorfismo;

public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(99.65);
		
		Arroz igrediente1 = new Arroz(0.2);
		Feijao igrediente2 = new Feijao(0.1);
		Comida igrediente3 = new Arroz(0.3);
		
		System.out.println(convidado.getPeso());
		
		convidado.Comer(igrediente1);
		convidado.Comer(igrediente2);
		convidado.Comer(igrediente3);
	
		System.out.println(convidado.getPeso());
	
		Sorvete sobremesa = new Sorvete(0.4);
		convidado.Comer(sobremesa);
		
		System.out.println(convidado.getPeso());

	}

}
