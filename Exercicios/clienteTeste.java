package POO;

public class clienteTeste {

	public static void main(String[] args) {
		Cliente pessoa = new Cliente("Otavio Matheus", "49320015830", "Rua SPFC N.633", 24,970707070 );
		
		pessoa.imprimirInfo();
		
		System.out.println("*** CLIENTE 2");
		pessoa.setNome("Sarah Santana");
		pessoa.setCpf("12345678910");
		pessoa.setEndereco("Rua do Louvor N.33");
		pessoa.setIdade(23);
		pessoa.setTelefone(930303030);
		pessoa.imprimirInfo();
		
		System.out.println("*** CLIENTE 3");
		pessoa.setNome("Kalleb Matheus");
		pessoa.setCpf("22233344455");
		pessoa.setEndereco("Rua do Binho N.55");
		pessoa.setIdade(02);
		pessoa.setTelefone(99909090);
		pessoa.imprimirInfo();
		

	}

}

// SuperCLasse

package POO;

public class Cliente {
	private String nome;
	private String cpf;
	private String endereco;
	private int idade;
	private int telefone ;
	
	public Cliente(String nome, String cpf, String endereco, int idade, int telefone) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.idade = idade;
		this.telefone = telefone;
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public void imprimirInfo() {
		System.out.println("Cliente "+ nome + " com CPF: " +cpf+ " e idade "+idade+ " do endereço: "+endereco+ " com telefone:"+telefone);
	}

}


