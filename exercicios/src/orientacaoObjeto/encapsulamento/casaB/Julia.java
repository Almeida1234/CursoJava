package orientacaoObjeto.encapsulamento.casaB;

import orientacaoObjeto.encapsulamento.casaA.Ana;

public class Julia {
	
	// Julia é nora de Ana, não moram na mesma casa / Outro package
	// Julia é nora de Paulo, não moram na mesma casa / Outro package
	// Julia é esposa de Pedro, moram na mesma casa / Mesmo package
	
	void testeAcessos() {
		Ana sogra = new Ana();
		
		// System.out.println(sogra.segredo);
		// System.out.println(sogra.facoDentroDeCasa);
		// System.out.println(sogra.formaDeFalar);
		System.out.println(sogra.todosSabem);
		
	}

}
