package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o Primeiro Sálario: ");
		String salario_1 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite o Segundo Sálario: ");
		String salario_2 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite o Terceiro Sálario: ");
		String salario_3 = entrada.nextLine().replace(",", ".");
		
		double conv_sal_1 = Double.parseDouble(salario_1);
		double conv_sal_2 = Double.parseDouble(salario_2);
		double conv_sal_3 = Double.parseDouble(salario_3);
		
		System.out.println(conv_sal_1);
		System.out.println(conv_sal_2);
		System.out.println(conv_sal_3);
		
		double media = (conv_sal_1 + conv_sal_2 + conv_sal_3) / 3;
		System.out.println("A média do sálario é: R$" + media);
				
		entrada.close();
	}

}
