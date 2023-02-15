package AtividadesCollections;

import java.util.Scanner;
import java.util.ArrayList;

public class atvdEmAula {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opcao = 0;
		Double nota;
		ArrayList<Double> notas = new ArrayList<Double>();

		do {

			System.out.println("1- Cadastrar nota");
			System.out.println("2- Listar todas as notas");
			System.out.println("3- prucurar um nota");
			System.out.println("4-deletar uma nota");
			System.out.println("5- Sair\n");
			System.out.println("Digite a opção desejada:\n");

			opcao = sc.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("\nInsira uma nota de 1 a 10");
				nota = sc.nextDouble();
				notas.add(nota);
				break;

			case 2:
				System.out.println("Listar todas as Notas\n");
				for (var listaNota : notas)
					System.out.println(listaNota);
				break;

			case 3:
				System.out.println("Digite a nota:");
				nota = sc.nextDouble();

				System.out.println("a nota " + nota + " existe? " + notas.contains(nota));
				System.out.println("\no indice da minha nota é: " + notas.indexOf(nota));
				break;

			case 4:
				System.out.println("Digite a nota:");
				nota = sc.nextDouble();
				notas.remove(nota);
				//notas.remove(notas.indexOf(nota));
				System.out.println("A nota" + nota + " foi removida");
				break;

			default:
				if (opcao != 5) {
					System.out.println("Operação inválida");
				}
			}

		} while (opcao != 5);

	}

}
