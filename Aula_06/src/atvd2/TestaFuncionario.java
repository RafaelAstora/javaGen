package atvd2;

public class TestaFuncionario {

	public static void main(String[] args) {
	
		
		Funcionario f1 = new Funcionario(1, 29, 20000,
				"Josias Falcão" , "Arquiteto de soluções");
		
		Funcionario f2 = new Funcionario(2, 22, 12000,
				"Malaquias Santos" , "Dev. FullStack C#");
		
		f1.visualizar();
		f2.visualizar();
		
	}

}
