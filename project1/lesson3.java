package project1;

import java.util.Scanner;

public class lesson3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner (System.in);
		
		 while (true) {
	            System.out.print("Please enter a number: ");
	            int number = scnr.nextInt();

	                if (number % 5 == 2 && number % 7 == 1) {
	                    System.out.println("Условие выполняется");
	                    break;
	                }
	                else {
	                    System.out.println("Условие не выполняется");	                
	                }
		 }
	}

}
