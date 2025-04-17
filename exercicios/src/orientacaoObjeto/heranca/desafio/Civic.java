package orientacaoObjeto.heranca.desafio;

public class Civic extends Carro{
	
	Civic(){
		this(250);		
	}
	
	Civic(int velocidadeMaxima){
		super(velocidadeMaxima);
		delta = 10;
	}
	
	@Override
	void acelerar() {
		super.acelerar();
//		delta = 10;
//		if(velocidadeAtual + delta > VELOCIDADE_MAXIMA) { 
//			velocidadeAtual = VELOCIDADE_MAXIMA;
//		} else {
//			velocidadeAtual += delta;
//		}
	}
	
	@Override
	void frear() { 
		deltaf = 10;
		if(velocidadeAtual >= 5) {
			velocidadeAtual -= deltaf;
		}else {
			velocidadeAtual = 0;
		}
	}
		
}
