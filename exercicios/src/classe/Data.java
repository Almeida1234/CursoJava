package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data(){
		//dia = 01;
		//mes = 01;
		//ano = 1970;
		this(01, 01, 1970);
	}
	Data(int dia){
		this.dia = dia;
	}
	Data(int dia, int mes){
		this.dia = dia;
		this.mes = mes;
	}
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormatada() {
		final String formato = "%d/%d/%d";
		return String.format(formato, this.dia, this.mes, this.ano); 
	}
	
	//void significa que não preciso passar se é int, float, String etc..
	void imprimirDataFormatada( ) {
		//Posso usar esse ou o de baixo:
		//System.out.println(String.format("%d/%d/%d", dia, mes, ano)); 
		System.out.println(this.obterDataFormatada());
		}
	
}
