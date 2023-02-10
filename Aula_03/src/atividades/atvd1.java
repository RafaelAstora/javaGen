package atividades;

import java.util.Scanner;

public class atvd1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1, n2;

		System.out.println("Digite o primeiro numero:");
		n1 = sc.nextInt();

		System.out.println("Digite o segundo numero:");
		n2 = sc.nextInt();

		if (n1 < n2) {

			for (int i = n1; i < n2; i++) {

				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println(i + " É multiplo de 5 e 3");
				}

			}
		} else {
			System.out.println("Intervalo inválido: 	" + "\n\n fechando programa........ ");
			System.exit(0);
		}
	
		sc.close();	
	}
}
