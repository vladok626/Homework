/* Напишите программу с классом, в котором есть закрытое символьное поле 
и три открытых метода. Один из методов позволяет присвоить значение полю. 
Еще один метод при вызове возвращает результатом код символа. Третий 
метод позволяет вывести в консольное окно символ (значение поля) и его код. */

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

