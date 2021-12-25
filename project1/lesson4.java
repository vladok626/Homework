package project1;

import java.util.Scanner;

public class lesson4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner (System.in);

        while (true) {
            System.out.print("Please enter a number: ");
            int number = scnr.nextInt();

                if (number % 4 == 0 && number > 10) {
                    System.out.println("Условие выполняется");
                    break;
                }
                else {
                    System.out.println("Условие не выполняется");
                
                }
            }
        }
	}