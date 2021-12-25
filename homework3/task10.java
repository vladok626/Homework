package homework3;
import java.util.Random;
import java.util.Scanner;

public class task10 {
	 public static void main(String[] args) {
	        Scanner id = new Scanner(System.in);
	        System.out.println("¬ведите размер массива");
	        int Size = id.nextInt(); 
	        int[] nums = new int[Size]; 
	        Random random = new Random(); 
	        for (int i = 0 ; i < nums.length ; i++ ){
	            nums[i] = random.nextInt(200); 
	            System.out.println("Ёлемент массива ["+i+"] = " + nums[i]);
	        }
	        int n = nums.length;
	        for(int i = 0 ; i < n; i++) {
	            for (int j = i; j < n; j++) {
	                if (nums[j] < nums[i]) {
	                    int tmp = nums[j];
	                    nums[j] = nums[i];
	                    nums[i] = tmp; 
	                }
	            }
	        }
	        for (int i = 0 ; i < nums.length ; i++ ){
	            System.out.println("Ёлемент массива ["+i+"] после сортировки =" + nums[i]);
	        }
	    }
}
