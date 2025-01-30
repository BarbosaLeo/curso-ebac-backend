package composicao;

public class PessoaJuridica extends Pessoa {

	private String cnpj;

	public PessoaJuridica(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public String getDocumento() {
		return cnpj;
	}
	
}
