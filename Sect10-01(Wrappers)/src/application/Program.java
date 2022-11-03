package application;


import java.util.ArrayList;

public class Program {
	
	@SuppressWarnings(value = { "unused" })
	public static void main(String[] args) {
		
		// Tipos primitivos
		boolean boolP;
		char charP;
		String stringP; // String não possui um tipo primitivo
		byte byteP;
		short shortP;
		int intP;
		long longP;
		float floatP;
		double doubleP;
		
		// Wrapper Classes
		Boolean booleanValue;
		Character characterValue;
		String string;
		Byte byteNumber;
		Short shortNumber;
		Integer integerNumber;
		Long longNumber;
		Float floatNumber;
		Double doubleNumber;
		
		/**
		 * As classes "Wrapper", são basicamente as classes dos tipos
		 * primitivos. Podemos usa-las normalmente, da mesma forma
		 * que usamos os tipos primitivos, e como passamos a definir
		 * os tipos por suas classes, eles passam a ser tratados como
		 * objetos, o que por usa vez pode ser uma vantagem, pois aceitam
		 * valores nulos, diferente dos tipos primitivos.
		 */
		
		/**
		 * Em alguns casos, somos obrigados a usar wrapper, pois algumas
		 * definições não permitem que o tipo primitivo seja usado 
		 * diretamente. Um exemplo comum são as 'ArrayList', pois ao 
		 * cria-las, só podemos definir a lista com a classe wrapper, 
		 * pois a lista aceita somente objetos.
		 */
		
//		ArrayList<int> myNumbers2 = new ArrayList<int>();	// Forma errada
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();	// Forma correta
		
	}

}
