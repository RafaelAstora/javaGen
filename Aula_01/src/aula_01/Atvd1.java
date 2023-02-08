package aula_01;

import java.util.Scanner;

public class Atvd1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	float salario,abono,novoSalario;
	
	System.out.println("Digite o Salario:");
	salario = sc.nextFloat();
	System.out.println("Digite o Abono:");
	abono = sc.nextFloat();
	
	novoSalario = salario + abono;
	System.out.println("Novo salário é: " + novoSalario);
	
	
	
	
	
	
	}

}
