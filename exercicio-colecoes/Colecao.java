package colecoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Colecao {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite a quatidade de pessoas para cadastrar: ");
		String qtdPessoas = s.nextLine();
		
		List<String> pessoas = cadastro(qtdPessoas,s);
		List<String> pessoasM = new ArrayList<String>();
		List<String> pessoasF = new ArrayList<String>();
		
		for (String pessoa : pessoas) {
			if(pessoa.contains(",")) {
				String[] arr = pessoa.split(",");
				if (arr[1].toUpperCase().contains("M")) {
					pessoasM.add(arr[0]);
				} else {
					pessoasF.add(arr[0]);
				}
			}
		}
		
		System.out.println("Pessoas atribuidas ao sexo masculino: "+pessoasM);
		System.out.println("Pessoas atribuidas ao sexo feminino: "+pessoasF);
		
	}

	private static ArrayList<String> cadastro(String qtdPessoas, Scanner s) {
		
		List<String> pessoas = new ArrayList<String>(); 
		
		for (int i = 0; i < Integer.parseInt(qtdPessoas); i++) {
			if( i==0 ) {System.out.print("Insira o nome e sexo biologico. Ex: Leonardo,M ");
			}else {System.out.print("Insira o nome e sexo biologico. "); }
			
			pessoas.add(s.nextLine());
		}
		return (ArrayList<String>) pessoas;
	}

}