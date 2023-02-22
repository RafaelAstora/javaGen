package atvd1;

public class Cliente {
	
	private int idade;
	private long id;
	private String nome;
	private String cidade;
	private String tipo;
	public Cliente(int idade, long id, String nome, String cidade, String tipo) {
		super();
		this.idade = idade;
		this.id = id;
		this.nome = nome;
		this.cidade = cidade;
		this.tipo = tipo; //premium ou comum
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void visualizar() {
		
		System.out.println("\n\nId:" + this.id);
		System.out.println("\nIdade:" + this.idade);		
		System.out.println("\nnome:" + this.nome);
		System.out.println("\ncidade:" + this.cidade);
		System.out.println("\ntipo:" + this.tipo);
		
	}
	
	
	
}
