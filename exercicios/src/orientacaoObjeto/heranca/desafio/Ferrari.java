package orientacaoObjeto.heranca.desafio;

public class Ferrari extends Carro{
	
	@Override
	void acelerar() {
		if(velocidadeAtual >= 0) {
			velocidadeAtual += 15;
		}
	}
	
	@Override
	void frear() { 
		if(velocidadeAtual >= 5) {
			velocidadeAtual -= 15;
		}else {
			velocidadeAtual = 0;
		}
	}
	
//	void acelerar(Carro acelerar) {
//		if(velocidadeAtual >= 0) {
//			velocidadeAtual += 15;
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
