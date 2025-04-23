package orientacaoObjeto.encapsulamento.casaA;

public class Paulo {
	
	// Paulo é marido de Ana, moram na mesma casa / Mesmo package
	// Paulo é sogro de Julia, não moram na mesma casa / Outro package
	// Paulo é pai de Pedro, não moram na mesma casa / Outro package
	
	void testeAcessos() { 
		Ana esposa = new Ana();
		
		// System.out.println(esposa.segredo);
		System.out.println(esposa.facoDentroDeCasa);
		System.out.println(esposa.formaDeFalar);
		System.out.println(esposa.todosSabem);
		
	}
	
}