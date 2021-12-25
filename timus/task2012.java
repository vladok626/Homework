package timus;
import java.util.Scanner;
import java.io.PrintWriter;

public class task2012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int a = in.nextInt();
		
		if (a >= 7) {
			
			out.print("YES");
			out.flush();
		}
		
		if (a < 7) {
			
			out.print("NO");
			out.flush();
		}
		
	}

}
