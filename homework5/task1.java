/* �������� ��������� � �������, � ������� ���� �������� ���������� ���� 
� ��� �������� ������. ���� �� ������� ��������� ��������� �������� ����. 
��� ���� ����� ��� ������ ���������� ����������� ��� �������. ������ 
����� ��������� ������� � ���������� ���� ������ (�������� ����) � ��� ���. */

package homework5;

public class task1 {
	
	public static void main(String[] args) {
        NewClass NewClass1 = new NewClass();
        NewClass1.out();

        NewClass1.Set('A');
        System.out.println("Char code = " + NewClass1.getCode()+"\n");

        NewClass1.out();
    }
}	
	class NewClass {
		
		private char ch;
	
		public void Set(char value) {
		ch=value;
		}
	
		public int getCode() {
		return (int) ch;
		}
	
		public void out() {
		System.out.print("value = " + ch);
		System.out.println("value = " + getCode()+"\n");
		}
	}

