package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		//double a = 2.3;
		String s = "Bom dia X";
		s = s.replace("X", "Senhor ");
		s = s.toUpperCase();
		s = s.concat("Ricardo!").toUpperCase();
		//System.out.println(s.toUpperCase());
		System.out.println(s);
		
		System.out.println("Rick".toUpperCase());
		
		String x = "Ricardinho".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "Ceci")
				.toUpperCase()
				.concat("!");
			
		System.out.println(y);
		
		// Tipos primitivos não tem o operador " . "
		
		int b = 3;
		System.out.println(b);
	}
	

}
