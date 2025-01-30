package composicao;

public class Programa {
	public static void main(String[] args) {
		
		PessoaFisica pf = new PessoaFisica("123.123.123-12");
		pf.setNome("Pessoa Fisica");
		pf.setIdade(10);
		
		System.out.println("Nome: "+pf.getNome()+" Idade: "+pf.getIdade()+" Documento: "+pf.getDocumento());
		
		PessoaFisica pj = new PessoaFisica("12.123.123/0001-12");
		pj.setNome("Pessoa Juridica");
		pj.setIdade(12);
		
		System.out.println("Nome: "+pj.getNome()+" Idade: "+pj.getIdade()+" Documento: "+pj.getDocumento());
		
	}
}
