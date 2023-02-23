package conta.model;

public class Conta {

	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private double saldo;



	public Conta(int numero, int agencia, int tipo, String titular, double saldo) {

		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;

	}



	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public int getAgencia() {
		return agencia;
	}



	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}



	public int getTipo() {
		return tipo;
	}



	public void setTipo(int tipo) {
		this.tipo = tipo;
	}



	public String getTitular() {
		return titular;
	}



	public void setTitular(String titular) {
		this.titular = titular;
	}



	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double d) {
		this.saldo = d;
	}



	public void depositar(double valor) {
			this.setSaldo(this.getSaldo() +  valor);
	}

	public boolean sacar(double valor) {
		
		if(this.getSaldo() < valor) {
			System.out.println("Saldo insuficiente!");
			return false;
		}
		this.setSaldo(this.saldo - valor);
		return true;
	}

	public void vizualizar(){
		
		String tipo = "";
		
		switch(this.tipo) {
		case 1 -> tipo = "Conta Corrente";

		case 2 -> tipo = "Conta Poupança";		
		}
		
		System.out.println("***************************");
		System.out.println("*      DADOS DA CONTA     *");
		System.out.println("***************************");
		System.out.println("Numero da conta: " + this.numero);
		System.out.println("Numero da agencia: " + this.agencia);
		System.out.println("Tipo da conta: " + tipo);
		System.out.println("Nome do titular: " + this.titular);
		System.out.println("Saldo da conta: " + this.saldo);

	}
	
	
}
