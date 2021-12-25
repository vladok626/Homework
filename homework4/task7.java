/*Напишите программу, в которой создается двумерный числовой массив 
и этот массив заполняется «змейкой»: сначала первая строка (слева направо), 
затем последний столбец (снизу вверх), вторая строка (слева направо) и так 
далее.*/

package homework4;

import java.util.Scanner;

public class task7 {
	
	public static void main(String[] args) {
				
		Scanner id = new Scanner(System.in);
		
		int a = id.nextInt(); // строки
		int b = id.nextInt(); // столбцы
        int[][] array = new int[a][b];
 
        int str = 0;
        int col = 0;
        int x = 1;
        int y = 0;
        int c = 0;
        int d = a;
 
        for (int i = 0; i < a * b; i++) {
            array[str][col] = i + 1;
            if (--d == 0) {
                d = a * (c % 2) + 
                    b * ((c + 1) % 2) -
                    (c / 2 - 1) - 2;
                int temp = x;
                x = -y;
                y = temp;
                c++;
            }
            col += x;
            str += y;
        }
        
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) 
                System.out.print(array[i][j] + "\t");
            System.out.println();
        }
    }
}
