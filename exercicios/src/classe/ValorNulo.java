package classe;

public class ValorNulo {
	
	public static void main(String[] args) {
		
//		Data d1 = new Data(14, 5, 1987);
//		Data d2 = null; // atribuição por referência (Objeto)
//		
//		if(d2 != null) {
//			d2.dia = 31;
//			d2.mes = 12;
//			d2.ano = 2025;
//		}
//		
//		System.out.println(d1.obterDataFormatada());
//		System.out.println(d2);
//		//System.out.println(d2.obterDataFormatada()); // irá gerar erro, pois d2 é nulo e não tem referência para o método obterDataFormatada()

		String s1 = "";		
		System.out.println(s1.concat("!!!"));
		
		double numeroSorteado = Math.random();
		System.out.println("Número sorteado: " + numeroSorteado);
		
		Data d1 = numeroSorteado > 0.5 ? new Data() : null;
		//d1.mes = 3; // irá gerar erro, pois d1 é nulo e não tem referência para o atributo mes
		
		System.out.println(d1);
		
		if(d1 != null) {
			d1.dia = 31;
			d1.mes = 12;
			d1.ano = 2025;
			System.out.println(d1.obterDataFormatada());
		}
		
		String s2 = numeroSorteado > 0.5 ? "Opa" : null;
		
		System.out.println(s2);
		
		if(s2 != null) {
		s2 = "Óla";	
		System.out.println(s2.concat("???"));// ira gerar erro, pois s2 é nulo e não tem referência para o método concat()	
		}		
		
	
		
	
	}
}
