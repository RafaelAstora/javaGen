package atividades;

import java.util.Scanner;

public class atvd7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1,n2;
		int operacao;
		
		System.out.println("Escolha uma operação: "
				+ "\n1-soma"
				+ "\n2-subtração"
				+ "\n3-multiplicação"
				+ "\n4-divisão");
		operacao = sc.nextInt();
		System.out.println("Insira ");
		n1 = sc.nextDouble();
		
		n2 = sc.nextDouble();
		
		switch(operacao){
		
		case 1:
			System.out.println("A soma de " +n1+" + "+n2+"= "+ (n1+n2));
			break;
		
		case 2:
			System.out.println("A subtração de " +n1+" - "+n2+"= "+ (n1-n2));
			break;
			
		case 3:
			System.out.println("A multiplicação de " +n1+" * "+n2+"= "+ (n1*n2));
			break;
			
		case 4:
			System.out.println("A divisão de " +n1+" / "+n2+"= "+ (n1/n2));
			break;
			
		}
		
		
	}

}
