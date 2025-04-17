package orientacaoObjeto.heranca;

public class Jogador {
	
	int vida = 100;
	int x;
	int y;
	
	boolean atacar(Jogador oponente) {
		
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 10;
			return true;
		} else if(deltaX == 1 && deltaY == 0) {
			oponente.vida -= 10;
			return true;
		} else {
			return false;
		}
	}
	
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
