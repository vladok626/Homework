package homework3;
import java.util.Scanner;

public class task4 {
	 public static void main(String[] args) {
	        Scanner id = new Scanner(System.in);
	        System.out.println("¬введите первое целое число");
	        int x = id.nextInt();
	        System.out.println("¬введите второе целое число");
	        int y = id.nextInt();

	        SortNums.WhileSortNums(x, y);
	        SortNums.ForSortNums(x, y);
	    }

	    static class SortNums {
	        static void WhileSortNums(int x, int y) {
	            System.out.println("\n\nцикл \"while\"");
	            if (x > y) {
	                while (y <= x) {
	                    System.out.printf("%d, ", y);
	                    y++;
	                }
	            }
	            else {
	                while (x <= y) {
	                    System.out.printf("%d, ", x);
	                    x++;
	                }
	            }
	        }

	        static void ForSortNums(int x, int y) {
	            System.out.println("\n\nцикл \"for\"");
	            if (x > y) { 
	                for (int y1 = y; y1 <= x; y1++) {
	                    System.out.printf("%d, ", y1);
	                }
	            } else { 
	                for (int x1 = x; x1 <= y; x1++) {
	                    System.out.printf("%d, ", x1);
	                }
	            }
	        }
	    }
}
