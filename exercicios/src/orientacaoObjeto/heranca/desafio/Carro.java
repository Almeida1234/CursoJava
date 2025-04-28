package orientacaoObjeto.heranca.desafio;

public class Carro {

	final int VELOCIDADE_MAXIMA;
	public int velocidadeAtual;
	public int delta = 5;
	public int deltaf = 5;
		
	public Carro(){
		VELOCIDADE_MAXIMA = 180;
	}
	
	public Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		if(velocidadeAtual + delta > VELOCIDADE_MAXIMA) { 
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += delta;
		}
	}
	
	public void frear() {
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
