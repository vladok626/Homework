package timus;
import java.util.Scanner;
import java.io.PrintWriter;

public class task1877 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int a = in.nextInt();
		int b = in.nextInt();
		
		if(a % 2 == 0 || b % 2!= 0) {
			out.print("yes");
			out.flush();
		}	
		
		else if(a % 2 != 0 || b % 2 == 0) {
			out.print("no");
			out.flush();
		}	
	}
}
