package orientacaoObjeto.heranca.desafio;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Carro city = new Carro(10);
		city.acelerar();
		city.acelerar();
		city.acelerar();
		city.frear();
		System.out.println("O City está a: " + city.velocidadeAtual + "km por hora.");
		System.out.println(city);

		System.out.println();
		
		Ferrari ferrari = new Ferrari();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.frear();
		System.out.println("A Ferrari está a: " + ferrari.velocidadeAtual + "km por hora.");
		System.out.println(ferrari); 
		
		System.out.println();
		
		Civic civic = new Civic();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();	
		civic.acelerar();
		civic.frear();
		civic.frear();
		System.out.println("O Civic está a: " + civic.velocidadeAtual + "km por hora.");
		System.out.println(civic);
	}

}
