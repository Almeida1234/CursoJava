package controle.exercicios;

import java.util.Random;
import java.util.Scanner;

public class ExercicioControle5 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int numeroSorteado = 0;
		int tentativas = 0;
		int numero = 0;
		int continuar = 1;
		
		while(continuar != 0) {			
			Random numeroAleatorio = new Random();
			numeroSorteado = numeroAleatorio.nextInt(1011);
			//System.out.println(numeroSorteado);
			tentativas = 0;
			
			System.out.println("Começar jogo, tente adivinhar o número de 0 á 100 em até 10 tentativas!\n");
			
			while(tentativas != 10) {
				System.out.print("Digite um número: ");
				numero = entrada.nextInt();
				tentativas += 1;
				
				if(numero == numeroSorteado) {
					System.out.println("Parabéns vc acertou o numero sorteado que é: " + numeroSorteado);
					System.out.println("Foram " + tentativas + " Tentativas.\n");
					break;
				}else if(numero > numeroSorteado) {
					System.out.println("O numero sorteado é menor " + tentativas + "° Tentativas");
				}else {
					System.out.println("O numero sorteado é maior " + tentativas + "° Tentativas");
				}
				if(tentativas == 10) {
					System.out.println("\nPERDEU vc já teve as " + tentativas + "\n\n");
				}
			}
		
			System.out.print("Digite [0] para sair, ou qualquer outro numero para continuar: \n");
			continuar = entrada.nextInt();
		
		}
		
		entrada.close();
	}

}
