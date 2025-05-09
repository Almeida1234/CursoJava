package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add -> adicionam elementos na fila
		
		// Diferença é o comportamento ocorre
		// quando a fila está cheia!
		fila.add("Ana"); // retorna false
		fila.offer("Bia"); // Lança uma exceção
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// Peek e Element -> obter o próximo elemento
		// da fila (sem remover)
		
		// Diferença é o comportamento ocorre
		// quando a fila está vazia!
		System.out.println(fila.peek()); // retorna false
		System.out.println();
		System.out.println(fila.peek());
		System.out.println();
		System.out.println(fila.element()); // Lança uma exceção
		System.out.println();
		System.out.println(fila.element());
		System.out.println();
		
		// Teste
		System.out.println(fila.size());
		System.out.println();
		System.out.println(fila.isEmpty());
		System.out.println();
        // System.out.println(fila.contains(fila));
        // System.out.println();

		//fila.clear();
		
		// Poll e Remove -> obter o próximo elemento
		// da fila e remove!
				
		// Diferença é o comportamento ocorre
		// quando a fila está vazia!
		System.out.println(fila.poll()); // retorna false
		System.out.println();
		System.out.println(fila.remove()); // Lança uma exceção
		System.out.println();
		System.out.println(fila.poll());
		System.out.println();
		System.out.println(fila.poll());
		System.out.println();
		System.out.println(fila.poll());
		System.out.println();
		System.out.println(fila.poll());
		System.out.println();
		System.out.println(fila.poll());
		System.out.println();
		System.out.println(fila.poll());
		System.out.println();
		System.out.println(fila.remove());
	
	}
	
}
