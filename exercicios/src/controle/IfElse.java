package controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {

		String valor = JOptionPane.showInputDialog("Informe o número: ");
		int numero = Integer.parseInt(valor);
		System.out.println("O número: " + numero);

		/*
		 * if(numero % 2 == 0) { System.out.println("É um número par!"); }
		 * 
		 * if(numero % 2 == 1) { System.out.println("É um numero ímpar"); }
		 */

		if (numero % 2 == 0) {
			System.out.println("É um número par!");
		} else {
			System.out.println("É um numero ímpar");
		}
		
	}
}
