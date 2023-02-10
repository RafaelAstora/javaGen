package atividades;

import java.util.Scanner;

public class atvd6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 1, multiplos = 0 , contador = 1;
		double media;
		
		System.out.println("vamos calcular alguns numeros, mas cuidado não ponha zero.");
		
		do {
			if (n != 0) {
				System.out.println("Digite um numero: ");
				n = sc.nextInt();
				
				if (n % 3 == 0 && n != 0) {
					contador += n;
					multiplos++;
					
				}
			
			}

		}while (n != 0);
		
		//o exercicio pedia que na entrada fossem apenas numeros inteiros
		//entao converti desta forma.
		double contadormedia = contador;
	media = ((contadormedia-1)/multiplos);
		System.out.println("A média de todos os números múltiplos de 3 é: " + media);
	}

}
