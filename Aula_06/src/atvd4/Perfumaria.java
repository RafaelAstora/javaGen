package atvd4;

public class Perfumaria extends Farmacia {

public Perfumaria(long id, double preco, String nome, String nomeComercial, String foto, String fabricante,
			String fragancia,int tipo) {
		super(id, preco, nome, nomeComercial, foto, fabricante,tipo);
		this.fragancia = fragancia;
	}

private String fragancia;


public String getFragancia() {
	return fragancia;
}

public void setFragancia(String fragancia) {
	this.fragancia = fragancia;
}

public void visualizar() {
	
	super.visualizar();
	System.out.println("Frangancia: " + fragancia);
	
}
		
}
