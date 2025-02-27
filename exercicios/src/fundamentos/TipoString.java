package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(4));// charAt para verificar a posição de cada letra
	
		String s = "Boa tarde";
		s = s.toUpperCase();
		s = "Bom dia";
		System.out.println(s + "!!!");
		System.out.println(s.concat("!!!").toUpperCase());
		System.out.println(s.startsWith("Bom"));
		System.out.println(s.toLowerCase().startsWith("bom"));
		System.out.println(s.toUpperCase().endsWith("dia"));
		System.out.println(s.length());
		System.out.println(s.equals("bom dia"));
		System.out.println(s.equalsIgnoreCase("bom dia"));
		
		var nome = "Ricardo";
		var sobrenome = "Almeida";
		var idade = 38;
		var salario = 12345.987;
		
		String maisUma_Frase = "Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalário: " + salario + "\n\n";
		System.out.printf(maisUma_Frase);
		
		System.out.printf("Nome: %s \nSobrenome: %s \nIdade: %d \nSalario R$%.2f.", nome, sobrenome, idade, salario);
		System.out.printf("\nO Sr. %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO Sr. %s %s tem %d anos e ganha R$%.2f.\n", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase Qualquer".toLowerCase().contains("qual")); // está verificando se no texto tem a palavra "Qual"
		System.out.println("Frase Qualquer".indexOf("Qual")); // informa em qual posição começa a palavra "Qual"
		System.out.println("Frase Qualquer".substring(6)); // Pede para inscrever o texto a partir do index 6
		System.out.println("Frase Qualquer".substring(6, 8)); // Pede para inscrever o texto a partir do index 6 e terminar no index 8
	}

}
