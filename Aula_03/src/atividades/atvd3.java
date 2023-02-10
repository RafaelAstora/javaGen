package atividades;

import java.util.Scanner;

public class atvd3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = 1, contaMn = 0, contaMa = 0, idade;

		while (i > 0) {
			System.out.println("Digite uma idade: ");
			idade = sc.nextInt();
			if (idade >= 0) {

				  if (idade > 50) {
					contaMa++;
				} else if (idade < 21) {
					contaMn++;
				}

			}

			i++;
		}

		System.out.println("\nTotal de pessoas menores de 21 anos: " + contaMn);
		System.out.println("\nTotal de pessoas maiores de 50 anos: " + contaMa);

	}

}
