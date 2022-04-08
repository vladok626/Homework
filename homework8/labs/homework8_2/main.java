package homework8_2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input x:");
        int x = scan.nextInt();
        rec BinaryRec =  new rec(x);
    }
}
