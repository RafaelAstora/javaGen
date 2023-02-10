package atividades;

import java.util.Scanner;

public class atvd4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * 					VARIAVEIS DE CONDIÇÃO
		 * 
		 * con1 - Total de pessoas desenvolvedoras Backend
		 * con2 -Total de mulheres desenvolvedoras Frontend
		 * con3 - Total de homens desenvolvedores Mobile maiores de 40 anos
		 * con4 -Total de mulheres desenvolvedoras FullStack menores de 30 anos
		 * */
		
		
		int decisao, idade,cond1=0,cond2=0,cond3=0,cond4=0;
		String SN, sexo  ="", categoria="";
		boolean continuar = true;

		while (continuar == true) {

			System.out.println("digite a idade: ");
			idade = sc.nextInt();

			
			
			System.out.println("digite seu sexo: " + "\n1 – Masculino" + "\n2 - Feminino" + "\n3 - Outro");
			decisao = sc.nextInt();

			switch (decisao) {

			case 1:
				sexo = "Masculino";
				break;

			case 2:
				sexo = "Feminino";
				break;

			case 3:
				sexo = "Outro";
				break;

			}

			System.out.println("\ndigite sua categoria: " + "\n1 – Backend" + "\n2 - Frontend" + "\n3 - Mobile" + "\n4 -Fullstack");
			decisao = sc.nextInt();
			
			
			switch (decisao) {

			case 1:
				categoria = "Backend";
				break;

			case 2:
				categoria = "Frontend";
				break;

			case 3:
				categoria = "Mobile";
				break;
				
			case 4:
				categoria = "Fullstack";
				break;

			}

			
			if(categoria.equalsIgnoreCase("Backend"))
				cond1++;
			if(sexo.equalsIgnoreCase("Feminino") && categoria.equalsIgnoreCase("Frontend"))
				cond2++;
			if(sexo.equalsIgnoreCase("Masculino") && idade > 40 && categoria.equalsIgnoreCase("Mobile"))
				cond3++;
			if(sexo.equalsIgnoreCase("Feminino") && idade < 30 && categoria.equalsIgnoreCase("Fullstack"))
				cond4++;
			
			System.out.println("Idade: " + idade);
			System.out.println("Sexo: " + sexo);
			System.out.println("Categoria: " + categoria);
			
			
			
			System.out.println("Deseja continuar(S/N)?:");
			sc.skip("\\R");
			SN = sc.next();
		
			if (SN.equalsIgnoreCase("n")) {
				continuar = false;
		
			
			}
		}
		System.out.println("Encerrendo programa....");
	}

}
