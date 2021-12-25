/*Напишите программу с классом, у которого есть два целочисленных поля. 
В классе должны быть описаны конструкторы, позволяющие создавать 
объекты без передачи аргументов, с передачей одного аргумента и с передачей 
двух аргументов*/

package homework5;
import java.util.Scanner;
public class task3 {
	
	public static void main(String[] args) {
		Scanner id = new Scanner(System.in);
        System.out.println("Введите a");
        int a = id.nextInt();
        System.out.println("Введите b");
        int b = id.nextInt();
		Args withoutArg= new Args();
		Args oneArg = new Args(a);
		Args twoArg = new Args(a,b);
		
	}
	
	static class Args {
		private int a,b;
	
		Args() {
			System.out.println("Constructor without arguments");
		}
	
		Args(int a) {
			this.a = a;
			System.out.println("Constructor with one argument");
			System.out.println("a = " + a);
		}
	
		Args(int a, int b){
			this.a = a;
			this.b = b;
			System.out.println("Constructor with two arguments");
			System.out.println("a = " + a + " b = " + b);
		}
	}
}
