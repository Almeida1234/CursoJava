package classe;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // atribuição por valor (Tipo primitivo)
		
		a++;
		b--;
		
		System.out.println(a + "\n" + b);
		
		Data d1 = new Data(14, 5, 1987);
		Data d2 = d1; // atribuição por referência (Objeto)
		
		System.out.println(d1.obterDataFormatada() + "\n" + d2.obterDataFormatada());
		
		d1.dia = 31;
		d2.mes = 12;
		
		d1.ano = 2025;
		
		System.out.println(d1.obterDataFormatada() + "\n" + d2.obterDataFormatada());
		
		d2 = new Data(01, 06, 2022);
		//d1 = d2;
		
		System.out.println(d1.obterDataFormatada() + "\n" + d2.obterDataFormatada());

		voltarDataParaValorPadrao(d1);
		System.out.println(d1.obterDataFormatada() + "\n" + d2.obterDataFormatada());
	
		voltarDataParaValorPadrao(d2);
		System.out.println(d1.obterDataFormatada() + "\n" + d2.obterDataFormatada());
	
		int c = 5;
		alterarPrimitivo(c);
		
		System.out.println(c);
	
	}

	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
		
	static void alterarPrimitivo(int a) {
		a++; 
	}
}
