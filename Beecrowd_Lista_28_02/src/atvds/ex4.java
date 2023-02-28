package atvds;

import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] n = new int[20];

		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
		}

		for (int i = 0; i < n.length / 2; i++) {
			int temp = n[i];
			n[i] = n[n.length - 1 - i];
			n[n.length - 1 - i] = temp;
		}

		for (int i = 0; i < n.length; i++) {
			System.out.printf("N[%d] = %d\n", i, n[i]);
		}

	}
}
