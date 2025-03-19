package controle.exercicios;

import java.util.Scanner;

public class ExercicioControle3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double nota1 = 0;
		double nota2 = 0;

		System.out.print("Digite a primeira nota: ");
		nota1 = entrada.nextDouble();
		while (nota1 > 10 || nota1 < 0){
			System.out.println("Nota inválida! A nota deve ser entre 0 e 10.");
			System.out.print("Digite a primeira nota novamente: ");
			nota1 = entrada.nextDouble();
		}

		System.out.print("Digite a segunda nota: ");
		nota2 = entrada.nextDouble();
		while (nota2 > 10 || nota2 < 0){
			System.out.println("Nota inválida! A nota deve ser entre 0 e 10.");
			System.out.print("Digite a segunda nota novamente: ");
			nota2 = entrada.nextDouble();
		}

		double media = (nota1 + nota2) / 2;

		if (media >= 7 && media <= 10){
			System.out.println("Você foi Aprovado! \nSua média fechou em: " + media);
		} else if (media >= 4 && media < 7){
			System.out.println("Você está de Recuperação! \nSua média fechou em: " + media);
		} else{
			System.out.println("Você foi Reprovado! \nSua média fechou em: " + media);
		}

				 
		double nota3 = 0; 
		double nota4 = 0;
		
		do{ 
			System.out.print("Digite a primeira nota: "); 
			nota3 =	entrada.nextDouble(); 
			if (nota3 > 10 || nota3 < 0){
				System.out.println("Nota inválida! A nota deve ser entre 0 e 10.");
				} 
		}while(nota3 > 10 || nota3 < 0);
		
		do{ 
			System.out.print("Digite a segunda nota: "); 
			nota4 =	entrada.nextDouble(); 
			if (nota4 > 10){
				System.out.println("Nota inválida! A nota deve ser entre 0 e 10."); 
				} 
		}while(nota4 > 10);
		
		double media1 = (nota3 + nota4) / 2;
		
		if(media1 >= 7 && media1 <= 10){ 
			System.out.println("Você foi Aprovado! \nSua media fechou em: " + media1); 
		} else if(media1 >= 4 && media1 < 7){
			System.out.println("Você está de Recuperação! \nSua media fechou em: " + media1);
		}else{ 
			System.out.println("Você foi Reprovado! \nSua media fechou em: " + media1);
		}
		 
		 
		entrada.close();
		  
		}

}
