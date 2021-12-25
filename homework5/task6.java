/*Ќапишите программу с классом, в котором есть два закрытых 
целочисленных пол€ (назовем их max и min). «начение пол€ max не может 
быть меньше значени€ пол€ min. «начени€ пол€м присваиваютс€ с помощью 
открытого метода. ћетод может вызыватьс€ с одним или двум€ 
целочисленными аргументами. ѕри вызове метода значени€ пол€м 
присваиваютс€ так: сравниваютс€ текущие значени€ полей и значени€ 
аргументов, переданных методу. —амое большое из значений присваиваетс€ 
полю max, а самое маленькое из значений присваиваетс€ полю min.
ѕредусмотрите конструктор, который работает по тому же принципу, что и 
метод дл€ присваивани€ значений пол€м. ¬ классе также должен быть метод, 
отображающий в консольном окне значени€ полей объекта.
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