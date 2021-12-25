/*Напишите программу, которая выводить в консольное окно 
прямоугольник, размеры сторон которого, ширина: 23 колонки, высота: 11
строк;*/

package homework4;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int figure = 11; 
		 int i ; 
		 int j ; 
		 int z; 
		 for (i = 1 ; i <= figure; i++){
		 System.out.print("номер строки: " + i + " ");
		 z = 0;
		 for (j = -12; j < figure; j++){
		 System.out.print("+");
		 z = z + 1;
		 }
		 System.out.println(" Количество символов в строке " + z);
		 }

	}

}
