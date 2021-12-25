/*Напишите программу, в которой создается и инициализируется 
двумерный числовой массив. Затем из этого массива удаляется строка и 
столбец (создается новый массив, в котором по сравнению с исходным 
удалена одна строка и один столбец). Индекс удаляемой строки и индекс 
удаляемого столбца определяется с помощью генератора случайных чисел.*/

package homework4;

import java.util.Random;
import java.util.Scanner;

public class task6 {
	
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
		 
		 int deleteString = random.nextInt(a-1); 
		 int deleteColumn = random.nextInt(b-1); 
		 
		 System.out.println("String number = "+(deleteString)+";Column number= "+(deleteColumn));
		
		 int newArray[][] = new int[a-1][b-1];
	        for (int i=0, s = 0; i<a-1; s++) {
	            if (s!=deleteString){
	                for (int j =0, k = 0 ; j <b-1; k++) {
	                    if (k != deleteColumn) {
	                        newArray[i][j] = array[s][k];
	                        System.out.println("i = " + i + ";j= " + j + ";value= " + newArray[i][j]);
	                        j++;
	                    }
	                }
	                i++;
	            }
	        }

	}
}
