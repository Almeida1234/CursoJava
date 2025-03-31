package classe.desafio;

public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.nomePessoa = "Ricardo";
		p1.pesoPessoa = 95.50;
		
		Pessoa p2 = new Pessoa("Cecilia");
		p2.pesoPessoa = 60.20;
		
		Pessoa p3 = new Pessoa("Camily", 50.30);
		
		Comida c1 = new Comida();
		c1.nomeComida = "Carne";
		c1.pesoComida = 0.90;
		
		Comida c2 = new Comida("Frango");
		c2.pesoComida = 0.50;
		
		Comida c3 = new Comida("Salada", 0.10);
		
		if (c1 != null && c1.pesoComida != 0.0) {
            // Gerando a string que será retornada
            String pessoa = String.format("Olá, meu nome é %s, tenho atualmente %.3f KL. ", p1.nomePessoa, p1.pesoPessoa);
            p1.comer(c1);  // Altera o peso da pessoa
            pessoa += String.format("Após comer %s, meu peso subiu para: %.3f KL.", c1.nomeComida, p1.pesoPessoa); 
            System.out.println(pessoa);  // Exibindo a string
        }
		 
		System.out.println(p1.apresentar(c1));
		System.out.println(p1.apresentar(c2));
		System.out.println(p2.apresentar(c2));
		System.out.println(p3.apresentar(c3));
		
		
	}

}
