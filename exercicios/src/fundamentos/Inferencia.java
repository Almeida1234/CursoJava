package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		double a = 4.5; // declaração e inicialização
		System.out.println(a);
		
		// Quando eu defino na Variavel o valor "var" ele identifica se é int, flout ou string
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		c = "Outro texto";
		System.out.println(c);
		
		double d; // variavel foi declarada
		d = 123.65; // variavel foi inicializada
		System.out.println(d);
		
		/*
		var e; // quando a variavel é var, vc precisa já iniciala
		e = 123.45;
		*/
	}

}
