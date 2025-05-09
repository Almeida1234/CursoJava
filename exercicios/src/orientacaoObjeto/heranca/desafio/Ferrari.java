package orientacaoObjeto.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{
	
	private boolean ligarTurbo = false;
	private boolean ligarAr = false;
	
	public Ferrari(){
		this(350);		
	}
	
	public Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);	
		deltaf = 15;
	}
	
	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}
	
	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}
	
	@Override
	public void ligarAr() {
		ligarAr = true;
	}
	
	@Override
	public void desligarAr() {
		ligarAr = false;
	}
	
	@Override
	public int getDelta() {
		if(ligarTurbo && !ligarAr) {
			return 35;
		} else if(ligarTurbo && ligarAr) {
			return 30;
		} else if(!ligarTurbo && !ligarAr) {
			return 20;
		} else {
			return 15;			
		}
	}
	
//	@Override
//	public void acelerar() {
//		delta = 15;
//		if(velocidadeAtual + delta > VELOCIDADE_MAXIMA) { 
//			velocidadeAtual = VELOCIDADE_MAXIMA;
//		} else {
//			velocidadeAtual += delta;
//		}
//	}
	
	@Override
	public void frear() { 
		super.frear();
//		if(velocidadeAtual >= 5) {
//			velocidadeAtual -= deltaf;
//		}else {
//			velocidadeAtual = 0;
//		}
	}
	
}
