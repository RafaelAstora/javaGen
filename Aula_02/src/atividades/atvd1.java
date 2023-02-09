package atividades;
import java.util.Scanner;
public class atvd1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int A,B,C;
	
		while(1 == 1) {
	System.out.println("\ndigite o numero A");
	A = sc.nextInt();
	System.out.println("\ndigite o numero B");
	B = sc.nextInt();
	System.out.println("\ndigite o numero C");
	C = sc.nextInt();
	
	if(A+B == C){
		System.out.println("\nA + B é igual a C");
	}else if(A+B > C) {
		System.out.println("\nA + B é maior que C");
	}else if(A+B < C){
		System.out.println("\nA + B é menor que C");
	}else {
		System.out.println("entrada inválida!");
	}
	
		}
	
	}

}
