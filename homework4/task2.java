/*Напишите программу, которая выводит в консольное окно 
прямоугольный треугольник;*/

package homework4;

public class task2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int figure = 11; 
			 int i ; 
			 int j ; 
			 int z; 
			 	for (i = 1 ; i <= figure; i++){
			 		System.out.print("номер строки: " + i + " ");
			 		z = 0;
			 			for (j = 0; j < i; j++){
			 				System.out.print("+");
			 				z = z + 1;
			 			}
			 			System.out.println(" Количество символов в строке " + z);
			 	}

		}

	}

