package homework3;
import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner id = new Scanner(System.in);
        System.out.println("������� ����� ��� ������");
        int day = id.nextInt();
        switch(day)
        {
            case 1:
                System.out.println(day + " ���� ������ - �����������");
                break;
            case 2:
                System.out.println(day + " ���� ������ - �������");
                break;
            case 3:
                System.out.println(day + " ���� ������ - �����");
                break;
            case 4:
                System.out.println(day + " ���� ������ - �������");
                break;
            case 5:
                System.out.println(day + " ���� ������ - �������");
                break;
            case 6:
                System.out.println(day + " ���� ������ - �������");
                break;
            case 7:
                System.out.println(day + " ���� ������ - �����������");
                break;
            default:
                System.out.println(day + " - ������������ ��������");
                break;
        }
    }
}

