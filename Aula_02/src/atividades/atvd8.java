package atividades;

import java.util.Scanner;

public class atvd8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double saldo = 1000,saque,deposito;
		int operacao;
		
		System.out.println("Escolha um operação: "
				+ "\n1-Saldo"
				+ "\n2-Saque"
				+ "\n3-Deposito");
		operacao = sc.nextInt();

		
		
		switch(operacao){
		
		case 1:
			System.out.println("Seu saldo é de: R$ " + saldo);
			
			break;
		
		case 2:
			System.out.println("Digite seu Saque:");
			saque = sc.nextDouble();
			if(saque>saldo) {
			System.out.println("Saldo insuficiente!");
			break;
			}
			saldo -= saque;
			System.out.println("Seu saldo atual é de: R$ " + saldo);
			break;
			
		case 3:
		System.out.println("Digite seu depósito:");
		deposito = sc.nextDouble();
		saldo += deposito;
		System.out.println("Seu saldo atual é de: R$ " + saldo);
			
			
			break;
	
			default:System.out.println("OPERACÃO INVÁLIDA");
			
			
		}	
		
		
		
	}

}
