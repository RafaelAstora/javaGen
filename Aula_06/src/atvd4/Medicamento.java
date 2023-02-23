package atvd4;

public class Medicamento  extends Farmacia{
	private String principioAtivo;
	
	public Medicamento(long id, double preco, String nome, String nomeComercial, String foto, String fabricante,
			String principioAtivo, int tipo) {
		super(id, preco, nome, nomeComercial, foto, fabricante, tipo);
		this.principioAtivo = principioAtivo;
	}

	public String getPrincipioAtivo() {
		return principioAtivo;
	}

	public void setPrincipioAtivo(String principioAtivo) {
		this.principioAtivo = principioAtivo;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("Princípio Ativo: " + principioAtivo);
	}
	
	
}
