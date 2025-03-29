package classe;

public class AreaCirc {

	double raio;
	//final static double pi = 3.14;
	static final double PI = Math.PI;
	
	AreaCirc() {
		
	}
	
	AreaCirc(double raio) {
		this.raio = raio;
	}
	
	double area() {
		return PI * Math.pow(raio, 2); // mesma coisa de: (pi * raio * raio)
	}
	
	static double area(double raio) {
		return PI * Math.pow(raio, 2); // mesma coisa de: (pi * raio * raio)
	}
	
}
