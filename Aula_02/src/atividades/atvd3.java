package atividades;

import java.util.Scanner;

public class atvd3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nome;
		int idade;
		boolean primeiraDoacao;
		System.out.println("Digite seu nome");
		nome = sc.next();
		
		System.out.println("Primeira vez doando Sangue? (true/false)");
		primeiraDoacao = sc.nextBoolean();

		System.out.println("Digite sua idade");
		idade = sc.nextInt();
		
		
		if (idade >= 18 && idade <= 59) {
			
				System.out.println(nome + " Está apt@ para doar sangue!");
			}else {
				System.out.println(" Não Está apt@ para doar sangue!");
			}
		
		if(idade >= 60 && idade <= 69) {
			if(primeiraDoacao == true){
				System.out.println(nome + " Não está apt@ para doar sangue!");
			}else {
				System.out.println(" Está apt@ para doar sangue!");
			}
			
			
		}
		

		}	 

	}


