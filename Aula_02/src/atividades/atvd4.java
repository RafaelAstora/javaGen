package atividades;

import java.util.Scanner;

public class atvd4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ca1, ca2 = "", ca3;
		System.out.println("Insira a primeira caracteristica(invertebrado ou vertebrado)");
		ca1 = sc.next();

		if (ca1 == "invertebrado") {

			System.out.println("Insira a segunda caracteristica(Inseto ou anelideo)");

			ca2 = sc.next();

			if (ca2.equalsIgnoreCase("inseto")) {
				System.out.println("Insira a terceira caracteristica(Hematofago ou Herbivoro)");
				ca3 = sc.next();
				  if (ca3.equalsIgnoreCase("Hematofago")) {
					System.out.println("Pulga");
				} 	else {
					System.out.println("Lagarta");
				}

			} else if (ca2.equalsIgnoreCase("anelideo")) {
				System.out.println("Insira a terceira caracteristica(Hematofago ou Onivoro)");
				ca2 = sc.next();
				if (ca2.equalsIgnoreCase("hematofago")) {
					System.out.println("Sanguessuga");
				} else {
					System.out.println("minhoca");
				}
			}
		}else {
			System.out.println("Insira a segunda caracteristica(Ave ou Mamifero)");
			ca2 = sc.next();
			if (ca2.equalsIgnoreCase("Ave")) {
				System.out.println("Insira a terceira caracteristica(Carnivoro ou Onivoro)");
				ca3 = sc.next();
				if (ca3.equalsIgnoreCase("Carnivoro")) {
					System.out.println("Águia");
				} else {
					System.out.println("Pomba");
				}
			} else if (ca2.equalsIgnoreCase("mamifero")) {
				System.out.println("Insira a terceira caracteristica(Herbivaro ou Onivoro)");
				ca2 = sc.next();
				if (ca2.equalsIgnoreCase("herbivaro")) {
					System.out.println("Vaca");
				} else {
					System.out.println("Homem");
				}
			}
		}
	}
}
