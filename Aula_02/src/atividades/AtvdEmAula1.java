package atividades;

import java.util.Scanner;

public class AtvdEmAula1 {

	public static void main(String[] args) {

		planoDeSaude();

	}

	static public void planoDeSaude() {

		Scanner sc = new Scanner(System.in);

		float value;
		int idade;

		System.out.println("Digite sua idade:");
		idade = sc.nextInt();

		if (idade <= 10 && idade >= 0) {
			System.out.println("Seu plano é de R$ 100,00\n");
		}

		else if (idade > 10 && idade <= 29) {
			System.out.println("Seu plano é de R$ 200,00\n");
		}

		else if (idade > 29 && idade <= 45) {
			System.out.println("Seu plano é de R$ 300,00\n");
		}

		else if (idade > 45 && idade <= 59) {
			System.out.println("Seu plano é de R$ 500,00\n");
		}

		  else if (idade > 59 && idade <= 65 ) {
			System.out.println("Seu plano é de R$ 600,00\n");
		} else if (idade > 65 && idade <= 100) {
			System.out.println("Seu plano é de R$ 1000,00\n");
		} else {
			System.out.println("sai daqui mumia.\n");
		}

		String decisao = "s";

	

		while (decisao == "s" || decisao == "S") {
			System.out.println("Deseja fazer novamente?(S/N)");
			decisao = sc.next();

			switch (decisao) {

			case "S":
				planoDeSaude();
				break;

			case "s":
				planoDeSaude();
				break;

			case "n":
				System.out.println("fechando programa.....");
				System.exit(0);
				break;

			case "N":
				System.out.println("fechando programa.....");
				System.exit(0);
				break;

			default:
				System.out.println("ERRO!!!");

			}

		}

	}
}
