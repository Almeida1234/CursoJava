package lambdas;

public class CalculoTeste1 {

	public static void main(String[] args) {
		
		//Soma soma = new Soma();
		Calculo calculo = new Somar();
		System.out.println(calculo.executar(2, 3));
		
		calculo = new Multiplicar();
		System.out.println(calculo.executar(2, 3));
		
		//System.out.println(calculo.executar(2, 5));
		
		calculo = new Somar();
		System.out.println(calculo.executar(2, 5));
		
		//Multiplicar multiplicacao = new Multiplicar();
		Calculo multiplicacao = new Multiplicar();
		System.out.println(multiplicacao.executar(4, 5));
		
		multiplicacao = new Somar();
		System.out.println(multiplicacao.executar(4, 5));
		
		//System.out.println(multiplicacao.executar(8, 7));
		
		multiplicacao = new Multiplicar();
		System.out.println(multiplicacao.executar(8, 7));
	}
	
}
