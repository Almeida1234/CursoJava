package controle;

public class For1 {
	
	public static void main(String[] args) {
		
		/*
		 * int contador = 0;
		 * 
		 * while(contador <= 10) { 
		 * System.out.println(String.format("i = %d", contador)); 
		 * 
		 * contador += 1; }
		 */
	
		for(int contador = 0; contador <= 10; contador += 1){
			System.out.println(String.format("i = %d \n", contador));			
		}
		
		// Laço Infinito!!!
		//for(;;) {
		//System.out.println("Fim!!!");
		//}
	}

}
