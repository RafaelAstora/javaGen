package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Dividindo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dividendo = 0;
		int divisor = 0;
		boolean loop = true;
		do {

			try {
				System.out.println("dividendo");
				dividendo = sc.nextInt();
				System.out.println("divisor");
				divisor = sc.nextInt();
				
				
				System.out.println("Divisão "+divida(dividendo, divisor));

			} catch (InputMismatchException e) {
				System.err.println("Exceção:" + e);
				sc.skip("\\R?");
				System.err.println("Seu Energumeno, somente numeros!");
			}catch (ArithmeticException e) {
				System.err.println("Exceção:" + e);
				sc.skip("\\R?");
				System.err.println("Seu Energumeno, não divide por 0!");
			}finally {
				System.out.println("Sempre serei executado");
			}
			
			
			
		} while (loop);

	}

	public static int divida(int dividendo, int divisor) {
		if(dividendo / divisor > 5) {
			throw new ArithmeticException("A divisão é maior do que 5");
		}
			
		return dividendo / divisor;

	}

}
