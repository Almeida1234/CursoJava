package orientacaoObjeto.encapsulamento.casaA;

public class Ana {
	
	// Ana é esposa de Paulo, moram na mesma casa / Mesmo package.
	// Ana é sogra de Julia, não moram na mesma casa / Outro package
	// Ana é mãe de Pedro, não moram na mesma casa / Outro package
	
	@SuppressWarnings("unused")
	private String segredo = "..."; // visualizado só nesta classe
	String facoDentroDeCasa = "..."; // default ou pacote
	protected String formaDeFalar = "..."; // Transmitido por Herança
	public String todosSabem = "..."; // visualizado por todos

}
