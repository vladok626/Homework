package Calculation;
import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("”кажите плановую продолжительность проекта: ");
		float T = in.nextFloat();
		
		System.out.print("”кажите плановый бюджет проекта: ");
		float R = in.nextFloat();
		
		System.out.print("”кажите врем€ проверки проекта: ");
		float t = in.nextFloat();
		
		System.out.print("”кажите готовность проекта во врем€ проверки: ");
		float s = in.nextFloat();
		
		System.out.print("”кажите расходы во врем€ проверки: ");
		float p = in.nextFloat();
		
		float dur = (t/s - T);
		float cost = (p/(R*s)-1)*R;
		
		System.out.print("»зменение продолжительности проекта: " + dur + " мес€цев; " 
		+ "»зменение бюджета проекта: " + cost + " у.е.");
		
	}

}
