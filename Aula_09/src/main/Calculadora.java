package main;

import java.util.Scanner;

import lambda.OperacaoMatematica;

public class Calculadora {

	
	public static int calcular(OperacaoMatematica om,int n1,int n2) {
		
		return om.executar(n1,n2);		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1,n2;
		
		
		System.out.println("Digite o 1º Numero");
		n1 = sc.nextInt();
		
		System.out.println("Digite o 2º Numero");
		n2 = sc.nextInt();
		
		System.out.println("A soma dos dois numeros é igual a:" + calcular((a,b) -> a + b,n1,n2));
		System.out.println("A subtração dos dois numeros é igual a:" + calcular((a,b) -> a - b,n1,n2));
		System.out.println("A multiplicaçao dos dois numeros é igual a:" + calcular((a,b) -> a * b,n1,n2));
		System.out.println("A divisão dos dois numeros é igual a:" + calcular((a,b) -> a / b,n1,n2));
		
		
		sc.close();	
	}

}
