package exercicio_wrapper;

import java.util.Scanner;

public class Wrapper {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Insira um número inteiro: ");
		String numero = s.nextLine();
		
		int a = Integer.parseInt(numero);
		System.out.println("Numero inteiro primitivo "+a);
        Integer b = a;
        System.out.println("Numero inteiro Wrapper "+b+" = "+b.getClass().getName());
        
        s.close();
	}

}