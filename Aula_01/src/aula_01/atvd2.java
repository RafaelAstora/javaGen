package aula_01;
import java.util.Scanner;

public class atvd2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	float nota1,nota2,nota3,nota4;
	
	System.out.println("Insira a nota 1:");
	nota1 = sc.nextFloat();
	System.out.println("Insira a nota 2:");
	nota2 = sc.nextFloat();
	System.out.println("Insira a nota 3:");
	nota3 = sc.nextFloat();
	System.out.println("Insira a nota 4:");
	nota4 = sc.nextFloat();
	
	
	
	System.out.println("Média final:" + (nota1+nota2+nota3+nota4)/4);
	
	
	}

}
