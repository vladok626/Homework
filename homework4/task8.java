/*�������� ��������� ����� �������, ������� ������������� 
��������� �����. ����������� ������� ������� ��������. ��� ������� 
��������� � ������� ���������� ������� ���������: �������� ����� ��� 
�����������, ����� ����� ������, ���������� ���������: �������� �����. 
����� ���� ��� ������� ��� ������, ���������� ������� ��������������� 
������ � ���������� ������ ����� �������������� : �. ����� ���������� 
������ ������ ������������: ���������� �������� ��������������? (y/n)�, 
���� ������������ ������ �y�, ����� ��������� �������� ��������������. 
���� ������������ ������ �n�, ���� ��������� ������� ��������� ��� 
��������!�. ���� ������������ ������ ���-�� ������, �������� �� �y� ��� �n�, 
�� ��������� ��� ������� ���������: �������� ���������� �����*/

package homework4;

import java.util.Scanner;

public class task8 {
	
	public static void main(String[] args) {
		Scanner id = new Scanner(System.in);
        System.out.print("������� ����� ��� ����������: ");
        String text = id.nextLine();
        System.out.print("������� ����: ");
        int shift = id.nextInt();
        String encryptStr = getEncryptString(text, shift);
        System.out.print("����� ����� �������������� :" + "\"" + encryptStr + "\"");
        System.out.print("\n��������� �������� ��������������? (y/n)");
        boolean value = false;
        while (!value) {
            String reply = id.next();
            if (reply.toLowerCase().equals("y")) {
                String decryptStr = getDecryptString(encryptStr, shift);
                System.out.println(decryptStr);
                value = true;
            }
            else if (reply.toLowerCase().equals("n")) {
                System.out.println("�� ��������!");
                value = true;
            }

            else {
                System.out.println("������� ���������� �����: ");
                value = false;
            }
        }
	}
		 
	 public static String getEncryptString(String encryptString, int shift) {
		
		 char[] ArrayChar = encryptString.toCharArray(); 
		 long[] ArrayInt = new long[ArrayChar.length]; 
		 char[] ArrayCharNew = new char[ArrayChar.length]; 
		 
		 for (int i = 0; i< ArrayChar.length; i++)
		 {
		 ArrayInt[i] = ArrayChar[i] + shift; 
		 ArrayCharNew[i] = (char)ArrayInt[i]; 
		 }
		 encryptString = new String (ArrayCharNew); 
		 return encryptString; 
		 
	 }
	 
	 public static String getDecryptString(String encryptString, int shift) {
			
		 char[] ArrayChar = encryptString.toCharArray(); 
		 long[] ArrayInt = new long[ArrayChar.length]; 
		 char[] ArrayCharNew = new char[ArrayChar.length]; 
		 
		 for (int i = 0; i< ArrayChar.length; i++)
		 {
		 ArrayInt[i] = ArrayChar[i] - shift; 
		 ArrayCharNew[i] = (char)ArrayInt[i]; 
		 }
		 encryptString = new String (ArrayCharNew); 
		 return encryptString; 
		 
	 }
}
