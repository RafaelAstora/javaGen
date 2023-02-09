package aula_01;

import java.util.Scanner;

public class atvd4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Float n1,n2,n3,n4,diferenca;
		
		System.out.println("Insira o numero 1:");
		n1 = sc.nextFloat();
		System.out.println("Insira o numero 2:");
		n2 = sc.nextFloat();
		System.out.println("Insira o numero 3:");
		n3 = sc.nextFloat();
		System.out.print("Insira o numero 4:");
		n4 = sc.nextFloat();
		
		diferenca = (n1*n2)-(n3*n4);
		
		System.out.printf("diferença: %d",diferenca);
		
		
		
	}

}
