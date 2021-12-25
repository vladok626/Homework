/*Напишите программу, в которой создается двумерный 
целочисленный массив. Он заполняется случайными числами. Затем в этом 
массиве строи и столбцы меняются местами: первая строка становится первым 
столбцом, вторая строка становиться вторым столбцом и так далее. Например, 
если исходный массив состоял из 3 строк и 5 столбцов, то в итоге получаем 
массив из 5 строк и 3 столбцов.*/

package homework4;

import java.util.Random;
import java.util.Scanner;

public class task5 {
	
	 public static void main(String[] args) {
		 
		 Scanner id = new Scanner(System.in); 
		 Random random = new Random();  
		 
		 int a = id.nextInt(); // строки
		 int b = id.nextInt(); // столбцы
		 
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
