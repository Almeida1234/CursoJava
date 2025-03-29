package classe;

import java.util.Scanner;

public class AreaCircTeste {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		AreaCirc a1 = new AreaCirc(10);
		a1.raio = 3.5;
		
		AreaCirc a2 = new AreaCirc(5);
		
		//AreaCirc.pi = 3.1415;
					
		double calculoArea = a1.area();
		double calculoArea1 = a2.area();
		double calculoArea2 = AreaCirc.area(10);
		
		System.out.println(String.format("o Valor da área: %.2f feito o "
				+ "Calculo da circunferencia é: %.2f", a1.raio, calculoArea));
		
		System.out.println(String.format("o Valor da área: %.2f feito o "
				+ "Calculo da circunferencia é: %.2f", a2.raio, calculoArea1));
		
		System.out.println(String.format("o Valor da área: feito o "
				+ "Calculo da circunferencia é: %.2f ", AreaCirc.area(20)));
		
		System.out.println(String.format("o Valor da área: feito o "
				+ "Calculo da circunferencia é: %.2f ", calculoArea2));
		
		
		entrada.close();
	}

}
