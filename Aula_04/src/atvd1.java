import java.util.Scanner;



public class atvd1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		int[] vetor = {2,5,1,3,4,9,7,8,10,6};
		
		System.out.println("Digite o numero que deseja encontrar: ");
		n = sc.nextInt();
		
		for(int i = 0; i< vetor.length;i++){
			if(vetor[i] == n){
				System.out.println("o seu numero esta localizado na " + i+ "ª posição");
				i = vetor.length;
			}	else if(i == vetor.length - 1) {
				
				if(vetor[i] != n)
				System.out.println("O numero "+n+" não foi encontrado!");
			}
			
		}
		
		
	}

}
