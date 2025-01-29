package colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		/*
		 * PARTE 1
		 * 
		 * Input teste: Amanda, Luciano, Beatriz, Marcelo, Mateus, Vanessa, Renato, Carla, Marcos
		 * 
		 */
		System.out.print("Insira nome de pessoas separado por vírgula: ");
		String entrada = s.nextLine();
		System.out.println(entrada);
		System.out.println();
		List<String> nomes = new ArrayList<String>();
		for (int i = 0; i < entrada.split(",").length; i++) {
			String nome = entrada.split(",")[i];
			nomes.add(nome.trim());
		}
		Collections.sort(nomes);
		System.out.println("*** Nomes ordenados ***");
		System.out.println(nomes);
		System.out.println();
		/*
		 * PARTE 2
		 * 
		 * Input teste: Luciano - m,Beatriz -F,Marcelo-M,Mateus - M,Vanessa-f,Renato - m,Carla - F,Marcos-m,Amanda - F
		 */
		
		System.out.println("Insira nome da pessoa e sexo separado por vírgula: ");
		System.out.println("Ex Amanda - F, Ricardo - M,...");
		entrada = s.nextLine();
		System.out.println();
		
		Map<Integer, List<String>> pessoas = cadastro(entrada,s);
		
		for (Map.Entry<Integer, List<String>> entry : pessoas.entrySet()) {
			Integer key = entry.getKey();
			List<String> val = entry.getValue();
			
			if (key==0) {
				System.out.println("*** Feminino ***");
				val.forEach(nome -> System.out.println(nome));
			}
			if (key==1) {
				System.out.println("*** Masculino ***");
				val.forEach(nome -> System.out.println(nome));
			}
			
		
		}
		
		s.close();
	}

	private static HashMap<Integer,List<String>> cadastro(String entrada, Scanner s) {
		String[] entradas = entrada.split(",");
		List<String> masculino = new ArrayList<String>();
		List<String> feminino = new ArrayList<String>();
		Map<Integer, List<String>> pessoas = new HashMap<>();

		for (int i = 0; i < entradas.length; i++) {
			String nome = entradas[i].split("-")[0].trim();
			String genero = entradas[i].split("-")[1].trim();
			
			if(genero.toUpperCase().equals("M")) {
				masculino.add(nome);
			}else {
				feminino.add(nome);
			}
		}
		pessoas.put(0, feminino);
		pessoas.put(1, masculino);
		
		return (HashMap<Integer, List<String>>) pessoas;
	}

}