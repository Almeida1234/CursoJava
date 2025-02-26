package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		//Formula de conversão de temperatura Fahrenheit em Celsius
		// (°F - 32) x 5/9 = ° C
		final int ajuste = 32;
		final double fator = 5/9.0;
		double fahrentheit = 86;
		double celsius = (fahrentheit - ajuste) * fator;

		System.out.println("A Temperatura de " + fahrentheit + " fahrenheit "
				+ "convertido em Celsius é de = " + celsius + "°C.");		
		
		fahrentheit = 150;
		celsius = (fahrentheit - ajuste) * fator;
		
		System.out.println("A Temperatura de " + fahrentheit + " fahrenheit "
				+ "convertido em Celsius é de = " + celsius + "°C.");		
	}

}
