package exercicio_classe;


/**
 * 
 * <p>
 * Esqueleto essecial para a criação de uma geladeira
 * </p>
 * @author Leonardo do Nascimento Barbosa
 * 
 * @version 0.0.1
 * 
 *
 * @see <a href="https://github.com/BarbosaLeo/curso-ebac-backend/tree/exercicio-modulo-7-classes">Development Page</a>
 * 
 */


public class Geladeira {
	
	private String cor;
	private double peso;
	private int qtdPortas;
	private int qtdPrateleiras;
	private int qtdGavetas;
	private double temperatura;
	private boolean luzAcesa;
	
	public Geladeira(String cor, double peso, int qtdPortas, int qtdPrateleiras, int qtdGavetas) {
		this.cor = cor;
		this.peso = peso;
		this.qtdPortas = qtdPortas;
		this.qtdPrateleiras = qtdPrateleiras;
		this.qtdGavetas = qtdGavetas;
	}
	/**
	 * 
	 * @param Define se a luz interna da geladeira está acesa ou não.
	 */
	public void setLuzAcesa(boolean valor) {
		this.luzAcesa = valor;
	}
	/**
	 * 
	 * @return Retorna a temperatura atual interna do refrigerador em graus Celsius.
	 */
	public double getTemperatura() {
		return temperatura;
	}
}
