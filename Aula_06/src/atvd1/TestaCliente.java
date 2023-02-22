package atvd1;

public class TestaCliente {

	public static void main(String[] args) {

		
		Cliente c1 = new Cliente(23,1,"Roberto Silveira","Taboão Da Serra","Premium");
		Cliente c2 = new Cliente(42,2,"Jacinto Socorro","Varginha","normal");
		
		c1.visualizar();
		c2.visualizar();
		
		
	}

}
