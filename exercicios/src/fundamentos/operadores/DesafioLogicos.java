package fundamentos.operadores;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		
		boolean trabalho_ter = true;
		boolean trabalho_qui = false;
		
		boolean tv50 = trabalho_ter && trabalho_qui;
		boolean tv32 = trabalho_ter || trabalho_qui;
		boolean sorvete = trabalho_ter ^ trabalho_qui;
		
		// Operador Unário!
		boolean maisSaudavel = !sorvete;

		System.out.println("Comprou TV 50? " + tv50);
		System.out.printf("Comprou TV 50? %b %n", tv50);
		System.out.println(String.format("Comprou TV 50? %b", tv50));
		System.out.println("Comprou TV 32? " + tv32);
		System.out.println("Comprou Sorvete? " + sorvete);
		System.out.println("Mais saudável? " + maisSaudavel);
		
		System.out.println("\n");
		
		if (trabalho_ter && trabalho_qui == true) {
			System.out.println("Comprei uma TV 50 polegadas");
		} else {
			System.out.println("Não comprei uma TV 50 polegadas");
		}
		
		if (trabalho_ter ||trabalho_qui == true){
			System.out.println("Comprei uma TV 32 polegadas");
		}else {
			System.out.println("Não comprei uma TV 32 polegadas");
		}
		
		if (trabalho_ter ^ trabalho_qui == true){
			System.out.println("Comprei um sorvete");
		}else {
			System.out.println("Não comprei um sorvete");
		}
		
		if (maisSaudavel = !sorvete){
			System.out.println("Não comprei sorverte e estou mais saudável");
		}else {
			System.out.println("Comprei um sorvete e estou menos saudável");
		}
		
	}

}
