package atividades;

import java.util.Scanner;

public class atvd2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;
		while (1 == 1) {
			System.out.println("Insira um numero:");

			n = sc.nextInt();

			  if (n % 2 == 0) {
				System.out.println("Numero par!");
			} else {
				System.out.println("Numero ímpar");
			}
		}
	}
}
