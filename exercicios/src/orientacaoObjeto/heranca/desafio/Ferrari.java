package orientacaoObjeto.heranca.desafio;

public class Ferrari extends Carro{
	
	Ferrari(){
		this(350);		
	}
	
	Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);	
		delta = 15;
		deltaf = 15;
	}	
	
//	@Override
//	void acelerar() {
//		delta = 15;
//		if(velocidadeAtual + delta > VELOCIDADE_MAXIMA) { 
//			velocidadeAtual = VELOCIDADE_MAXIMA;
//		} else {
//			velocidadeAtual += delta;
//		}
//	}
//	
	@Override
	void frear() { 
		super.frear();
//		if(velocidadeAtual >= 5) {
//			velocidadeAtual -= deltaf;
//		}else {
//			velocidadeAtual = 0;
//		}
	}
	
}
