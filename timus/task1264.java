package timus;
import java.util.Scanner;
import java.io.PrintWriter;

public class task1264 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int a1 = in.nextInt();
		int b1 = in.nextInt();
		int a2 = in.nextInt();
		int b2 = in.nextInt();
		int a3 = in.nextInt();
		int b3 = in.nextInt();
		
		out.println((a1 - a3) + " " + (b1 - b2));
		out.flush();
		
	}
}
