package orientacaoObjeto.encapsulamento.casaB;

import orientacaoObjeto.encapsulamento.casaA.Ana;

public class Pedro extends Ana { 
	
	// Pedro é filho de Ana, não moram na mesma casa / Outro package
	// Pedro é filho de Paulo, não moram na mesma casa / Outro package
	// Pedro é marido de Julia, moram na mesma casa / Mesmo package

	void testeAcessos() {
		
		// System.out.println(segredo);
		// System.out.println(facoDentroDeCasa);
		System.out.println(formaDeFalar);
		System.out.println(todosSabem);
		System.out.println(new Ana().todosSabem);
		
		
	}
	
}
