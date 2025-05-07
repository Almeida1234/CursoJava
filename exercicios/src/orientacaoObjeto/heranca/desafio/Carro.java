package orientacaoObjeto.heranca.desafio;

public class Carro {

	public final int VELOCIDADE_MAXIMA;
	public int velocidadeAtual;
	private int delta = 5;
	protected int deltaf = 5;
		
	public Carro(){
		VELOCIDADE_MAXIMA = 180;
	}
	
	public Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) { 
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += getDelta();
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
	
	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
}
