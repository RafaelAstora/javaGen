package conta;

import java.util.Scanner;

import conta.model.Conta;

public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		Conta c1 = new Conta(1,123,1,"Erica Araújo",30000.0f);	
		Conta c2 = new Conta(1,123,1,"Dener Cardoso",50000.0f);			

		
		c1.vizualizar();
		c1.setSaldo(35000f);
		System.out.println(c1.getSaldo());
		
		
		c2.sacar(100f);
		c2.vizualizar();
		do {
			
			System.out.println("         *******************************************************");
			System.out.println("         *                                                     *");
			System.out.println("         *                     BANCO DUARTE                    *");
			System.out.println("         *                                                     *");
			System.out.println("         *******************************************************");
			System.out.println("         *        1 - Criar Conta                              *");
			System.out.println("         *        2 - Lista todas as Contas                    *");
			System.out.println("         *        3 - Buscar Conta por Numero                  *");
			System.out.println("         *        4 - Atualizar Dados da Conta                 *");
			System.out.println("         *        5 - Apagar Conta                             *");
			System.out.println("         *        6 - Sacar                                    *");
			System.out.println("         *        7 - Depositar                                *");
			System.out.println("         *        8 - Transferir valores entre Contas          *");
			System.out.println("         *        9 - Sair                                     *");
			System.out.println("         *******************************************************\n\n");

			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Criar conta\n\n");
				break;
			case 2:
				System.out.println("Lista todas as Contas\n\n");

				break;
			case 3:
				System.out.println("Buscar Conta por Numero\n\n");

				break;
			case 4:
				System.out.println("Atualizar Dados da Conta \n\n");

				break;
			case 5:
				System.out.println("Apagar Conta\n\n");

				break;
			case 6:
				System.out.println("Sacar\n\n");

				break;
			case 7:
				System.out.println("Depositar\n\n");

				break;
			case 8:
				System.out.println("Transferir valores entre Contas\n\n");

				break;
			case 9:
				System.out.println("BANCO DUARTE - SEU FUTURO ACABA AQUI AHAHAHHA");
				break;

			}

		} while (true);

	}

}
