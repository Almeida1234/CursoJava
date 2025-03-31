package classe.desafio;

public class Pessoa {
	
	String nomePessoa;
	double pesoPessoa;
	
	Pessoa(){
		
	}
	
	Pessoa(String nomePessoa){
		this.nomePessoa = nomePessoa;
	}
	
	Pessoa(String nomePessoa, double pesoPessoa){
		this.nomePessoa = nomePessoa;
		this.pesoPessoa = pesoPessoa;
	}
	public static void main(String[] args) {
		
	}
	
	double comer(Comida comida) {
		// Se a comida tem peso e tem nome da comida
		if (comida.pesoComida != 0.0 && comida.nomeComida != null) {
			pesoPessoa += comida.pesoComida;
			return pesoPessoa;
		// Se a comida tem peso e n
		}if (comida.pesoComida != 0.0 && comida.nomeComida == null) {
			pesoPessoa += comida.pesoComida;
			return pesoPessoa;
		}else {
			return pesoPessoa;  
		}
	}
	
	String comerNome(Comida comida) {
		return comida.nomeComida;
	}
	
	String apresentar(Comida comida) {
	    if(nomePessoa != null) {
	    	 // Se a pessoa tem nome, se a comida tem nome e a comida tem peso: 
	    	if(comerNome(comida) != null && comida.pesoComida != 0.0) {
	    		String pessoa = String.format("Olá, meu nome é %s, tenho atualmente %.3f KL. ", this.nomePessoa, this.pesoPessoa);
			    pessoa += String.format("Após comer %s, meu peso subiu para: %.3f KL.", this.comerNome(comida) ,this.comer(comida)); 
			    return pessoa;
			 // Se a pessoa tem nome, se a comida te nome e a comida não tem peso:
	    	}else if (comerNome(comida) != null && comida.pesoComida == 0.0) {
	    		String pessoa = String.format("Olá, meu nome é %s, tenho atualmente %.3f KL. ", this.nomePessoa, this.pesoPessoa);
			    pessoa += String.format("Eu comi %s, porém não temos o peso do alimento para somar o quanto engordou.", this.comerNome(comida)); 
			    return pessoa;
			 // Se a pessoa tem nome, se a comida não tem nome e a comida tem peso:
	    	}else if (comerNome(comida) == null && comida.pesoComida != 0.0) {
	    		String pessoa = String.format("Olá, meu nome é %s, tenho atualmente %.3f KL. ", this.nomePessoa, this.pesoPessoa);
			    pessoa += String.format("Eu comi algum alimento e engordei %.3f KL.", this.comer(comida)); 
			    return pessoa;
			 // Se a pessoa tem nome, se a comida não tem nome e a comida não tem peso:
	    	}else {
	    		String pessoa = String.format("Olá, meu nome é %s, tenho atualmente %.3f KL. ", this.nomePessoa, this.pesoPessoa);
			    pessoa += String.format("Eu não comi nada e continuo com o mesmo peso: %.3f", this.pesoPessoa); 
			    return pessoa;
	        }
	    	 // Se a pessoa não tem nome, se a comida tem nome e a comida tem peso:
	    }else {	    	
	    	if (comerNome(comida) != null && comida.pesoComida != 0.0) {
	    		String pessoa = String.format("Olá, tenho atualmente %.3f KL. ", this.pesoPessoa);
	            pessoa += String.format("Após comer %s, meu peso subiu para: %.3f KL.", this.comerNome(comida), this.comer(comida) ); 
	            return pessoa;
	         // Se a pessoa não tem nome, se a comida te nome e a comida não tem peso:
	    	} else if (comerNome(comida) != null && comida.pesoComida == 0.0) {
	        	String pessoa = String.format("Olá, tenho atualmente %.3f KL. ", this.pesoPessoa);
	            pessoa += String.format("Eu comi %s, porém não temos o peso do alimento para somar o quanto engordou.", this.comerNome(comida)); 
	            return pessoa;
	         // Se a pessoa não tem nome, se a comida não tem nome e a comida tem peso:   
	        }else if (comerNome(comida) == null && comida.pesoComida != 0.0) {
	    		String pessoa = String.format("Olá, tenho atualmente %.3f KL.", this.pesoPessoa);
			    pessoa += String.format("Eu comi algum alimento e engordei %.3f KL.", this.comer(comida)); 
			    return pessoa;
			 // Se a pessoa não tem nome, se a comida não tem nome e a comida não tem peso:
	    	}else {
	        	String pessoa = String.format("Olá, tenho atualmente %.3f KL. ", this.pesoPessoa);
	            pessoa += String.format("Eu não comi nada e continuo com o mesmo peso: %.3f", this.pesoPessoa); 
	            return pessoa;
	        }
	        
	    }
		
	}
	
}
