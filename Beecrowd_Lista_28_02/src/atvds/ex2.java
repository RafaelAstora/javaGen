package atvds;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); 
        int b = sc.nextInt();  
        int c = sc.nextInt();  
		  
        int menor, meio, maior;
	        if (a <= b && a <= c) {
	            menor = a;
	            if (b <= c) {
	                meio = b;
	                maior = c;
	            } else {
	                meio = c;
	                maior = b;
	            }
	        } else if (b <= a && b <= c) {
	            menor = b;
	            if (a <= c) {
	                meio = a;
	                maior = c;
	            } else {
	                meio = c;
	                maior = a;
	            }
	        } else {
	            menor = c;
	            if (a <= b) {
	                meio = a;
	                maior = b;
	            } else {
	                meio = b;
	                maior = a;
	            }
	        }

	        System.out.println(menor);
	        System.out.println(meio);
	        System.out.println(maior);

	        System.out.println();

	        System.out.println(a);
	        System.out.println(b);
	        System.out.println(c);
	}

}
