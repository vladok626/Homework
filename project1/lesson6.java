package project1;

import java.util.Scanner;

public class lesson6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner (System.in);

        while (true) {
            System.out.print("Please enter a number: ");
            int number = scnr.nextInt();
            int thousand = number/1000 % 10;
            System.out.println("В этом числе " + thousand + " тысяч");
            }
        }
	}