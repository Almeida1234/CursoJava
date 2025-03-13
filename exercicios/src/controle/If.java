package controle;

import java.util.Locale;
import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		// Ler num1
		// Ler num2
		// + - * / %
		
		System.out.println("Calculadora para Adição, Subtração, Multiplicação, Divisão e resto da divisão \n");
		Scanner entrada = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite o primeiro número: ");
		String imput1 = entrada.nextLine().replace(",", ".");
		double num1 = Double.parseDouble(imput1);
		
		System.out.print("Digite o segundo número: ");
		String imput2 = entrada.nextLine().replace(",", ".");
		double num2 = Double.parseDouble(imput2);
		
		System.out.print("Digite a operação: +, -, *, /, % ");
		String operador = entrada.next();
		
		// Logica
		double resultado = "+".equals(operador) ? num1 + num2 : 0;
		resultado = "-".equals(operador) ? num1 - num2 : resultado;
		resultado = "*".equals(operador) ? num1 * num2 : resultado;
		resultado = "/".equals(operador) ? num1 / num2 : resultado;
		resultado = "%".equals(operador) ? num1 % num2 : resultado;
		
		System.out.println(num1 + " " + operador + " " + num2 + " = " + resultado);
		System.out.println(String.format("%.1f %s %.1f = %.1f", num1, operador, num2, resultado));
		System.out.printf("%.1f %s %.1f = %.1f %n", num1, operador, num2, resultado);
		
		// Transformando tudo em inteiro
		System.out.println((int)num1 + " " + operador + " " + (int)num2 + " = " + (int)resultado);
		System.out.println(String.format("%d %s %d = %d", (int)num1, operador, (int)num2, (int)resultado));
		System.out.printf("%d %s %d = %d %n", (int)num1, operador, (int)num2, (int)resultado);
				
		entrada.close();
		
	}

}
