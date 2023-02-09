package atividades;

import java.util.Scanner;

public class atvd5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int item, qtd;
		float preco = 0;
		
		System.out.println("O que quer comprar?");
		
		item = sc.nextInt();

		switch (item) {

		case 1:
			System.out.println("Cachorro Quente - R$ 10,00");
			preco = 10;
			break;

		case 2:
			System.out.println("X-Salada - R$ 15,00");
			preco = 15;
			break;

		case 3:
			System.out.println("X-Bacon - R$ 18,00");
			preco = 18;
			break;

		case 4:
			System.out.println("Bauru - R$ 12,00");
			preco = 12;
			break;

		case 5:
			System.out.println("Refrigerante - R$ 8,00");
			preco = 8;
			break;

		case 6:
			System.out.println("Suco de Laranja - R$ 13,00");
			preco = 13;
			break;
			default:
				System.out.println("Não temos este produto");
				System.exit(0);
	
				
		}
		
		System.out.println("Quantos quer?");
		qtd =sc.nextInt();

		System.out.println("Valor total: R$" + qtd * preco);
		
	
	sc.close();
	}

}