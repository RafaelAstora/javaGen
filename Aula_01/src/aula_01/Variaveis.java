package aula_01;

import java.text.DecimalFormat;
import java.util.Locale;

public class Variaveis {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		DecimalFormat areas = new DecimalFormat();
		
		int numero = 10;
		Double area = 3.14151617;
		
		
		String nome = "ReBeCa DaMaS";
		System.out.printf(	"O nome da participante é: "+nome.toUpperCase());
		System.out.printf(	"%n%nO nome da participante é: "+nome.toLowerCase() + "%n");
		
		System.out.println(" A area é: " +areas.format(area));
		
		
		for(int i = nome.length() - nome.length(); i != nome.length(); i++) {
			System.out.println(nome.charAt(i)); 
		}
		
		
		
	}

}
