package AtividadesCollections;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class atvd2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		for(int i = 0; i < 10;i++) {
			
			numeros.add(sc.nextInt());
			
		}
		System.out.println("Digite o numero que deseja encontrar:");
		int numero = sc.nextInt();
		
		if(numeros.contains(numero))
		System.out.println("o numero " + numero+" esta na posição: "+numeros.indexOf(numero));
		else {
			System.out.println("o numero "+numero+" não foi encontrado");
		}
		
	}

}
