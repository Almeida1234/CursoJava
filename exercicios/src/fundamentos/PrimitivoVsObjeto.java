package fundamentos;

public class PrimitivoVsObjeto {
	
	public static void main(String[] args) {
	
	// As duas formas está correta para se criar um objeto!
	String s = "Texto";
	String t = new String ("Texto 2");
	s.toUpperCase();
	
	System.out.printf("%s 1 e %s %n", s, t);
		
	// Wrappers são a versão objeto dos tipos:
	// Primitivos
	int a = 123;
	System.out.println(a);
	
	}

}
