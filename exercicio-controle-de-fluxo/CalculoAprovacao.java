package controle_fluxo;

import java.util.Scanner;

public class CalculoAprovacao {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Double[] notas = new Double[4];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Insira a nota "+(i+1));
			notas[i] =Double.parseDouble( s.nextLine());
		}
		
		System.out.println(CalcularAprovacao(notas));
		s.close();
	}
	
	private static String CalcularAprovacao(Double[] notas) {
		
		Double mediaFinal = 0.0;
		for (Double nota : notas) {
			mediaFinal += nota;
		}
		
		mediaFinal /= 4;
		
		String msg = "Média final: "+mediaFinal+" Aluno ";

		if(mediaFinal >=7.0) {
			return msg+"aprovado!";
		}else if(mediaFinal>=5.0){
			return msg+"em recuperação.";
		}else {
			return msg+"reprovado!";
		}
	}

}