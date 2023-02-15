package atividadesEstruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class atvd1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();

		int opcao;

		do {
			System.out.println("");

			System.out.println("1 - Adicionar Cliente na fila");
			System.out.println("2 - Listar todos os clientes");
			System.out.println("3 - Retirar Cliente da fila");
			System.out.println("0 - Sair");

			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("\nInsira o nome do cliente\n");
				
				fila.add(sc.nextLine());

				break;
			case 2:
				if (!fila.isEmpty()) {
					System.out.println("Fila:\n");
					fila.forEach(System.out::println);
				} else
					System.out.println("A lista esta vazia");
				break;
			case 3:
				if (!fila.isEmpty()) {
					System.out.println("Fila:\n");
					fila.poll();
					fila.forEach(System.out::println);
				} else
					System.out.println("\nA lista esta vazia");
				break;

			}
		} while (opcao != 0);
		
		System.out.println("Programa finalizado!");

	}

}
