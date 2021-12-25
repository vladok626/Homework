package project1;

import java.util.Scanner;

public class lesson7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner (System.in);

        while (true) {
            System.out.print("Please enter a number: ");
            int number = scnr.nextInt();
            int result = (number & 56) >> 3;
            System.out.println("Вторая цифра восьмеричного представления числа: " + result);
            }
        }
	}