/*�������� ���������, � ������� ��������� ��������� 
������������� ������. �� ����������� ���������� �������. ����� � ���� 
������� ����� � ������� �������� �������: ������ ������ ���������� ������ 
��������, ������ ������ ����������� ������ �������� � ��� �����. ��������, 
���� �������� ������ ������� �� 3 ����� � 5 ��������, �� � ����� �������� 
������ �� 5 ����� � 3 ��������.*/

package homework4;

import java.util.Random;
import java.util.Scanner;

public class task5 {
	
	 public static void main(String[] args) {
		 
		 Scanner id = new Scanner(System.in); 
		 Random random = new Random();  
		 
		 int a = id.nextInt(); // ������
		 int b = id.nextInt(); // �������
		 
		 int[][] array = new int[a][b]; 
		 
		 for (int i = 0 ; i <a; i++) {                                   
	            for (int j = 0 ; j <b; j++) {
	                array[i][j] = random.nextInt();          
	                System.out.println("i = "+i+"; j= "+j+"; value= "+ array[i][j]);       
	            }
	        }
		 
		 int[][] newArray = new int[b][a]; 
	        for (int i = 0 ; i <b; i++) {
	            for (int j = 0 ; j <a; j++) {
	                newArray[i][j] = array[j][i]; 
	                System.out.println("i = "+i+";j= "+j+";value= "+ newArray[i][j]);
		 
	            }
	        }
	 }
}
