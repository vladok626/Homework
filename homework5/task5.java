/*�������� ��������� � �������, � �������� ���� �������� ������������� 
����. �������� ���� ������������� � ������� ��������� ������. ������ 
���������� ����� ������������ ����� �����, � ����� ����� ����� ���������� 
��� ����������. ���� ������ ���������� ��� ����������, �� ���� �������� 
������� ��������. ���� ����� ���������� � ������������� ����������, �� 
��� �������� ������������� ����. ������ ���� ���������� ���������� 
������ �������� ��������� 100, �� ��������� ���� ������������� ����� 100. 
������������� � ������ �����������, ������� �������� �� ���� �� �������� 
��� � ����� ��� ������������ �������� ����. ����� � ������ ������ ���� 
�����, ����������� ��������� �������� ����*/

package homework5;

public class task5 {

	public static void main(String[] args) {
		NewClass newClass1 = new NewClass();
		NewClass newClass2 = new NewClass(10);
		NewClass newClass3 = new NewClass(110);
		
		newClass1.validation();
		newClass2.validation();
		newClass3.validation();
	}
	
	static class NewClass {
		
		private int a;
		
		NewClass() {
			set();
		}
		
		NewClass(int a) {
			set(a);
		}
		
		public void set() {
	        a = 0;
	    }

	    public void set(int b) {
	        if (b > 100) {
	            a = 100;
	        } else{
	            a = b;
	        }
	    }
	    public void validation() {
	        if (a > 100) {
	            System.out.println(a + " is invalid");
	        } else{
	            System.out.println(a + " is valid");
	        }
	    }
	}
}
