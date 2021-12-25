package homework3;
import java.util.Arrays;

public class task7 {
	public static void main(String[] args) {
        int Size = 10;
        char chars[] = new char[Size]; 
        char i = 's';
        for (int x = 0; x < Size; i--) {
            if (i % 2 == 1) {
                chars[x] = i; 
                System.out.println("Ёлемент массива [" + x + "] = " + chars[x]);
                x++;
            }
        }
        Arrays.sort(chars); 
        for (int x = 0; x < chars.length; x++) {
            System.out.println("Ёлемент массива [" + x + "] после сортировки = " + chars[x]);
        }
    }
}
