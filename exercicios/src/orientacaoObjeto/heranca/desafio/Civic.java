package orientacaoObjeto.heranca.desafio;

public class Civic extends Carro{
	
	public Civic(){
		this(250);		
	}
	
	public Civic(int velocidadeMaxima){
		super(velocidadeMaxima);
		delta = 10;
	}
	
	@Override
	public void acelerar() {
		super.acelerar();
//		delta = 10;
//		if(velocidadeAtual + delta > VELOCIDADE_MAXIMA) { 
//			velocidadeAtual = VELOCIDADE_MAXIMA;
//		} else {
//			velocidadeAtual += delta;
//		}
	}
	
	@Override
	public void frear() { 
		deltaf = 10;
		if(velocidadeAtual >= 5) {
			velocidadeAtual -= deltaf;
		}else {
			velocidadeAtual = 0;
		}
	}
		
}
