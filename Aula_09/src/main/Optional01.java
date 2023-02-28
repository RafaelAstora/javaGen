package main;

import java.util.Optional;

public class Optional01 {

	public static void main(String[] args) {

		String[] palavras = new String[10];
		palavras [2] ="BANANA";
		Optional<String> checaNulo = Optional.ofNullable(palavras[5]);
		Optional<String> checaNulo2 = Optional.ofNullable(palavras[2]);
		
		
		if(checaNulo.isPresent()) {
		String palavra = palavras[5].toLowerCase();
		System.out.println(palavra);
		}
		else System.out.println("Não tem nada ai bro");
	
	//printa o optional inteiro
	System.out.println(checaNulo);
	System.out.println(checaNulo2);
	//retorna um boleeano se esta vazio ou não
	System.out.println(checaNulo2.isEmpty());
	//apenas o dado do optional
	System.out.println(checaNulo2.get());
	
	
	
	
	
	
	}

}
