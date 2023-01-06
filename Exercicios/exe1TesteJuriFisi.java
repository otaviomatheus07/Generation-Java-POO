// MAIN
package POO;

public class exe1TesteJuriFisi {

	public static void main(String[] args) {
		ExeHeranca1 pessoaF = new ExeHeranca1("Otavio Matheus", "12345678910","Rua São PauloFC n.633", 24, 970707070, 3500,40);
		
		pessoaF.imprimirInfoFisi();
		pessoaF.calcularSalario();


	}

}

//SUPERCLASSE
package POO;

public class ExeHeranca1 {

	private String nome;
	private String cpf;
	private String endereco;
	private int idade;
	private int telefone ;

	public ExeHeranca1(String nome, String cpf, String endereco, int idade, int telefone) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.idade = idade;
		this.telefone = telefone;

	}
	public ExeHeranca1() {
		super();
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

	

}
// SUBCLASSE
package POO;

public class PessoaJuridica extends ExeHeranca1 {
	
	private String cnpj;
	private String empresa;
	public PessoaJuridica(String nome, String cpf, String endereco, int idade, int telefone, String cnpj,
			String empresa) {
		super(nome, cpf, endereco, idade, telefone);
		this.cnpj = cnpj;
		this.empresa = empresa;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public void imprimirInfoJuri() {
		System.out.println("\n O cidadão "+getNome()+ "\n CPF: "+getCpf()+"\n Endereço: "+ getEndereco()+"\n Idade: "+getIdade()+"\n Telefone: "+getTelefone()+"\n CNPJ: " +cnpj+"\n Dono da empresa "+empresa);
		
		
	}
	
	

}

// SUBCLASSE 2
package POO;

public class PessoaFisica extends ExeHeranca1{

	private float salario;
	private float imposto;
	public PessoaFisica(String nome, String cpf, String endereco, int idade, int telefone, float salario,
			float imposto) {
		super(nome, cpf, endereco, idade, telefone);
		this.salario = salario;
		this.imposto = imposto;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public float getImposto() {
		return imposto;
	}
	public void setImposto(float imposto) {
		this.imposto = imposto;
	}

	public void imprimirInfoFisi() {
		System.out.println("O cidadão "+getNome()+" que é uma pessoa fisíca"+ "\n CPF: "
				+getCpf()+"\n Endereço"+ getEndereco()+"\n Idade:"+getIdade()+"\n Telefone: "
				+getTelefone()+" \n Imposto: " + imposto +"\n Depois do imposto seu salário ficará:  "+salario);
	}
	
	public void calcularSalario() {
		double valorTotal = salario - (salario *(imposto/100));
		System.out.println("\nO salário líquido a ser recebido pelo empregado "+getNome()+" é igual a: "+valorTotal);
		
	}




}








