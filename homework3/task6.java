package homework3;
import java.util.Scanner;

public class task6 {
	public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("������� ������ �������");
        if (id.hasNextInt()) {
            int Size = id.nextInt();
            if (Size > 0) {
                System.out.println("������ ������� ����� "+ Size);
                int[] nums = new int[Size];
                int x = 0;
                int i = 0;
                while (x<Size) {
                    i++;
                    if (i%5 == 2) {
                        nums[x] = i;
                        System.out.println("������� ������� ["+x+"] = " + nums[x]);
                        x++;
                    }
                }
            }
            else {
                System.out.println("������������ ���������");      
                   }
        }
        else {
            System.out.println("������������ ���������");
        }
    }

}
