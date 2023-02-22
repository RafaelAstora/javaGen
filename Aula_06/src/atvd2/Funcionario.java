package atvd2;

public class Funcionario {

	private int id;
	private int idade;
	private double salario;
	private String nome;
	private String funcao;

	
	
	
	public Funcionario(int id, int idade, double salario, String nome, String funcao) {
		super();
		this.id = id;
		this.idade = idade;
		this.salario = salario;
		this.nome = nome;
		this.funcao = funcao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public void visualizar() {
		
		System.out.println("\n\nId:" + this.id);
		System.out.println("\nIdade:" + this.idade);		
		System.out.println("\nnome:" + this.nome);
		System.out.println("\nfunção:" + this.funcao);
		System.out.println("\nSalario:" + this.salario);
		
	}
	
	
	
}
