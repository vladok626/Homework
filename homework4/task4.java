/*�������� ���������, � ������� ��������� ��������� ������, 
������� ������� ������������� �����������*/

package homework4;

import java.util.Scanner;

public class task4 {
	
	public static void main(String[] args) {
		
		 Scanner id = new Scanner(System.in);
		 
		 int height = id.nextInt(); 
		 int [][] array = new int [height][];
		 int z = 0;
		 for (int i =0; i < array.length; i++){
	            	 int j = i+1;
	                 array[i] = new int[j];
	     }
		 
		 for (int i =0; i < height; i++){
	            for (int j = 0; j < i+1; j++){
	                System.out.print(array[i][j]+" ");
	                array[i][j] = 2;
	            }
	        }
		 
		 for (int i =0; i < height; i++){
	            int count = i+1;
	            System.out.print("����� ������ " + count + " : ");
	            for (int j = 0; j < array[i].length; j++){
	                System.out.print(array[i][j]+" ");
	                z++;
	            }
	            System.out.println(" ���������� �������� � ������ " + z);
	            z = 0; 
		 }
	}
}
		 