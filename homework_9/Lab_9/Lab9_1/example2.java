package Lab9_1;

public class example2 {
    public static void main(String[] args) {
        try {
            System.out.println("0"); // печатает "0"
            throw new RuntimeException("Непроверяемая ошибка");
            //System.out.println("1"); - эта часть кода не выполняется
        }
        catch (Exception e) { // исключение перехвачено
            System.out.println("2 "+ e ); // исключение обработано, печатает "2" и исключение
        }
        System.out.println("3"); // печатает "3"
    }
}
