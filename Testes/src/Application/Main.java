package Application;

import java.util.Scanner;
public class Main {

	
	public static void main(String[]  args) {
		
		Scanner sc = new Scanner(System.in);
		
		String palavra;
		System.out.println("Escolha uma palavra:");
		palavra = sc.next();
		System.out.print("Sua palavra é: ");
		System.out.print(palavra);
		
		
		
		
		sc.close();
	}
	
	
}
