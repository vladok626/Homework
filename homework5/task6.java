/*�������� ��������� � �������, � ������� ���� ��� �������� 
������������� ���� (������� �� max � min). �������� ���� max �� ����� 
���� ������ �������� ���� min. �������� ����� ������������� � ������� 
��������� ������. ����� ����� ���������� � ����� ��� ����� 
�������������� �����������. ��� ������ ������ �������� ����� 
������������� ���: ������������ ������� �������� ����� � �������� 
����������, ���������� ������. ����� ������� �� �������� ������������� 
���� max, � ����� ��������� �� �������� ������������� ���� min.
������������� �����������, ������� �������� �� ���� �� ��������, ��� � 
����� ��� ������������ �������� �����. � ������ ����� ������ ���� �����, 
������������ � ���������� ���� �������� ����� �������.
*/

package homework5;

public class task6 {
	public static void main(String[] args) {
		task6 newClass1 = new task6(1);
		task6 newClass2 = new task6(2, 3);

		newClass1.description("Constructor with one argument ");
		newClass2.description("Constructor with two arguments ");
    }
	
	private int min, max;

	task6(int x) {
        set(x);
    }

	task6(int x, int y) {
        set(x, y);
    }

    public void set(int x) {
        min = Math.min(min, x);
        max = Math.max(max, x);
    }

    public void set(int x, int y) {
        min = Math.min(min, x);
        min = Math.min(min, y);

        max = Math.max(max, x);
        max = Math.max(max, y);
    }

    public void description(String prefix) {
        System.out.printf("%smin:%d max:%d\n", prefix, min, max);
    }
}