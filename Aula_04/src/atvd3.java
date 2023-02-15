import java.util.Scanner;

public class atvd3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int[][] matriz = new int[3][3];
		 int soma1=0,soma2=0;
		 
		 //entrada.
		 System.out.println("Coloque os numero de uma matriz quadrada de 3x3");
		 
		 for(int i = 0; i < matriz.length; i++) {
			 for(int j = 0; j < matriz.length; j++)
			 matriz[i][j] = sc.nextInt();
		 }
		
		 //diagonal principal.
		 System.out.print("Elementos da Diagonal Principal:");
		 
		 for(int i = 0; i < matriz.length; i++) {
			 System.out.print(matriz[i][i]+" ");
		 }
		//Diagonal secundária.
		 System.out.print(" \nElementos da Diagonal Secundária ");
		 for(int i = 0; i < matriz.length;i++) {
			 System.out.print(matriz[i][matriz.length - i - 1] + " ");
		 }
		 
		 for (int i = 0; i < 3; i++) {
		      soma1 += matriz[i][i];
		      soma2 += matriz[i][3 - i - 1];
		    }
		 
		 
		 	System.out.println("\n\nA soma da diagonal principal: " + soma1);
		    System.out.println("\nA soma da diagonanal secundária: " + soma2);

			
	}

}
