package atvd3;

public class Produto {

	private long id;
	private double preco;
	private String nome;
	private String console;

	public Produto(long id, double preco, String nome, String console, String tipoMidia) {
		super();
		this.id = id;
		this.preco = preco;
		this.nome = nome;
		this.console = console;

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public void visualizar() {

		System.out.println("\n\nId:" + this.id);
		System.out.println("\nPreço:" + this.preco);
		System.out.println("\nnome:" + this.nome);
		System.out.println("\nConsole:" + this.console);

	}

}
