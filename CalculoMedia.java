package exercicio_classe;
/**
 * 
 * @author Leonardo do Nascimento Barbosa
 * 
 */

public class CalculoMedia {
	
	public static void main(String[] args) {
		System.out.println("A média é: "+ calculoMedia(4.5, 7, 6, 8.4));
	}

	public static double calculoMedia(double nota1, double nota2, double nota3, double nota4){
		int qtdNotas = 4;
		return (nota1+nota2+nota3+nota4)/qtdNotas;
	}
}
