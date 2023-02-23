package atvd4;

public abstract class Farmacia {

	private long id;
	private double preco;
	private String nome;
	private String nomeComercial;
	private String foto;
	private String fabricante;
	private int tipo;

	public Farmacia(long id, double preco, String nome, String nomeComercial, String foto, String fabricante,
			int tipo) {
		super();
		this.id = id;
		this.preco = preco;
		this.nome = nome;
		this.nomeComercial = nomeComercial;
		this.foto = foto;
		this.fabricante = fabricante;
		this.tipo = tipo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
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

	public String getNomeComercial() {
		return nomeComercial;
	}

	public void setNomeComercial(String nomeComercial) {
		this.nomeComercial = nomeComercial;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public void visualizar() {
		
		String tipo = "";
		switch(this.tipo) {
		case 1-> tipo = "Medicamento";
		case 2-> tipo = "Perfumaria";
		}

		System.out.println("\nId: " + this.id);
		System.out.println("Nome: " + this.nome);
		System.out.println("Nome comercial: " + this.nomeComercial);
		System.out.println("Fabricante: " + this.fabricante);
		System.out.println("Foto: " + this.foto);
		System.out.println("Preço: " + this.preco);
		System.out.println("tipo: " + tipo);
	}

}
