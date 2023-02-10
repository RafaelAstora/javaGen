package atividades;

import java.util.Scanner;

public class atvd2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, contadorI = 0,contadorP = 0;
		
		
		
		
		
		
		
		
		
		for(int i = 1;i <= 10;i++) {
			System.out.println("Digite o "+ i  +"º número");
			n = sc.nextInt();
			
			if(n % 2 == 0) {
				contadorP += 1;
			}else {
				contadorI+=1;
			}
			
	
		}
		System.out.println("Total de numero pares é: "+ contadorP);
		System.out.println("\nTotal de numeros ímpares é: "+contadorI);
		
		
		
		
	}

}
