package orientacaoObjeto.heranca;

public class Jogador {
	
	int x;
	int y;
	
	boolean andar(Direcao direcao) {
		
		switch (direcao) {
		case NORTE: 
			y -= 1;
			break;
		 case SUL: 
			y += 1;
			break;
		case LESTE: 
			x += 1;
			break;
		case OESTE: 
			x -= 1;
			break;
		}
		
		return true;
		
//		if(direcao == Direcao.NORTE) {
//			y += 1;
//		} else if(direcao == Direcao.SUL) {
//			y += 2;
//		} else if(direcao == Direcao.LESTE) {
//			x += 1;
//		}else if(direcao == Direcao.OESTE) {
//			x += 2;
//		}
//		
//		return true;
	}

}
