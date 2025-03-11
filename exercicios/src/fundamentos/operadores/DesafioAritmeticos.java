package fundamentos.operadores;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
		
		// int a = 2+ 3 * 4;
		// O Math.pow retorna um double para trazer int tem que fazer o CAST
		// int b = (int) Math.pow(a, 3); no caso estou pegando o resultado de a e elevando a 3
		
		double num1 = Math.pow(6 * (3 + 2), 2);
		double den1 = 3 * 2;
		
		double num2 = (1 - 5) * (2 - 7);
		double den2 = 2;
		
		double superior1 = num1 / den1;
		double superior2 = Math.pow(num2 / den2, 2);
		
		double superior3 = Math.pow(superior1 - superior2, 3);
		double inferior1 = Math.pow(10, 3);
		
		double resultado = superior3 / inferior1;
		
		System.out.println("O resultado é: " + (int)resultado);
		System.out.println("O resultado é: " + resultado);
		System.out.printf("O resultado é: %d %n", (int)resultado);
		System.out.printf("O resultado é: %.1f %n", resultado);
		System.out.println(String.format("O resultado é: %d", (int)resultado));
		System.out.println(String.format("O resultado é: %.1f", resultado));
	}

}
