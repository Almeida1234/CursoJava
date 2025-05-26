package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {
	
		Calculo calculo = (x, y) -> {return x + y;	};
		System.out.println(calculo.executar(2, 3));
		
//		calculo = new Multiplicar();
//		System.out.println(calculo.executar(2, 3));
//				
//		calculo = new Somar();
//		System.out.println(calculo.executar(2, 5));
		
		//Multiplicar multiplicacao = new Multiplicar();
		
		calculo = (x, y) -> x * y;
		System.out.println(calculo.executar(4, 5));
		
		Calculo multiplicacao = (x, y) -> {return x * y; };
		System.out.println(multiplicacao.executar(4, 5));
		
//		multiplicacao = new Somar();
//		System.out.println(multiplicacao.executar(4, 5));
//		
//		multiplicacao = new Multiplicar();
//		System.out.println(multiplicacao.executar(8, 7));
		
	}
	
}
