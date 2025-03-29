package classe;

public class ValorNulo {

	public static void main(String[] args) {
		
		String s1 = "";
		System.out.println(s1.concat("!!!"));
		
		double d2 = Math.random();
		System.out.println(d2);
		Data d1 = d2 > 0.5 ? new Data(14,05,1987) : null;
		
		if(d1 != null) {
			//d1.mes = 3;
			System.out.println(d1.obterDataFormatada());
		}
		
		double d3 = Math.random();
		System.out.println(d3);
		String s2 = d3 > 0.5 ? "Opa" : null;;
	
		if(s2 != null) {
			System.out.println(s2.concat("???"));
		} 
		
	}
}
