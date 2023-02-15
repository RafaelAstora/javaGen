package AtividadesCollections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class atvd4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<Integer>();

		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);

		System.out.println("Digite o numero que você deseja encontrar: ");
		int numero = sc.nextInt();
		if (numeros.contains(numero)) {
			System.out.println("Foi encontrado o numero " + 	numero);

		} else {
			System.out.println("Não foi encontrado o numero " + numero);
		}

	}

}
