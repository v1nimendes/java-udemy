import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Programn {

	public static void main(String[] args) {
		
		
		List<String> list =  new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco"); //adiciona elemento na lista
		
		System.out.println(list.size()); //tamanho da lista
		
	
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("--------------------------------");
		//remover por inicial
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("--------------------------------");
		System.out.println("Index of Joao: " + list.indexOf("Alex"));
		System.out.println("Index of Marco: " + list.indexOf("Joao"));
		System.out.println("--------------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("--------------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		

	}

}
