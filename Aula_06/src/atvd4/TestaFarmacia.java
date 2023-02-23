package atvd4;

import java.util.ArrayList;
import java.util.Scanner;
import atvd4.Medicamento;
public class TestaFarmacia {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		ArrayList<Farmacia> medicamentos = new ArrayList<Farmacia>(); 
		int id, tipo;
		String nome, nomeComercial, foto, fabricante,principioAtivo,fragancia;
		double preco;
		
		do{
		System.out.println("insira o id: ");
		id = sc.nextInt();
		System.out.println("insira o preco: ");
		preco = sc.nextDouble();
		System.out.println("insira o nome: ");
		nome = sc.nextLine();
		System.out.println("insira o nome Comercial: ");
		nomeComercial = sc.nextLine();
		System.out.println("insira o foto: ");
		foto = sc.nextLine();
		System.out.println("insira o fabricante:");
		fabricante = sc.nextLine();
		System.out.println("insira o tipo:"
				+ "\n(1)Medicamento"
				+ "\n(2)Perfumaria");
		tipo = sc.nextInt();

		switch(tipo) {
		case 1 :
			System.out.println("Insira o principio ativo:");
			sc.skip("\\R?");
			principioAtivo = sc.nextLine();
			Medicamento m1 = new Medicamento(id, preco, nome, nomeComercial, foto, fabricante, principioAtivo,tipo);
			m1.visualizar();
			break;
		case 2:
		System.out.println("Insira o principio ativo:");
		sc.skip("\\R?");
		fragancia = sc.nextLine();
		Perfumaria p1 = new Perfumaria(id, preco, nome, nomeComercial, foto, fabricante, fragancia,tipo);		
		p1.visualizar();
		break;
		
		}
		
		
		
		
		

		
		
		
		
	//	medicamentos.add(f1);
		
		for (var med : medicamentos) {
			med.visualizar();
		}

		}while(true);
		
	}

	
	
}
