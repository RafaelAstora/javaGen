import java.util.Scanner;

public class atvd2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//entrada
	int[] vetor = new int[10];
	Double media=0.0,soma=0.0;	
	for(int i=0; i<vetor.length;i++) {
		vetor[i] = sc.nextInt();
	}	
	
	//Todos os elementos dos índices ímpares do vetor
	System.out.println("Elementos pares");
	for(int i=0; i<vetor.length;i++) {
		if(vetor[i] % 2 == 0) {
			System.out.print(vetor[i]+" ");
		}
	}	
	
	//Todos os elementos dos índices pares do vetor
	
	System.out.print("\nElementos impares\n");
	for(int i=0; i<vetor.length;i++) {
		if(i % 2 != 0) {
			System.out.print(vetor[i]+" ");
		}
	}	
	
	//soma
	
	for(int i=0; i<vetor.length;i++) {
	soma += vetor[i];
	}	
	System.out.println("Soma de todos os elementos: " + soma);
	
	media = soma/vetor.length;
	
	System.out.println("Media:" + media);
	
	
	
	
	
	

	
	
	}

}
