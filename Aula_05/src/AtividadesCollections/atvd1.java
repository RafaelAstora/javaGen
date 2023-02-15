package AtividadesCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class atvd1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();

		System.out.println("Insira 5 cores: ");

		for (int i = 0; i < 5; i++) {

			cores.add(sc.next());

		}

		for (var cor : cores) {
			System.out.println(cor);
		}

		Collections.sort(cores);

		for (var cor : cores) {
			System.out.println(cor);
		}
	}

}
