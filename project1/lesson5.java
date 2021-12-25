package project1;

import java.util.Scanner;

public class lesson5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner (System.in);

        while (true) {
            System.out.print("Please enter a number: ");
            int number = scnr.nextInt();

                if (number >= 5 && number <= 10) {
                    System.out.println("Óñëîâèå âûïîëíÿåòñÿ");
                    break;
                }
                else {
                    System.out.println("Óñëîâèå íå âûïîëíÿåòñÿ");
                
                }
            }
        }
	}