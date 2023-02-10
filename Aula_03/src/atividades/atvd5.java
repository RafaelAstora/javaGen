package atividades;

import java.util.Scanner;

public class atvd5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int contadorP=0, contador = 1, n;
		boolean zero =  false;
		
		do{
			System.out.println("Digite um numero: ");
			n = sc.nextInt();
			
			if(n > 0){
				contadorP++;
			}
			if(n == 0){
				zero = true;
			}
			
		}while(!zero);
		System.out.println("A soma dos números positivos é:" + contadorP);
		
	}
	
	
}
