package AtividadesCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class atvd3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Set<Integer> numeros = new HashSet<Integer>();

		for (int i = 0; i < 10; i++) {

			numeros.add(sc.nextInt());

		}

		Iterator<Integer> iNumeros = numeros.iterator();

		while (iNumeros.hasNext()) {

			System.out.println(iNumeros.next());
		}

	}
}
