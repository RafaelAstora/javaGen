package conta.model;

public class ContaCorrente extends Conta {

		double limite;
	
		@override
		public boolean sacar(Double valor) {
			
			if(this.getSaldo() < valor) {
				System.out.println("Saldo insuficiente!");
				return false;
			}
			this.setSaldo(this.getSaldo() - valor);
			return true;
		}
	
}
