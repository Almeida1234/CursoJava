package orientacaoObjeto.heranca.teste;

import orientacaoObjeto.heranca.Direcao;
import orientacaoObjeto.heranca.Heroi;
import orientacaoObjeto.heranca.Monstro;

public class Jogo {
	
	public static void main(String[] args) {
		
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;
		monstro.andar(Direcao.NORTE);
		monstro.andar(Direcao.SUL);
		monstro.andar(Direcao.LESTE);
		monstro.andar(Direcao.OESTE);
		
		Heroi heroi = new Heroi(10, 11);
//		heroi.x = 10;
//		heroi.y = 11;
		heroi.andar(Direcao.NORTE);
		heroi.andar(Direcao.SUL);
		heroi.andar(Direcao.LESTE);
		heroi.andar(Direcao.OESTE);
		
		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println(monstro.x);
		System.out.println(monstro.y);
		
		System.out.println();
		
		
		System.out.println("Heroi tem => " + heroi.vida);
		System.out.println(heroi.x);
		System.out.println(heroi.y);
		
		System.out.println();
		
		monstro.atacar(heroi);
		monstro.atacar(heroi);
		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println("Heroi tem => " + heroi.vida);
		
		System.out.println();
		
		heroi.atacar(monstro);
		
		//monstro.andar(Direcao.NORTE);
		
		heroi.atacar(monstro);
		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println("Heroi tem => " + heroi.vida);
		
	}

}
