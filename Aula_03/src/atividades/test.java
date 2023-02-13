package atividades;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		    String name = scan.nextLine();
		    int age = scan.nextInt();
		   
		    boolean firstDonation = scan.nextBoolean();
		    
		    String eligibility = (age >= 18 && age <= 59) || (age >= 60 && age <= 69 && firstDonation) ? "Eligible" : "Not Eligible";
		    
		    System.out.println(name + " is " + eligibility + " to donate blood.");

	}

}
