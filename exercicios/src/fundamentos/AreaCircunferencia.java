package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		// incluindo o o 'FINAL antes da variavel, significa que o valor não pode ser alterado ele é constante'
		final double PI = 3.14159;
		double raio = 3.4;
		
		double area = PI * raio * raio;
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Área = " + area + "m2.");
	}

}
