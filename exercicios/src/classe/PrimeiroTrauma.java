package classe;

public class PrimeiroTrauma {
	
	int a = 3; // não pode mexer aqui!
	static int b = 4;

	public static void main(String[] args) {
		
		PrimeiroTrauma p = new PrimeiroTrauma();
		System.out.println(p.a);
	    System.out.println(b);
		
		p.a = p.testandoMetodo(); 
		System.out.println(p.a);
		b = p.testandoMetodo1();
		System.out.println(b);
		
	}
	
	int testandoMetodo() {
		return a;
	}
	
	int testandoMetodo1() {
		int b = 6;
		return b;
	}
	
}
