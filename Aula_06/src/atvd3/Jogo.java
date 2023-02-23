package atvd3;

public class Jogo extends Produto {
	private String tipoMidia; //DVD, Digital ou Chip(Nintendo switch)
	private String Studio;
	
	public Jogo(long id, double preco, String nome, String console, String tipoMidia,
			String studio) {
		super(id, preco, nome, console, tipoMidia);
		tipoMidia = tipoMidia;
		Studio = studio;
	}

	


	public void visualizar() {

		super.visualizar();
		System.out.println("\nTipo de midia:" + this.tipoMidia);
		System.out.println("\nStudio/Produtora:" + this.Studio);

	}
}
