package composicao;

public class PessoaFisica extends Pessoa {
	
	private String cpf;
	
	public PessoaFisica(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String getDocumento() {
		return cpf;
	}
	
}
