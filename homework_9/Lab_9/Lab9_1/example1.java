package Lab9_1;

public class example1 {
    public static void main(String[] args) {
        try {
            System.out.println("0"); //печатает "0"
            throw new RuntimeException("Непроверяемая ошибка");
        } catch (RuntimeException e) { //исключение перехвачено
            System.out.println("1 "+ e); //исключение обработано, печатает "1" и исключение
        }
        System.out.println("2"); //печатает "2"
    }
}
