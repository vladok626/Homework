package Calculation;
import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("������� �������� ����������������� �������: ");
		float T = in.nextFloat();
		
		System.out.print("������� �������� ������ �������: ");
		float R = in.nextFloat();
		
		System.out.print("������� ����� �������� �������: ");
		float t = in.nextFloat();
		
		System.out.print("������� ���������� ������� �� ����� ��������: ");
		float s = in.nextFloat();
		
		System.out.print("������� ������� �� ����� ��������: ");
		float p = in.nextFloat();
		
		float dur = (t/s - T);
		float cost = (p/(R*s)-1)*R;
		
		System.out.print("��������� ����������������� �������: " + dur + " �������; " 
		+ "��������� ������� �������: " + cost + " �.�.");
		
	}

}
