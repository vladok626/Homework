
package project1;

import java.util.Scanner;

public class lesson2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner (System.in);

        while (true) {
            System.out.print("Please enter a number: ");
            int number = scnr.nextInt();

                if (number % 3 == 0) {
                    System.out.println("This number is divisible by 3!");
                    break;
                }
                else {
                    System.out.println("This number is indivisible by 3!");
                
                }
            }
        }
	}