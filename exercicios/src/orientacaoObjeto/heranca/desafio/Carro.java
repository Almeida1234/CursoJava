package orientacaoObjeto.heranca.desafio;

public class Carro {

	final int VELOCIDADE_MAXIMA;
	int velocidadeAtual;
	int delta = 5;
	int deltaf = 5;
		
	Carro(){
		VELOCIDADE_MAXIMA = 180;
	}
	
	Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	void acelerar() {
		if(velocidadeAtual + delta > VELOCIDADE_MAXIMA) { 
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += delta;
		}
	}
	
	void frear() {
		if(velocidadeAtual >= 5) {
			velocidadeAtual -= deltaf;
		}else {
			velocidadeAtual = 0;
		}
	}
	
	public String toString() {
		return "A velocidade Atual é " + velocidadeAtual + "Km/h.";
	}
}
