package atividadesEstruturaDeDados;

import java.util.Scanner;
import java.util.Stack;

public class atvd2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opcao;

		Stack<String> livros = new Stack<String>();

		do {

			System.out.println("1 - Adicionar livro na pilha");
			System.out.println("2 - Listar todos os livros");
			System.out.println("3 - Retirar livro da pilha");
			System.out.println("0 - Sair");
			String livro;
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Insira o nome do Livro");
			sc.skip("\\R?");

				livros.add(sc.nextLine());

				System.out.println("livro adicionado\n");

				break;
			case 2:
				if (!livros.isEmpty())
					livros.forEach(System.out::println);
				else
					System.out.println("A pilha esta vazia\n");
				break;
			case 3:
				if (!livros.isEmpty()) {
					livros.pop();
					System.out.println("Pilha:");
					livros.forEach(System.out::println);
					livros.peek();

					System.out.println("O livro foi retirado da pilha:");
				} else {
					System.out.println("A pilha esta vazia\n");
				}
				break;

			}

		} while (opcao != 0);

		System.out.println("Encerrando programa");

	}

}
