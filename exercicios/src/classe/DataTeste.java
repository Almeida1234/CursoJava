package classe;

import java.util.Scanner;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Data d1 = new Data();
		d1.dia = 14;
		d1.mes = 05;
		d1.ano = 1987;
		
		var d2 = new Data(29);
		d2.mes = 11; 
		d2.ano = 1988;
		
		Data d3 = new Data(12, 06);
		d3.ano = 2009;
		
		System.out.print("Digite sua data de nascimento: ");
		Data d4 = new Data(entrada.nextInt(),entrada.nextInt(),entrada.nextInt());
		
		Data d5 = new Data();
		//d5.dia = 14; 
		//d5.mes = 05; 
		//d5.ano = 1987;
			
		
		String diaNascimento = d2.obterDataFormatada();
		
		System.out.println(String.format("Eu nasci no dia %d/%d/%d", d1.dia, d1.mes, d1.ano));
		System.out.println(String.format("Eu nasci no dia %s", d1.obterDataFormatada()));
		System.out.print("Eu nasci no dia \n");
		d1.imprimirDataFormatada();
		System.out.println(String.format("Minha esposa nasceu no dia %d/%d/%d", d2.dia, d2.mes, d2.ano));
		System.out.println(String.format("Minha esposa nasceu no dia %s", diaNascimento));
		System.out.println("Minha esposa nasceu no dia ");
		d2.imprimirDataFormatada();
		System.out.println(String.format("Meu filho nasceu no dia %d/%d/%d", d3.dia, d3.mes, d3.ano));
		System.out.println(String.format("Meu filho nasceu no dia %s", d3.obterDataFormatada()));
		System.out.println("Meu filho nasceu no dia ");
		d3.imprimirDataFormatada();
		System.out.println(String.format("Minha filha nasceu no dia %d/%d/%d", d4.dia, d4.mes, d4.ano));
		System.out.println(String.format("Minha filha nasceu no dia %s", d4.obterDataFormatada()));
		System.out.println("Minha filha nasceu no dia ");
		d4.imprimirDataFormatada();
		
		System.out.print("\nDia Padrão do Sistema: ");
		d5.imprimirDataFormatada();
	
	entrada.close();
	}

}
