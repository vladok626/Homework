/*Напишите программу, в которой создается двумерный массив, 
который выводит прямоугольный треугольник*/
package homework4;
import java.util.Scanner;

public class task3 {
	
	public static void main(String[] args) {
		
		 Scanner id = new Scanner(System.in);
		 
		 int height = id.nextInt();
		 int width = id.nextInt(); 
		 int [][] array = new int [height][width];
		 int z = 0;
		 for (int i =0; i < height; i++){
	            for (int j = 0; j <width; j++){
	                array[i][j] = 2;
	            }
		 }
		 for (int i =0; i < height; i++){
	            int count = i+1;
	            System.out.print("номер строки " + count + " : ");
	            for (int j = 0; j <width; j++){
	                System.out.print(array[i][j]+" ");
	                z++;
	            }
	            System.out.println(" Количество символов в строке " + z);
	            z = 0; 
	        }
	}
}
