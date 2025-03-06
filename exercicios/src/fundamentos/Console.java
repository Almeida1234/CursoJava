package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		System.out.print("Bom"); // print ele não cria quebra de linha
		System.out.print(" dia!\n\n"); 
		
		System.out.println("Bom"); // println ele quebra a linha depois de executar esse println
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d \n", 1, 2, 3, 4, 5, 6); // printf para utlizar a formatação
		System.out.printf("Salário: %.1f %n", 1234.5678);
		System.out.printf("Nome: %s %n", "João");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");		
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu sobrenome: ");		
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");		
		int idade = entrada.nextInt();
		
		System.out.print("Digite seu salário: ");		
		double salario = entrada.nextDouble();
		
		System.out.println(nome + " é um lindo nome!");
		System.out.printf("%s é um lindo nome! \n", nome);
		System.out.printf("Seu nome é: %s %s e você tem, %d anos e ganha: R$%.2f Reais \n", 
				nome, sobrenome, idade, salario);
		
		entrada.close();
		
			
	}

}
