package orientacaoObjeto.heranca.desafio;

public class Carro {

	int velocidadeAtual;
	
	void acelerar() {
		if(velocidadeAtual >= 0) { 
			velocidadeAtual += 5;
		}
	}
	
	void frear() {
		if(velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		}else {
			velocidadeAtual = 0;
		}
	}
	
	public String toString() {
		return "A velocidade Atual é " + velocidadeAtual + "Km/h.";
	}
}
