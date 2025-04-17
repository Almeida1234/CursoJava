package orientacaoObjeto.heranca.desafio;

public class Civic extends Carro{
	
	@Override
	void acelerar() {
		if(velocidadeAtual >= 0) {
			velocidadeAtual += 10;
		}
	}
	
	@Override
	void frear() { 
		if(velocidadeAtual >= 5) {
			velocidadeAtual -= 10;
		}else {
			velocidadeAtual = 0;
		}
	}
		
//	void acelerar(Carro acelerar) {
//		if(velocidadeAtual >= 0) {
//			velocidadeAtual += 10;
//		}
//	}
//	
//	void frear(Carro acelerar) {
//		if(velocidadeAtual >= 5) {
//			velocidadeAtual -= 5;
//		}else {
//			velocidadeAtual = 0;
//		}
//	}

}
