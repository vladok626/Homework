package homework3;
import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner id = new Scanner(System.in);
        System.out.println("������� ���� ������");
        String day = id.nextLine();

        WeekDay.IfMethod(day);
        WeekDay.SwitchMethod(day);
    }

    static class WeekDay {

       static void IfMethod(String d) {
            String day = d;
            System.out.println("\n�� ������ ��������� �������� ����������");
            int dayN = 0;
            if (day.equals("�����������")) {
                dayN = 1;
            } else if (day.equals("�������")) {
                dayN = 2;
            } else if (day.equals("�����")) {
                dayN = 3;
            } else if (day.equals("�������")) {
                dayN = 4;
            } else if (day.equals("�������")) {
                dayN = 5;
            } else if (day.equals("�������")) {
                dayN = 6;
            } else if (day.equals("�����������")) {
                dayN = 7;
            } else {
                System.out.println(day + " ������������ �������� ��� ������");
            }
            if (dayN != 0) {
                System.out.printf("%s ��� %s-� ���� ������\n", day, dayN);
            }
            return;
        }

        static void SwitchMethod(String d) {
            System.out.println("\n�� ������ switch");
            String day = d;
            switch (day) {
                case "�����������":
                    System.out.println(day + " ��� 1-�� ���� ������");
                    break;
                case "�������":
                    System.out.println(day + " ��� 2-�� ���� ������");
                    break;
                case "�����":
                    System.out.println(day + " ��� 3-�� ���� ������");
                    break;
                case "�������":
                    System.out.println(day + " ��� 4-�� ���� ������");
                    break;
                case "�������":
                    System.out.println(day + " ��� 5-�� ���� ������");
                    break;
                case "�������":
                    System.out.println(day + " ��� 6-�� ���� ������");
                    break;
                case "�����������":
                    System.out.println(day + " ��� 7-�� ���� ������");
                    break;
                default:
                    System.out.println(day + " ������������ �������� ��� ������");
                    break;
            }
        }

    }
}

