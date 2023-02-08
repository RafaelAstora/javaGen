package aula_01;
import java.util.Locale;
import java.util.Scanner;
public class Atvd3 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Locale.setDefault(Locale.US);
			
			
			float salarioBruto,adicionalNoturno,horasExtras,descontos,salarioLiquido;
			
			System.out.println("Insira o Salario Bruto:");
			salarioBruto = sc.nextFloat();
			System.out.println("Insira o Adicional Noturno:");
			adicionalNoturno = sc.nextFloat();
			System.out.println("Insira as horas extras:");
			horasExtras = sc.nextFloat();
			System.out.println("Insira os descontos:");
			descontos = sc.nextFloat();
			
			salarioLiquido = salarioBruto+adicionalNoturno+(horasExtras*5)-descontos;
			
			System.out.printf("Salário Liquido: %.2f", salarioLiquido);
	
	
	}
	
	

}
