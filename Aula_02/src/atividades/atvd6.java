package atividades;
import java.util.Scanner;
public class atvd6 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	float salario;
	int cargo;
	
	System.out.println("Insira o Salario");
	salario = sc.nextFloat();
	System.out.println("Insira o numero do cargo");
	cargo = sc.nextInt();
	
	
	switch (cargo) {

	case 1:
		System.out.println("Gerente - 10%");
		System.out.println("\nSalario reajustado: R$ " + (salario + salario * 0.10));
		
		break;

	case 2:
		System.out.println("Vendedor - 7%");
		System.out.println("\nSalario reajustado: R$ " + (salario + salario * 0.07));
		break;

	case 3:
		System.out.println("Supervisor - 9%");
		System.out.println("\nSalario reajustado: R$ " + (salario + salario * 0.09));
		break;

	case 4:
		System.out.println("Motorista -  6%");
		System.out.println("\nSalario reajustado: R$ " + (salario + salario * 0.06));
		break;

	case 5:
		System.out.println("Estoquista - 5%");
		System.out.println("\nSalario reajustado: R$ " + (salario + salario * 0.05));
		break;

	case 6:
		System.out.println("Tecnico de TI - 8%");
		System.out.println("\nSalario reajustado: R$ " + (salario + salario * 0.08));
		
		break;
		default:
			System.out.println("Este cargo não existe.");
			System.exit(0);

			
	}
	
	
	}

}
