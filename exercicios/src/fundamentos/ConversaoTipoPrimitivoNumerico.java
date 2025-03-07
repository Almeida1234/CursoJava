package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a = 1; // Conversão Implícita o inteiro pode ser convertido dentro do double
		System.out.println(a);
		
		float b = (float)1.123456788888; // Conversão Explícita não cabe dentro do float (CAST)
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c; // Conversão Explícita (CAST)
		System.out.println(d);
		
		double e = 1.9999;
		int f = (int) e;
		System.out.println(f);
	}

}
