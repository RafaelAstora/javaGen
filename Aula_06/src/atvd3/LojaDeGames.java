package atvd3;

public class LojaDeGames {

private long id;
private double preco;
private String nome;
private String console;
private String tipoMidia; //DVD ou Chip(Nintendo switch)
public LojaDeGames(long id, double preco, String nome, String foto, String tipoMidia) {
	super();
	this.id = id;
	this.preco = preco;
	this.nome = nome;
	this.console = foto;
	this.tipoMidia = tipoMidia;
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
public String getFoto() {
	return console;
}
public void setFoto(String foto) {
	this.console = foto;
}
public String getTipoMidia() {
	return tipoMidia;
}
public void setTipoMidia(String tipoMidia) {
	this.tipoMidia = tipoMidia;
}
	
public void visualizar() {
	
	System.out.println("\n\nId:" + this.id);
	System.out.println("\nPreço:" + this.preco);		
	System.out.println("\nnome:" + this.nome);
	System.out.println("\nConsole:" + this.console);
	System.out.println("\nMidia:" + this.tipoMidia);
	
}

}
