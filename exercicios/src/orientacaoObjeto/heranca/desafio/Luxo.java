package orientacaoObjeto.heranca.desafio;

public interface Luxo {
	
	public void ligarAr();
	abstract void desligarAr();
	
	default int velocidadeDoAr() {
		return 2;
	}

}
