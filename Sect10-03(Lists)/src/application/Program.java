package application;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		// Adiciona um elemento no fim da fila
		System.out.println("==============");
		list.add("Fio");
		list.add("Ellie");
		list.add("Clark");
		list.add("Ralf");
		list.add("Leona");
		list.add("Angel");
		list.add("Joe");
		for (String obj : list) {
			System.out.println(obj);
		}
		
		// Adiciona um elemento na posição indicada
		System.out.println("==============");
		list.add(2, "Marco");
		list.add(3, "Terma");
		for (String obj : list) {
			System.out.println(obj);
		}
		
		// Checa o tamanho atual da lista
		System.out.println("==============");
		System.out.println(list.size());
		for (String obj : list) {
			System.out.println(obj);
		}
		
		// Remove um valor da lista através do valor
		System.out.println("==============");
		list.remove("Clark");
		for (String obj : list) {
			System.out.println(obj);
		}
		
		// Remove um valor da lista através da posição
		System.out.println("==============");
		list.remove(0);
		for (String obj : list) {
			System.out.println(obj);
		}
		
		// Remove um valor da lista através de um predicado (lambda)
		System.out.println("==============");
		list.removeIf(x -> x.charAt(0) == 'R');
		for (String obj : list) {
			System.out.println(obj);
		}
		
		// Encontra a posição de um elemento da lista
		// Quando um elemento não é encontrado, é retornado o valor '-1'
		System.out.println("==============");
		System.out.println(list.indexOf("Terma"));
		System.out.println(list.indexOf("Ralf"));
		
		// Filtra os resultados de um predicado da lista
		System.out.println("==============");
		List<String> results = list.stream().filter(
				x -> x.charAt(1) == 'e').collect(Collectors.toList());
		System.out.println(results);
		
		// Filtra o primeiro elemento de um predicado da lista
		System.out.println("==============");
		String name = list.stream().filter(
				x -> x.charAt(1) == 'e').findFirst().orElse(null);
		System.out.println(name);
	}
}
